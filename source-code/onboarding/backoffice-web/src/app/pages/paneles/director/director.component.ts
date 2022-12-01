import { Component, OnInit } from "@angular/core";
import {
  ITableColumn,
  ITableEvents,
  ITableRowAction,
  noopTableEvent,
  PaginatedFn,
} from "../../../../@mc4/shared/table/table.model";
import { MatTableDataSource } from "@angular/material/table";
import { IRole, IUser } from "../../../commons/model/security.interface";
import { BehaviorSubject } from "rxjs";
import { UserService } from "../../../commons/services/security/user.service";
import { EntityRegisterDialogComponent } from "../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.component";
import { buildEntityRegisterDialog } from "../../../commons/utils/dialog.util";
import { MatDialog } from "@angular/material/dialog";
import { IEntityRegisterDialog } from "../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.model";
import {
  emailValidatorItem,
  minLengthValidatorItem,
  requiredValidatorItem,
} from "../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.util";
import { RoleService } from "../../../commons/services/security/role.service";
import { UserStatus } from "../../../commons/model/enum.value";
import * as Notiflix from "notiflix";
import { ResourceService } from "../../../commons/services/security/resource.service";
import { resourceCode } from "../../../commons/utils/constants";
import { FormControl, FormGroup } from "@angular/forms";
import { UtilService } from "src/app/commons/services/util.service";
import * as moment from "moment";
import { DateUtil } from "src/app/commons/utils/date.util";
import { CanalOnboardingService } from "../../../commons/services/business/canal-onboarding.service";
import { MunicipioService } from "../../../commons/services/business/municipio.service";
import { ConsultoraService } from "../../../commons/services/business/consultora.service";
import { ChartOptions } from "chart.js";
import { ConsultoraDto } from "../../../commons/model/business.interface";
import { DatePipe } from "@angular/common";
import { fileUtil } from "../../../commons/utils/file.util";

@Component({
  selector: "mc4-director",
  templateUrl: "./director.component.html",
  styleUrls: ["./director.component.scss"],
})
export class DirectorComponent implements OnInit {
  columns: ITableColumn[];
  rowActions: ITableRowAction[] = [];
  commonTableActions: any;
  form: FormGroup;
  showDataTable = false;
  dataSource: MatTableDataSource<ConsultoraDto>;
  tableEvents = new BehaviorSubject<ITableEvents>(noopTableEvent());
  directorActions: { [key: string]: boolean } = {};

  onboardingChannelList: any[];
  cityList: any[];
  consultantTypeList: any[] = [];

  constructor(
    private consultoraService: ConsultoraService,
    private canalOnboardingService: CanalOnboardingService,
    private municipioService: MunicipioService,
    private resourceService: ResourceService,
    private matDialog: MatDialog,
    private datePipe: DatePipe
  ) {
    this.form = new FormGroup({
      fechaRegistroDesde: new FormControl(
        moment().subtract(30, "days").toDate()
      ),
      fechaRegistroHasta: new FormControl(moment().toDate()),
      onboardingChannel: new FormControl(""),
      consultantType: new FormControl(""),
      city: new FormControl(""),
      q: new FormControl(""),
    });

    this.commonTableActions = {
      createCode: "100",
      updateCode: "101",
      deleteCode: "102",
      disbleCode: "103",
    };
    this.columns = this.buildTableColumns();
    this.dataSource = new MatTableDataSource<ConsultoraDto>();
  }

  ngOnInit(): void {
    this.consultantTypeList = [
      {
        code: "PROSPECTO",
        tag: "Prospectos",
      },
      {
        code: "CONTADO",
        tag: "Consultoras/res al contado",
      },
      {
        code: "CREDITO",
        tag: "Consultoras/res al credito",
      },
    ];

    this.canalOnboardingService
      .requestCanalOnboardingSimpleList()
      .subscribe({ next: this.successCanalOnboardingList });

    this.municipioService
      .requestMunicipioListByRegion(97)
      .subscribe({ next: this.sucessMunicipioList });

    this.tableEvents.subscribe(this.tableActionManager);
    this.resourceService
      .requestActionList(resourceCode.userResourceCode)
      .subscribe({ next: this.successActionList });

    this.applyFilter();
  }

  protected successCanalOnboardingList = (data: any) => {
    this.onboardingChannelList = data;
  };
  protected sucessMunicipioList = (data: any) => {
    this.cityList = data;
  };

  requestConsultorasByDirectoraListFn: PaginatedFn = (queryParams: any) =>
    this.consultoraService.requestConsultorasList(queryParams);

  public globalFilterText: String = "";
  filterData(filter: string) {
    this.globalFilterText = filter;
    const aditionalParams = { ...this.form.value };
    aditionalParams.fechaRegistroDesde = moment(
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

    console.log(aditionalParams);
    this.tableEvents.next({ event: "RESET", data: { aditionalParams } });
  }

  protected successActionList = (data: any) => {
    this.directorActions = data;
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

  itemLogFormatterFn = (content: ConsultoraDto[]): ConsultoraDto[] => {
    return content.map((item) => {
      console.log(item);
      if (item.fechaRegistro) {
        item.fechaRegistro = this.datePipe.transform(
          item.fechaRegistro,
          DateUtil.buildFullDatePipeFormat()
        );
      }

      item.contactado = item.contactado ? "SI" : "NO";
      return item;
    });
  };
  protected buildTableColumns = (): ITableColumn[] => [
    {
      name: "Fecha Registro",
      property: "fechaRegistro",
      //sortProperty: "registerDate",
      visible: true,
      isModelProperty: true,
      isSort: true,
      width: "150px",
    },
    {
      name: "Canal",
      property: "canal",
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
      name: "Ciudad/Localidad",
      property: "ciudadLocalidad",
      visible: true,
      isModelProperty: true,
      isSort: true,
      width: "150px",
    },
    {
      name: "Tiempo espera",
      property: "tiempoEspera",
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
      name: "Contactado/a",
      property: "contactado",
      visible: true,
      isModelProperty: true,
      width: "50px",
    },
  ];

  protected buildRowActions = (): ITableRowAction[] => {
    const actions = [];
    if (this.directorActions.updateAction)
      actions.push({
        action: "Actualizar",
        actionCode: this.commonTableActions.updateCode,
        icon: "edit",
      });
    if (this.directorActions.deleteAction)
      actions.push({
        action: "Eliminar",
        actionCode: this.commonTableActions.deleteCode,
        icon: "delete",
      });
    if (this.directorActions.enableDisableAction)
      actions.push({
        action: "Habilitar/Inhabilitar",
        actionCode: this.commonTableActions.disbleCode,
        icon: "block",
      });
    return actions;
  };

  applyFilter() {
    const aditionalParams = { ...this.form.value };
    aditionalParams.fechaRegistroDesde = moment(
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

    console.log(aditionalParams);
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
