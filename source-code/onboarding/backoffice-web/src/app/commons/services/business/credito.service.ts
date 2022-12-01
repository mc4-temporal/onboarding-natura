import { Injectable, Pipe } from "@angular/core";
import { HttpClient, HttpParams } from "@angular/common/http";
import { SolicitudCreditoDto } from "../../model/business.interface";
import { Observable, of } from "rxjs";
import { environment } from "src/environments/environment";
import { ApiResponse } from "../../model/api-response";
import { mapResponseApi } from "../../utils/http.util";
import { Paginator } from "../../utils/paginator";
import { defaultIfEmpty, map } from "rxjs/operators";

@Injectable({
  providedIn: "root",
})
export class CreditoService {
  constructor(private http: HttpClient) {}

  requestSolicitudesCreditoList(
    queryParams: any
  ): Observable<Paginator<SolicitudCreditoDto>> {
    const fakeData = {
      code: "000",
      message: "Solicitud finalizada con exito",
      data: {
        content: [
          {
            id: 105,
            fechaSolicitud: "2022-12-01T18:55:23.368+00:00",
            codigoConsultora: "ADSAD21212",
            nombreCompleto: "Consultora B Apellido B",
            nroDocumento: "7841515",
            telefono: "64582155",
            correo: "algo@example.com",
            gerencia: "General",
            directoraAsignada: "Lucia Perez",
            estado: "En curso",
          },
          {
            id: 104,
            fechaSolicitud: "2022-12-01T18:55:23.353+00:00",
            codigoConsultora: "PDSA2121",
            nombreCompleto: "Consultora A Apellido A",
            nroDocumento: "1234567",
            telefono: "77282728",
            correo: "xyz.c@sa.com",
            gerencia: "General",
            directoraAsignada: "Lucia Perez",
            estado: "En curso",
          },
        ],
        pageable: {
          sort: {
            empty: false,
            sorted: true,
            unsorted: false,
          },
          offset: 0,
          pageNumber: 0,
          pageSize: 5,
          paged: true,
          unpaged: false,
        },
        last: true,
        totalPages: 1,
        totalElements: 2,
        sort: {
          empty: false,
          sorted: true,
          unsorted: false,
        },
        first: true,
        numberOfElements: 2,
        size: 5,
        number: 0,
        empty: false,
      },
    };

    const exampleOne = of()
      .pipe(defaultIfEmpty<ApiResponse<Paginator<SolicitudCreditoDto>>>(null))
      .pipe(
        map((resp) =>
          mapResponseApi<Paginator<SolicitudCreditoDto>>(null, resp)
        )
      );
    return exampleOne;
    /*const params: HttpParams = new HttpParams().appendAll(queryParams);
    const url = environment.api + environment.backendV2.solicitudCreditoApi;
    return this.http
      .get<ApiResponse<Paginator<SolicitudCreditoDto>>>(url, { params })
      .pipe(
        map((resp) => mapResponseApi<Paginator<SolicitudCreditoDto>>(url, resp))
      );*/
  }
}
