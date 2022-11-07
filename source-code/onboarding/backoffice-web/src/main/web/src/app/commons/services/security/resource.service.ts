import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {IAction, IResource} from '../../model/security.interface';
import {environment} from '../../../../environments/environment';
import {ApiResponse} from '../../model/api-response';
import {map} from 'rxjs/operators';
import {mapResponseApi} from '../../utils/http.util';


@Injectable({
  providedIn: 'root'
})
export class ResourceService {

  constructor(private http: HttpClient) {}

  requestAllResourceList(): Observable<IResource[]> {
    const url = environment.api + environment.backendV2.resourceApi;
    return this.http.get<ApiResponse<IResource[]>>(url)
      .pipe(map((resp) => mapResponseApi<IResource[]>(url, resp)));
  }

  requestActionList(frontendCode: string): Observable<any> {
    const url = environment.api + environment.backendV2.resourceApi + `/actions-by-user?frontendCode=${frontendCode}`;
    return this.http.get<ApiResponse<any>>(url)
      .pipe(map((resp) => mapResponseApi<any>(url, resp)));
  }
}
