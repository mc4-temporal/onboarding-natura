import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {Observable, of} from 'rxjs';
import {environment} from '../../../../environments/environment';
import {ApiResponse} from '../../model/api-response';
import {map} from 'rxjs/operators';
import {mapResponseApi} from '../../utils/http.util';
import {IJob, IJobHistory} from '../../model/configuracion.interface';
import {Paginator} from '../../utils/paginator';


@Injectable({
  providedIn: 'root'
})
export class JobService {

  constructor(private http: HttpClient) {}

  requestJobList(): Observable<IJob[]> {
    const url = environment.api + `/api/scheduler`;
    return this.http.get<ApiResponse<IJob[]>>(url)
      .pipe(map((resp) => mapResponseApi<IJob[]>(url, resp)));
  }

  requestJobHistoryList(queryParams: any): Observable<Paginator<IJobHistory[]>> {
    const params: HttpParams = new HttpParams().appendAll(queryParams);
    const url = environment.api + `/api/scheduler/history`;
    return this.http.get<ApiResponse<Paginator<IJobHistory[]>>>(url, {params})
      .pipe(map((resp) => mapResponseApi<Paginator<IJobHistory[]>>(url, resp)));
  }

  requestRepairJobs(): Observable<any> {
    const url = environment.api + `/api/scheduler/repair`;
    return this.http.put<ApiResponse<any>>(url, null)
      .pipe(map((resp) => mapResponseApi<any>(url, resp)));
  }

  requestPauseJob(groupName: string, jobName: string): Observable<any> {
    const params: HttpParams = new HttpParams().appendAll({groupName, jobName});
    const url = environment.api + `/api/scheduler/pause`;
    return this.http.post<ApiResponse<any>>(url, null, {params})
      .pipe(map((resp) => mapResponseApi<any>(url, resp)));
  }

  requestRestartJob(groupName: string, jobName: string): Observable<any> {
    const params: HttpParams = new HttpParams().appendAll({groupName, jobName});
    const url = environment.api + `/api/scheduler/resume`;
    return this.http.post<ApiResponse<any>>(url, null, {params})
      .pipe(map((resp) => mapResponseApi<any>(url, resp)));
  }

  requestExecNowJob(groupName: string, jobName: string): Observable<any> {
    const params: HttpParams = new HttpParams().appendAll({groupName, jobName});
    const url = environment.api + `/api/scheduler/start-now`;
    return this.http.post<ApiResponse<any>>(url, null, {params})
      .pipe(map((resp) => mapResponseApi<any>(url, resp)));
  }

  requestDeleteJob(groupName: string, jobName: string): Observable<any> {
    const params: HttpParams = new HttpParams().appendAll({groupName, jobName});
    const url = environment.api + `/api/scheduler/delete`;
    return this.http.delete<ApiResponse<any>>(url, {params})
      .pipe(map((resp) => mapResponseApi<any>(url, resp)));
  }
}
