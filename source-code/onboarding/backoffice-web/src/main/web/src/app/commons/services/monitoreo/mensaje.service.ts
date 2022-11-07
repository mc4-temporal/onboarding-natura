import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Paginator} from '../../utils/paginator';
import {environment} from '../../../../environments/environment';
import {ApiResponse} from '../../model/api-response';
import {map} from 'rxjs/operators';
import {mapResponseApi} from '../../utils/http.util';
import {IParticipante, IParticipanteReq, IParticipanteResp} from '../../model/configuracion.interface';
import {IMensaje} from '../../model/monitoreo.interface';

@Injectable({
  providedIn: 'root'
})
export class MensajeService {
  constructor(private http: HttpClient) {}

  requestMensajeList(queryParams: any): Observable<Paginator<IMensaje>> {
    const params: HttpParams = new HttpParams().appendAll(queryParams);
    const url = environment.apiClient + environment.backend.mensajeApi + '/list-by-filters';
    return this.http.get<ApiResponse<Paginator<IMensaje>>>(url, {params})
      .pipe(map((resp) => mapResponseApi<Paginator<IMensaje>>(url, resp)));
  }
}
