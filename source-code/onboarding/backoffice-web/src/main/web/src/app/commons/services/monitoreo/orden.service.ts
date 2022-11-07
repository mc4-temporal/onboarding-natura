import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Paginator} from '../../utils/paginator';
import {IMensaje, IOrdenResp} from '../../model/monitoreo.interface';
import {environment} from '../../../../environments/environment';
import {ApiResponse} from '../../model/api-response';
import {map} from 'rxjs/operators';
import {mapResponseApi} from '../../utils/http.util';

@Injectable({
  providedIn: 'root'
})
export class OrdenService {
  constructor(private http: HttpClient) {
  }

  requestOrdenList(queryParams: any): Observable<Paginator<IOrdenResp>> {
    const params: HttpParams = new HttpParams().appendAll(queryParams);
    const url = environment.apiClient + environment.backend.ordenApi + '/list-by-filters';
    return this.http.get<ApiResponse<Paginator<IOrdenResp>>>(url, {params})
      .pipe(map((resp) => mapResponseApi<Paginator<IOrdenResp>>(url, resp)));
  }

  requestOrdenMensajeList(ordenId: number): Observable<IMensaje[]> {
    const url = environment.apiClient + environment.backend.ordenApi + `/${ordenId}/messages`;
    return this.http.get<ApiResponse<IMensaje[]>>(url)
      .pipe(map((resp) => mapResponseApi<IMensaje[]>(url, resp)));
  }
}
