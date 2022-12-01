import {Injectable} from '@angular/core';
import {HttpErrorResponse, HttpEvent, HttpHandler, HttpInterceptor, HttpRequest, HttpStatusCode} from '@angular/common/http';
import {Observable, throwError} from 'rxjs';
import {catchError} from 'rxjs/operators';
import {defaultHttpError} from '../utils/http.util';
import * as Notiflix from 'notiflix';
import {SecureStorageService} from '../../../@mc4/services/secure-storage.service';
import {Router} from '@angular/router';
import {ErrorResponse} from '../model/error-response';
import {Loading} from 'notiflix';

@Injectable()
export class ErrorInterceptor implements HttpInterceptor {

  constructor(private storageService: SecureStorageService,
              private router: Router) {
  }

  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    return next.handle(req).pipe(catchError((errorReponse: HttpErrorResponse) => {
      Loading.remove();
      switch (errorReponse.status) {
        case 0:
          Notiflix.Report.failure(
            'Servicio no disponible',
            'No se pudo establecer la conexión con el servidor, por favor comuniquese con el administrador.',
            'Ok'
          );
          return throwError(errorReponse.error);
        case HttpStatusCode.Unauthorized:
          Notiflix.Report.failure(
            'Sesión finalizada',
            'El tiempo de sesión ha finalizado, por favor inicie nuevamente.',
            'Ok',
            () => {
              this.storageService.cleanStorage();
              this.router.navigate(['/login'], {replaceUrl: true});
            }
          );
          return throwError(errorReponse.error);
        case HttpStatusCode.NotFound:
          Notiflix.Report.failure(
            'Servicio desconocido',
            `El servicio "${errorReponse.error?.path}" no existe o no se encuentra disponible, por favor comuniquese con el administrador.`,
            'Ok'
          );
          return throwError(errorReponse);
        case HttpStatusCode.InternalServerError:
          const body: ErrorResponse = errorReponse.error;
          Notiflix.Report.failure(
            'Error en el servicio',
            body.message,
            'Ok'
          );
          return throwError(errorReponse);
        case HttpStatusCode.BadRequest:
          const body1: ErrorResponse = errorReponse.error;
          Notiflix.Report.failure(
            'Error en el servicio',
            body1.message,
            'Ok'
          );
          return throwError(errorReponse);
        default:
          const {error} = errorReponse;
          Notiflix.Report.failure(
            error.error ? error.error : 'Servicio no disponible',
            error.message ? error.message : 'No se pudo establecer la conexión con el servidor, por favor comuniquese con el administrador.',
            'Ok'
          );
          return throwError(new HttpErrorResponse({
            error: defaultHttpError(errorReponse.url, 'Desconocido', 'Ocurrió un error inesperado'),
            url: errorReponse.url,
            status: 0,
            headers: errorReponse.headers,
            statusText: errorReponse.statusText
          }));
      }
    }));
  }

}
