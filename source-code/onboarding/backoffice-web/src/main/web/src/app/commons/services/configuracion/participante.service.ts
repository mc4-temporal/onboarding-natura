import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Paginator} from '../../utils/paginator';
import {environment} from '../../../../environments/environment';
import {ApiResponse} from '../../model/api-response';
import {map} from 'rxjs/operators';
import {mapResponseApi} from '../../utils/http.util';
import {IParticipante, IParticipanteReq, IParticipanteResp, ITechnicalData} from '../../model/configuracion.interface';

@Injectable({
  providedIn: 'root'
})
export class ParticipanteService {
  constructor(private http: HttpClient) {}

  requestParticipanteLis(queryParams: any): Observable<Paginator<IParticipante>> {
    const params: HttpParams = new HttpParams().appendAll(queryParams);
    const url = environment.apiClient + environment.backend.participanteApi + '/list-pageable';
    return this.http.get<ApiResponse<Paginator<IParticipante>>>(url, {params})
      .pipe(map((resp) => mapResponseApi<Paginator<IParticipante>>(url, resp)));
  }

  requestCreateParticipante(body: IParticipanteReq): Observable<IParticipanteResp> {
    const url = environment.apiClient + environment.backend.participanteApi + '/add-participant';
    return this.http.post<ApiResponse<IParticipanteResp>>(url, body)
      .pipe(map((resp) => mapResponseApi<IParticipanteResp>(url, resp)));
  }

  requestParticipanteOriginadorList(): Observable<IParticipante[]> {
    const url = environment.api + environment.backend.participanteApi + '/list-originator-participant';
    return this.http.get<ApiResponse<IParticipante[]>>(url)
      .pipe(map((resp) => mapResponseApi<IParticipante[]>(url, resp)));
  }

  requestParticipanteReceptorList(): Observable<IParticipante[]> {
    const url = environment.api + environment.backend.participanteApi + '/list-recipient-participant';
    return this.http.get<ApiResponse<IParticipante[]>>(url)
      .pipe(map((resp) => mapResponseApi<IParticipante[]>(url, resp)));
  }

  requestGetTechnicalData(participanteId: number): Observable<ITechnicalData> {
    const params = new HttpParams().appendAll({participanteId});
    const url = environment.api + environment.backend.participanteApi + '/technical-data';
    return this.http.get<ApiResponse<ITechnicalData>>(url, {params})
      .pipe(map((resp) => mapResponseApi<ITechnicalData>(url, resp)));
  }

  requestAddTechnicalData(participanteId: number, data: ITechnicalData): Observable<void> {
    const params = new HttpParams().appendAll({participanteId});
    const url = environment.api + environment.backend.participanteApi + '/add-technical-data';
    return this.http.post<ApiResponse<void>>(url, data, {params})
      .pipe(map((resp) => mapResponseApi<void>(url, resp)));
  }

  requestUpdateTechnicalData(technicalDataId: number, data: ITechnicalData): Observable<void> {
    const params = new HttpParams().appendAll({technicalDataId});
    const url = environment.api + environment.backend.participanteApi + '/update-technical-data';
    return this.http.put<ApiResponse<void>>(url, data, {params})
      .pipe(map((resp) => mapResponseApi<void>(url, resp)));
  }

  requestTestTechnicalData(data: ITechnicalData): Observable<any> {
    const url = environment.api + environment.backend.participanteApi + '/test-technical-data';
    return this.http.post<ApiResponse<any>>(url, data)
      .pipe(map((resp) => mapResponseApi<any>(url, resp)));
  }
}
