import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {environment} from '../../../../environments/environment';
import {ApiResponse} from '../../model/api-response';
import {map} from 'rxjs/operators';
import {mapResponseApi} from '../../utils/http.util';
import {GenerarOrdenQrReq, TransferReq} from '../../model/business.interface';

@Injectable({
  providedIn: 'root'
})
export class BusinessService {

  constructor(private http: HttpClient) {
  }

  requestTransferSync(body: TransferReq): Observable<any> {
    const url = environment.api + environment.backend.businessApi + '/transfer-sync';
    return this.http.post<ApiResponse<any>>(url, body)
      .pipe(map((resp) => mapResponseApi<any>(url, resp)));
  }

  requestTransferAsync(body: TransferReq): Observable<any> {
    const url = environment.api + environment.backend.businessApi + '/transfer-async';
    return this.http.post<ApiResponse<any>>(url, body)
      .pipe(map((resp) => mapResponseApi<any>(url, resp)));
  }

  requestGenerarOrdenQr(body: GenerarOrdenQrReq): Observable<string> {
    const url = environment.api + environment.backend.businessApi + '/generate-qr';
    return this.http.post<ApiResponse<string>>(url, body)
      .pipe(map((resp) => mapResponseApi<string>(url, resp)));
  }
}
