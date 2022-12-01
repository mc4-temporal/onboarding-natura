import { HttpClient, HttpParams } from "@angular/common/http";
import { Injectable } from "@angular/core";

import { Observable } from "rxjs";
import { map } from "rxjs/operators";
import { environment } from "src/environments/environment";
import { ApiResponse } from "../../model/api-response";
import {
  CanalOnboardingDto,
  GerenciaDto,
} from "../../model/business.interface";
import { mapResponseApi } from "../../utils/http.util";

@Injectable({
  providedIn: "root",
})
export class GerenciaService {
  constructor(private http: HttpClient) {}

  requestGerenciaSimpleList(): Observable<GerenciaDto[]> {
    const params: HttpParams = new HttpParams();
    const url = environment.api + environment.backendV2.gerenciaApi;
    return this.http
      .get<ApiResponse<GerenciaDto[]>>(url, { params })
      .pipe(map((resp) => mapResponseApi<GerenciaDto[]>(url, resp)));
  }
}
