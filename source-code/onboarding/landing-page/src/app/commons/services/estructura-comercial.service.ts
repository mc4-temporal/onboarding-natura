import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {Observable} from 'rxjs';
import {environment} from '../../../environments/environment';
import {ApiResponse} from '../model/api-response';
import {map} from 'rxjs/operators';
import {mapResponseApi} from '../utils/http.util';

@Injectable({
  providedIn: 'root'
})
export class EstructuraComercialService {
  constructor(private http: HttpClient) {
  }

  requestDirectorasDisponiblesPorConsultoraList(prospectoId: number): Observable<any[]> {
    const params = new HttpParams().appendAll({prospectoId});
    const url = environment.api + environment.backend.estructuraComApi + '/directoras-disponibles';
    return this.http.get<ApiResponse<any[]>>(url, {params})
      .pipe(map((resp) => mapResponseApi<any[]>(url, resp)));
  }

  requestConsultoraRecomendanteList(prospectoId: number): Observable<any[]> {
    const params = new HttpParams().appendAll({prospectoId});
    const url = environment.api + environment.backend.estructuraComApi + '/consultoras-recomendantes';
    return this.http.get<ApiResponse<any[]>>(url, {params})
      .pipe(map((resp) => mapResponseApi<any[]>(url, resp)));
  }
}
