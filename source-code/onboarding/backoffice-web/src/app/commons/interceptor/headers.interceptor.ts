import {Injectable} from '@angular/core';
import {
  HttpEvent,
  HttpHandler,
  HttpInterceptor,
  HttpRequest,
} from '@angular/common/http';
import {Observable} from 'rxjs';
import {environment} from '../../../environments/environment';
import {authKey} from '../utils/key-storage.util';
import {SecureStorageService} from '../../../@mc4/services/secure-storage.service';
import {OkAuth} from '../model/auth.inteface';
import * as url from 'url';

@Injectable()
export class HeadersInterceptor implements HttpInterceptor {
  constructor(private secureStorage: SecureStorageService) {
  }

  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    request = this.authorization(request);
    if (!(request.body instanceof FormData)) {
      request = this.setCommonHeaders(request);
    } else {
      request = this.formDataHeaders(request);
    }

    return next.handle(request);
  }

  authorization(request: HttpRequest<any>): HttpRequest<any> {
    if (request.url === environment.api + environment.backend.apiLogin) return request;
    const user = this.secureStorage.getStorage<OkAuth>(authKey.userLoginKey);

    if (user && user.token) {
      request = request.clone({
        setHeaders: {
          Authorization: `Bearer ${user.token}`,
        },
      });
    }
    return request;
  }

  private setCommonHeaders = (request: HttpRequest<any>): HttpRequest<any> => {
    return request.clone({
      setHeaders: {
        'Content-type': 'application/json',
        'Accept': 'application/json',
      },
    });
  }

  private formDataHeaders = (request: HttpRequest<any>): HttpRequest<any> => {
    return request;
  }
}
