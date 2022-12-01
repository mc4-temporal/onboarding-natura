import { HttpClient, HttpParams } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { map } from "rxjs/operators";
import { Observable } from "rxjs";
import { environment } from "src/environments/environment";
import { ApiResponse } from "../../model/api-response";
import { IEnumDto } from "../../model/enum.value";
import { mapResponseApi } from "../../utils/http.util";
import { CanalOnboardingDto } from "../../model/business.interface";

@Injectable({
  providedIn: "root",
})
export class CanalOnboardingService {
  constructor(private http: HttpClient) {}

  requestCanalOnboardingSimpleList(): Observable<CanalOnboardingDto[]> {
    const params: HttpParams = new HttpParams();
    const url = environment.api + environment.backendV2.canalOnboardingApi;
    return this.http
      .get<ApiResponse<CanalOnboardingDto[]>>(url, { params })
      .pipe(map((resp) => mapResponseApi<CanalOnboardingDto[]>(url, resp)));
  }
}
