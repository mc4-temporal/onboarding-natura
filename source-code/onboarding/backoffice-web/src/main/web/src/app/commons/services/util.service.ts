import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {Observable} from 'rxjs';
import {environment} from '../../../environments/environment';
import {ApiResponse} from '../model/api-response';
import {map} from 'rxjs/operators';
import {mapResponseApi} from '../utils/http.util';
import {IEnumDto} from '../model/enum.value';

@Injectable({
  providedIn: 'root'
})
export class UtilService {
  constructor(private http: HttpClient) {
  }
  requestEnumAsList(enumName: string): Observable<IEnumDto[]> {
    const params: HttpParams = new HttpParams().appendAll({enum: enumName});
    const url = environment.api + environment.backendV2.utilApi + '/enum-as-list';
    return this.http.get<ApiResponse<IEnumDto[]>>(url, {params})
      .pipe(map((resp) => mapResponseApi<IEnumDto[]>(url, resp)));
  }
}
