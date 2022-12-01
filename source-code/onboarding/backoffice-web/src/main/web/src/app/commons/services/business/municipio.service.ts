import { HttpClient, HttpParams } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { map } from "rxjs/operators";
import { Observable } from "rxjs";
import { environment } from "src/environments/environment";
import { ApiResponse } from "../../model/api-response";
import { MunicipioDto } from "../../model/business.interface";
import { mapResponseApi } from "../../utils/http.util";

@Injectable({
  providedIn: "root",
})
export class MunicipioService {
  constructor(private http: HttpClient) {}

  requestMunicipioListByRegion(idRegion: number): Observable<MunicipioDto[]> {
    const params: HttpParams = new HttpParams().appendAll({
      id_region: idRegion,
    });
    const url =
      environment.api +
      environment.backendV2.municipioApi +
      "/filter-by-region";
    return this.http
      .get<ApiResponse<MunicipioDto[]>>(url, { params })
      .pipe(map((resp) => mapResponseApi<MunicipioDto[]>(url, resp)));
  }
}
