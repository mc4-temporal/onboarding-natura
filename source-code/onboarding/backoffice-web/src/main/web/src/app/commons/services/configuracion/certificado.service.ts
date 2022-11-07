import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {Observable} from 'rxjs';
import {environment} from '../../../../environments/environment';
import {ApiResponse} from '../../model/api-response';
import {map} from 'rxjs/operators';
import {mapResponseApi} from '../../utils/http.util';
import {Paginator} from '../../utils/paginator';
import {ICertificado} from '../../model/configuracion.interface';

@Injectable({
  providedIn: 'root'
})
export class CertificadoService {
  constructor(private http: HttpClient) {}

  requestAddCertParticipante(participanteId: number, certificate: any): Observable<any> {
    const params: HttpParams = new HttpParams().appendAll({participanteId});
    const url = environment.apiClient + environment.backend.certificadoApi + '/add-new-cert';
    return this.http.post<ApiResponse<any>>(url, JSON.stringify(certificate), {params})
      .pipe(map((resp) => mapResponseApi<any>(url, resp)));
  }

  requestCertList(queryParams: any): Observable<Paginator<ICertificado>> {
    const params: HttpParams = new HttpParams().appendAll(queryParams);
    const url = environment.apiClient + environment.backend.certificadoApi + '/cert-page';
    return this.http.get<ApiResponse<Paginator<ICertificado>>>(url, {params})
      .pipe(map((resp) => mapResponseApi<Paginator<ICertificado>>(url, resp)));
  }

  requestDownCertFile(idParticipante: number, idCertificado: number): Observable<Blob> {
    const params: HttpParams = new HttpParams().appendAll({idParticipante, idCertificado});
    const url = environment.apiClient + environment.backend.participanteApi + '/download-public-cert';
    return this.http.get(url, {params, responseType: 'blob'});
  }
}
