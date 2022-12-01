import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {Observable} from 'rxjs';
import {environment} from '../../../../environments/environment';
import {ApiResponse} from '../../model/api-response';
import {IUserAccess} from '../../model/security.interface';
import {map} from 'rxjs/operators';
import {mapResponseApi} from '../../utils/http.util';

@Injectable({
  providedIn: 'root'
})
export class DomainService {

  constructor(private http: HttpClient) {}

  requestDomainValueList(domainId: string): Observable<any[]> {
    const params: HttpParams = new HttpParams().appendAll({domainId});
    const url = environment.api + environment.backendV2.domainApi + '/domain-value';
    return this.http.get<ApiResponse<any[]>>(url, {params})
      .pipe(map((resp) => mapResponseApi<any[]>(url, resp)));
  }
}
