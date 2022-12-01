import { HttpClient, HttpParams } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { map } from "rxjs/operators";
import { environment } from "src/environments/environment";
import { ApiResponse } from "../../model/api-response";
import { mapResponseApi } from "../../utils/http.util";
import { Paginator } from "../../utils/paginator";
import {
  ConsultoraDto,
  ConsultoraRequest,
} from "../../model/business.interface";

@Injectable({
  providedIn: "root",
})
export class ConsultoraService {
  constructor(private http: HttpClient) {}

  requestConsultorasList(
    queryParams: any
  ): Observable<Paginator<ConsultoraDto>> {
    const params: HttpParams = new HttpParams().appendAll(queryParams);
    const url =
      environment.api +
      environment.backendV2.consultoraApi +
      "/list-by-filters";
    return this.http
      .get<ApiResponse<Paginator<ConsultoraDto>>>(url, { params })
      .pipe(map((resp) => mapResponseApi<Paginator<ConsultoraDto>>(url, resp)));
  }
}
