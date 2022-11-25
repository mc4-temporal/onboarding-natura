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
export class EstructuraGeograficaService {
  constructor(private http: HttpClient) {
  }

  requestDepartamentoList(): Observable<any[]> {
    const url = environment.api + environment.backend.estructuraGeoApi + '/departamento';
    return this.http.get<ApiResponse<any[]>>(url)
      .pipe(map((resp) => mapResponseApi<any[]>(url, resp)));
  }

  requestMunicipioPorDepartamentoList(codigoDepartamento: number): Observable<any[]> {
    const params = new HttpParams().appendAll({codigoDepartamento});
    const url = environment.api + environment.backend.estructuraGeoApi + '/municipio-por-departamento';
    return this.http.get<ApiResponse<any[]>>(url, {params})
      .pipe(map((resp) => mapResponseApi<any[]>(url, resp)));
  }
}
