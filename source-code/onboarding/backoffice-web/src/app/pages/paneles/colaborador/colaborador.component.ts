import { DatePipe } from "@angular/common";
import { Component, OnInit } from "@angular/core";
import { FormGroup, FormControl } from "@angular/forms";
import { MatDialog } from "@angular/material/dialog";
import { MatTableDataSource } from "@angular/material/table";
import * as moment from "moment";
import { BehaviorSubject, Observable } from "rxjs";
import {
  ITableColumn,
  ITableRowAction,
  ITableEvents,
  noopTableEvent,
  PaginatedFn,
} from "src/@mc4/shared/table/table.model";
import { SolicitudCreditoDto } from "src/app/commons/model/business.interface";
import { ResourceService } from "src/app/commons/services/security/resource.service";
import { resourceCode } from "src/app/commons/utils/constants";
import { DateUtil } from "src/app/commons/utils/date.util";
import { UtilService } from "../../../commons/services/util.service";
import { GerenciaService } from "../../../commons/services/business/gerencia.service";
import { CreditoService } from "../../../commons/services/business/credito.service";
import { Paginator } from "../../../commons/utils/paginator";

@Component({
  selector: "mc4-colaborador",
  templateUrl: "./colaborador.component.html",
  styleUrls: ["./colaborador.component.scss"],
})
export class ColaboradorComponent implements OnInit {
  columns: ITableColumn[];
  rowActions: ITableRowAction[] = [];
  commonTableActions: any;
  form: FormGroup;
  showDataTable = false;
  dataSource: MatTableDataSource<SolicitudCreditoDto>;
  tableEvents = new BehaviorSubject<ITableEvents>(noopTableEvent());
  solicitudCreditoActions: { [key: string]: boolean } = {};

  creditStateList: any[];
  gerencyList: any[];
  creditRequestList: any[] = [];

  constructor(
    private creditService: CreditoService,
    private utilService: UtilService,
    private gerenciaService: GerenciaService,
    private resourceService: ResourceService,
    private matDialog: MatDialog,
    private datePipe: DatePipe
  ) {
    this.form = new FormGroup({
      fechaRegistroDesde: new FormControl(
        moment().subtract(30, "days").toDate()
      ),
      fechaRegistroHasta: new FormControl(moment().toDate()),
      gerency: new FormControl(""),
      creditState: new FormControl(""),
      q: new FormControl(""),
    });

    this.commonTableActions = {
      createCode: "100",
      updateCode: "101",
      deleteCode: "102",
      disbleCode: "103",
    };
    this.columns = this.buildTableColumns();
    this.dataSource = new MatTableDataSource<SolicitudCreditoDto>();
  }

  ngOnInit(): void {
    this.utilService
      .requestEnumAsList("estadoCredito")
      .subscribe({ next: this.successEstadoCreditoList });

    this.gerenciaService
      .requestGerenciaSimpleList()
      .subscribe({ next: this.sucessGerenciaList });

    this.tableEvents.subscribe(this.tableActionManager);
    this.resourceService
      .requestActionList(resourceCode.userResourceCode)
      .subscribe({ next: this.successActionList });

    this.applyFilter();
  }
  protected successEstadoCreditoList = (data: any) => {
    this.creditStateList = data;
  };
  protected sucessGerenciaList = (data: any) => {
    this.gerencyList = data;
  };

  requestSolicitudesCreditoListFn: PaginatedFn = (queryParams: any) =>
    this.creditService.requestSolicitudesCreditoList(queryParams);

  public globalFilterText: String = "";
  filterData(filter: string) {
    this.globalFilterText = filter;
    const aditionalParams = { ...this.form.value };
    /*aditionalParams.fechaRegistroDesde = moment(
      aditionalParams.fechaRegistroDesde
    ).format(DateUtil.buildFullDateMomentFormat("-"));
    aditionalParams.fechaRegistroHasta = moment(
      aditionalParams.fechaRegistroHasta
    ).format(DateUtil.buildFullDateMomentFormat("-"));
    aditionalParams.idCanalOnboarding = aditionalParams.onboardingChannel;
    aditionalParams.idMunicipio = aditionalParams.city;
    aditionalParams.tipoConsultora = aditionalParams.consultantType;
    aditionalParams.idUser = JSON.parse(localStorage.getItem("infoKey")).id;
    aditionalParams.filtroTexto = filter;

    delete aditionalParams.onboardingChannel;
    delete aditionalParams.city;
    delete aditionalParams.consultantType;

    console.log(aditionalParams);*/
    this.tableEvents.next({ event: "RESET", data: { aditionalParams } });
  }

  protected successActionList = (data: any) => {
    this.solicitudCreditoActions = data;
    this.rowActions = this.buildRowActions();
    if (this.rowActions.length === 0)
      this.tableEvents.next({ event: "RELOAD_ACTIONS" });
  };

  protected serviceError = (error: any) => {
    console.error("Error al ejecutar servicio: ", error);
  };

  protected afterRegisterDialog = (result: any, wasUpdate: boolean) => {
    if (result) {
      this.tableEvents.next({ event: wasUpdate ? "RELOAD_PAGE" : "RESET" });
    }
  };

  protected tableActionManager = (event: ITableEvents) => {
    if (event.event === "ROW_CLICK") {
      this.rowActionEvent(event.data);
    }
  };
  protected rowActionEvent = (event: { item: any; actionCode: string }) => {
    const { item, actionCode } = event;
    /*if (actionCode === this.commonTableActions.updateCode)
      //this.createUpdateUser(item);
    if (actionCode === this.commonTableActions.deleteCode)
      //this.deleteUser(item.id);
    if (actionCode === this.commonTableActions.disbleCode)
      //this.disableOrEnableUser(item);*/
  };

  protected successDisableOrEnableUser = (body: any) => {
    this.tableEvents.next({ event: "RELOAD_PAGE" });
  };

  itemLogFormatterFn = (
    content: SolicitudCreditoDto[]
  ): SolicitudCreditoDto[] => {
    return content.map((item) => {
      console.log(item);
      if (item.fechaSolicitud) {
        item.fechaSolicitud = this.datePipe.transform(
          item.fechaSolicitud,
          DateUtil.buildFullDatePipeFormat()
        );
      }
      return item;
    });
  };
  protected buildTableColumns = (): ITableColumn[] => [
    {
      name: "Fecha Solicitud",
      property: "fechaSolicitud",
      //sortProperty: "registerDate",
      visible: true,
      isModelProperty: true,
      isSort: true,
      width: "150px",
    },
    {
      name: "Cod. Consultora",
      property: "codigoConsultora",
      //sortProperty: "channel",
      visible: true,
      isModelProperty: true,
      isSort: true,
      width: "90px",
    },
    {
      name: "Nombre Completo",
      property: "nombreCompleto",
      visible: true,
      isModelProperty: true,
      isSort: true,
      width: "150px",
    },
    {
      name: "Nro. Documento",
      property: "nroDocumento",
      visible: true,
      isModelProperty: true,
      isSort: true,
      width: "75px",
    },
    {
      name: "Teléf.",
      property: "telefono",
      visible: true,
      isModelProperty: true,
      isSort: true,
      width: "70px",
    },
    {
      name: "Correo",
      property: "correo",
      visible: true,
      isModelProperty: true,
      isSort: true,
      width: "150px",
    },
    {
      name: "Gerencia",
      property: "gerencia",
      visible: true,
      isModelProperty: true,
      isSort: true,
      width: "75px",
    },

    {
      name: "Directora Asignada",
      property: "directoraAsignada",
      visible: true,
      isModelProperty: true,
      width: "100px",
    },
    {
      name: "Estado",
      property: "estado",
      visible: true,
      isModelProperty: true,
      width: "60px",
    },
  ];

  protected buildRowActions = (): ITableRowAction[] => {
    const actions = [];
    if (this.solicitudCreditoActions.updateAction)
      actions.push({
        action: "Actualizar",
        actionCode: this.commonTableActions.updateCode,
        icon: "edit",
      });
    if (this.solicitudCreditoActions.deleteAction)
      actions.push({
        action: "Eliminar",
        actionCode: this.commonTableActions.deleteCode,
        icon: "delete",
      });
    if (this.solicitudCreditoActions.enableDisableAction)
      actions.push({
        action: "Habilitar/Inhabilitar",
        actionCode: this.commonTableActions.disbleCode,
        icon: "block",
      });
    return actions;
  };

  applyFilter() {
    const aditionalParams = { ...this.form.value };
    /*aditionalParams.fechaRegistroDesde = moment(
      aditionalParams.fechaRegistroDesde
    ).format(DateUtil.buildFullDateMomentFormat("-"));
    aditionalParams.fechaRegistroHasta = moment(
      aditionalParams.fechaRegistroHasta
    ).format(DateUtil.buildFullDateMomentFormat("-"));
    aditionalParams.idCanalOnboarding = aditionalParams.onboardingChannel;
    aditionalParams.idMunicipio = aditionalParams.city;
    aditionalParams.tipoConsultora = aditionalParams.consultantType;
    aditionalParams.idUser = JSON.parse(localStorage.getItem("infoKey")).id;
    aditionalParams.filtroTexto = this.globalFilterText;

    delete aditionalParams.onboardingChannel;
    delete aditionalParams.city;
    delete aditionalParams.consultantType;

    console.log(aditionalParams);*/
    this.showDataTable = true;
    this.tableEvents.next({ event: "RESET", data: { aditionalParams } });
  }
  getErrorMessage(): string {
    return "";
    /* if (this.hasError("forbiddenChoice")) {
      return "Invalid choice";
    }
    if (this.formControl.hasError("required")) {
      return "Choice required";
    } */
  }

  createUpdateUser() {}
}
