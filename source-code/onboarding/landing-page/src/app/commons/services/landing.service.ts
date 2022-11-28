import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {Observable} from 'rxjs';
import {environment} from '../../../environments/environment';
import {ApiResponse} from '../model/api-response';
import {map} from 'rxjs/operators';
import {mapResponseApi} from '../utils/http.util';
import {LogRequest, LogType, ProccessType} from '../model/security.interface';

@Injectable({
  providedIn: 'root'
})
export class LandingService {
  constructor(private http: HttpClient) {
  }

  requestSendLog(proccess: ProccessType, level: LogType, body: LogRequest): Observable<boolean> {
    const params = new HttpParams().appendAll({proccess, level});
    const url = environment.api + environment.backend.logApi + '/app-client-error';
    return this.http.post<ApiResponse<boolean>>(url, body, {params})
      .pipe(map((resp) => mapResponseApi<boolean>(url, resp)));
  }

  requestVersion(): Observable<string> {
    const url = environment.api + '/about/version';
    return this.http.get<ApiResponse<string>>(url)
      .pipe(map((resp) => mapResponseApi<string>(url, resp)));
  }

  requestSaveOnboardingInfo(body: any): Observable<any> {
    const url = environment.api + environment.backend.onboardingApi + '/info-personal';
    return this.http.post<ApiResponse<any>>(url, body)
      .pipe(map((resp) => mapResponseApi<any>(url, resp)));
  }

  requestSaveOnboardingAddress(prospectoId: number, body: any): Observable<any> {
    const params = new HttpParams().appendAll({prospectoId});
    const url = environment.api + environment.backend.onboardingApi + '/address';
    return this.http.post<ApiResponse<any>>(url, body, {params})
      .pipe(map((resp) => mapResponseApi<any>(url, resp)));
  }

  requestSaveOnboardingDirectora(prospectoId: number, body: any): Observable<any> {
    const params = new HttpParams().appendAll({prospectoId});
    const url = environment.api + environment.backend.onboardingApi + '/directora-consultora';
    return this.http.post<ApiResponse<any>>(url, body, {params})
      .pipe(map((resp) => mapResponseApi<any>(url, resp)));
  }
}
