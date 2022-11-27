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
  dataSource: MatTableDataSource<IUser>;
  tableEvents = new BehaviorSubject<ITableEvents>(noopTableEvent());
  directorActions: { [key: string]: boolean } = {};

  processList: any[];
  cityList: any[];
  choices: any[] = [];

  constructor(
    private utilService: UtilService,
    private userService: UserService,
    private roleService: RoleService,
    private resourceService: ResourceService,
    private matDialog: MatDialog
  ) {
    this.form = new FormGroup({
      from: new FormControl(moment().subtract(30, "days").toDate()),
      to: new FormControl(moment().toDate()),
      process: new FormControl(""),
      select: new FormControl(""),
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
    this.dataSource = new MatTableDataSource<IUser>();
  }

  ngOnInit(): void {
    this.choices = [
      {
        code: "1",
        tag: "Prospectos",
      },
      {
        code: "2",
        tag: "Consultoras/res al contado",
      },
      {
        code: "3",
        tag: "Consultoras/res al credito",
      },
    ];
    this.processList = [
      {
        codigo: "000",
        descripcion: "Test 1",
      },
    ];
    this.cityList = [
      {
        codigo: "000",
        descripcion: "Santa Cruz",
      },
    ];
    this.tableEvents.subscribe(this.tableActionManager);
    this.resourceService
      .requestActionList(resourceCode.userResourceCode)
      .subscribe({ next: this.successActionList });
  }

  requestUserListFn: PaginatedFn = (queryParams) =>
    this.userService.requestUserList(queryParams);

  filterData(filter: string) {
    const aditionalParams = { filter };
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

  protected buildTableColumns = (): ITableColumn[] => [
    {
      name: "Fecha Registro",
      property: "registerDate",
      //sortProperty: "registerDate",
      visible: true,
      isModelProperty: true,
      isSort: true,
    },
    {
      name: "Canal",
      property: "channel",
      //sortProperty: "channel",
      visible: true,
      isModelProperty: true,
      isSort: true,
    },
    {
      name: "Nombre Completo",
      property: "fullname",
      visible: true,
      isModelProperty: true,
      isSort: true,
    },
    {
      name: "Nro. Documento",
      property: "documentNumber",
      visible: true,
      isModelProperty: true,
      isSort: true,
    },
    {
      name: "Ciudad/Localidad",
      property: "city",
      visible: true,
      isModelProperty: true,
      isSort: true,
    },
    {
      name: "Tiempo espera",
      property: "waitTime",
      visible: true,
      isModelProperty: true,
      isSort: true,
    },
    {
      name: "Teléf.",
      property: "phone",
      visible: true,
      isModelProperty: true,
      isSort: true,
    },
    {
      name: "Contactado/a",
      property: "contacted",
      visible: true,
      isModelProperty: true,
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
    aditionalParams.from = moment(aditionalParams.fechaInicio).format(
      DateUtil.buildFullDateMomentFormat("-")
    );
    aditionalParams.to = moment(aditionalParams.fechaFin).format(
      DateUtil.buildFullDateMomentFormat("-")
    );
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
}
