import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {Observable} from 'rxjs';
import {environment} from '../../../../environments/environment';
import {IPrivilege, IRole, IUserAccess} from '../../model/security.interface';
import {Paginator} from '../../utils/paginator';
import {map} from 'rxjs/operators';
import {ApiResponse} from '../../model/api-response';
import {mapResponseApi} from '../../utils/http.util';

@Injectable({
  providedIn: 'root'
})
export class RoleService {
  constructor(private http: HttpClient) {
  }

  requestRoleList(queryParams: any): Observable<Paginator<IRole>> {
    const params: HttpParams = new HttpParams().appendAll(queryParams);
    const url = environment.api + environment.backendV2.roleApi;
    return this.http.get<ApiResponse<Paginator<IRole>>>(url, {params})
      .pipe(map((resp) => mapResponseApi<Paginator<IRole>>(url, resp)));
  }

  requestCreateRole(body: IRole): Observable<IRole> {
    const url = environment.api + environment.backendV2.roleApi;
    return this.http.post<ApiResponse<IRole>>(url, body)
      .pipe(map((resp) => mapResponseApi<IRole>(url, resp)));
  }

  requestUpdateRole(id: number, body: IRole): Observable<IRole> {
    const url = environment.api + environment.backendV2.roleApi + `/${id}`;
    return this.http.put<ApiResponse<IRole>>(url, body)
      .pipe(map((resp) => mapResponseApi<IRole>(url, resp)));
  }

  requestDeleteRole(roleId: number): Observable<boolean> {
    const url = environment.api + environment.backendV2.roleApi + `/${roleId}`;
    return this.http.delete<ApiResponse<boolean>>(url)
      .pipe(map((resp) => mapResponseApi<boolean>(url, resp)));
  }

  requestDisableRole(roleId: number, state: string): Observable<boolean> {
    const params: HttpParams = new HttpParams().appendAll({roleId, state});
    const url = environment.api + environment.backendV2.roleApi + '/update-state';
    return this.http.put<ApiResponse<boolean>>(url, null, {params})
      .pipe(map((resp) => mapResponseApi<boolean>(url, resp)));
  }

  requestFindResourceByRole(roleId: number): Observable<IUserAccess[]> {
    const params: HttpParams = new HttpParams().appendAll({roleId});
    const url = environment.api + environment.backendV2.roleApi + '/access-list';
    return this.http.get<ApiResponse<IUserAccess[]>>(url, {params})
      .pipe(map((resp) => mapResponseApi<IUserAccess[]>(url, resp)));
  }

  requestConfigurePrivileges(roleId: number, resourceId: number, dataList: IPrivilege[]): Observable<boolean>  {
    const params: HttpParams = new HttpParams().appendAll({roleId, resourceId});
    const url = environment.api + environment.backendV2.roleApi + '/configure-privileges';
    return this.http.post<ApiResponse<boolean>>(url, JSON.stringify(dataList), {params})
      .pipe(map((resp) => mapResponseApi<boolean>(url, resp)));
  }
}
