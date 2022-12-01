import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {Observable} from 'rxjs';
import {SidenavItem} from '../../../layout/sidenav/sidenav-item/sidenav-item.interface';
import {ApiResponse} from '../../model/api-response';
import {environment} from '../../../../environments/environment';
import {Paginator} from '../../utils/paginator';
import {IRole, IUser} from '../../model/security.interface';
import {map} from 'rxjs/operators';
import {mapResponseApi} from '../../utils/http.util';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  constructor(private http: HttpClient) {
  }

  requestUserResourceList(): Observable<ApiResponse<SidenavItem[]>> {
    return this.http.get<ApiResponse<SidenavItem[]>>(environment.api + environment.backendV2.userApi + '/user-resource-list');
  }

  requestUserList(queryParams: any): Observable<Paginator<IUser>> {
    const params: HttpParams = new HttpParams().appendAll(queryParams);
    const url = environment.api + environment.backendV2.userApi;
    return this.http.get<ApiResponse<Paginator<IUser>>>(url, {params})
      .pipe(map((resp) => mapResponseApi<Paginator<IUser>>(url, resp)));
  }

  requestCreateUser(body: IUser): Observable<IUser> {
    const url = environment.api + environment.backendV2.userApi;
    return this.http.post<ApiResponse<IUser>>(url, body)
      .pipe(map((resp) => mapResponseApi<IUser>(url, resp)));
  }

  requestUpdateUser(id: number, body: IUser): Observable<IUser> {
    const url = environment.api + environment.backendV2.userApi + `/${id}`;
    return this.http.put<ApiResponse<IUser>>(url, body)
      .pipe(map((resp) => mapResponseApi<IUser>(url, resp)));
  }

  requestDeleteUser(userId: number): Observable<boolean> {
    const url = environment.api + environment.backendV2.userApi + `/${userId}`;
    return this.http.delete<ApiResponse<boolean>>(url)
      .pipe(map((resp) => mapResponseApi<boolean>(url, resp)));
  }

  requestDisableUser(userId: number, userStatus: string): Observable<boolean> {
    const params: HttpParams = new HttpParams().appendAll({userId, userStatus});
    const url = environment.api + environment.backendV2.userApi + '/update-state';
    return this.http.put<ApiResponse<boolean>>(url, null, {params})
      .pipe(map((resp) => mapResponseApi<boolean>(url, resp)));
  }

  requestUserInfo(): Observable<IUser> {
    const url = environment.api + environment.backendV2.userApi + '/user-info';
    return this.http.get<ApiResponse<IUser>>(url)
      .pipe(map((resp) => mapResponseApi<IUser>(url, resp)));
  }

  requestHistorialSesionList(queryParams: any): Observable<Paginator<any>> {
    const params: HttpParams = new HttpParams().appendAll(queryParams);
    const url = environment.api + environment.backendV2.userApi + '/log-sesiones';
    return this.http.get<ApiResponse<Paginator<any>>>(url, {params})
      .pipe(map((resp) => mapResponseApi<Paginator<any>>(url, resp)));
  }

  requestChangePass(body: any): Observable<IUser> {
    const url = environment.api + environment.backend.apiChangePass;
    return this.http.post<ApiResponse<any>>(url, body)
      .pipe(map((resp) => mapResponseApi<any>(url, resp)));
  }

  requestVersion(): Observable<string> {
    const url = environment.api + '/about/version';
    return this.http.get<ApiResponse<string>>(url)
      .pipe(map((resp) => mapResponseApi<string>(url, resp)));
  }
}
