import {Component, OnInit} from '@angular/core';
import {RoleService} from '../../../commons/services/security/role.service';
import {MatTableDataSource} from '@angular/material/table';
import {IRole} from '../../../commons/model/security.interface';
import {ITableColumn, ITableEvents, ITableRowAction, noopTableEvent, PaginatedFn} from '../../../../@mc4/shared/table/table.model';
import {MatDialog} from '@angular/material/dialog';
import {EntityRegisterDialogComponent} from '../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.component';
import {IEntityRegisterDialog} from '../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.model';
import {buildEntityRegisterDialog} from '../../../commons/utils/dialog.util';
import {BehaviorSubject} from 'rxjs';
import {UserStatus} from '../../../commons/model/enum.value';
import {minLengthValidatorItem, requiredValidatorItem} from '../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.util';
import * as Notiflix from 'notiflix';
import {resourceCode} from '../../../commons/utils/constants';
import {ResourceService} from '../../../commons/services/security/resource.service';


@Component({
  selector: 'mc4-role',
  templateUrl: './role.component.html',
  styleUrls: ['./role.component.scss']
})
export class RoleComponent implements OnInit {
  columns: ITableColumn[];
  rowActions: ITableRowAction[] = [];
  commonTableActions: any;
  dataSource: MatTableDataSource<IRole>;
  tableEvents = new BehaviorSubject<ITableEvents>(noopTableEvent());
  userActions: {[key: string]: boolean} = {};
  constructor(private roleService: RoleService,
              private matDialog: MatDialog,
              private resourceService: ResourceService) {
    this.commonTableActions = {
      createCode: '100',
      updateCode: '101',
      deleteCode: '102',
      disbleCode: '103',
    };
    this.columns = this.buildTableColumns();
    this.dataSource = new MatTableDataSource<IRole>();
  }

  ngOnInit() {
    this.tableEvents.subscribe(this.tableActionManager);
    this.resourceService.requestActionList(resourceCode.roleResourceCode)
      .subscribe({next: this.successActionList});
  }

  requestRoleListFn: PaginatedFn = (queryParams) => this.roleService.requestRoleList(queryParams);

  filterData(filter: string) {
    const aditionalParams = {filter};
    this.tableEvents.next({event: 'RESET', data: {aditionalParams}});
  }

  createUpdateRole = (item: IRole = null) => {
    const data = item ? this.buildUpdateDialogData(item) : this.buildRegisterDialogData();
    this.matDialog.open(EntityRegisterDialogComponent, buildEntityRegisterDialog(data))
      .afterClosed()
      .subscribe(result => this.afterRegisterDialog(result, !!item));
  }

  protected successActionList = (data: any) => {
    this.userActions = data;
    this.rowActions = this.buildRowActions();
    if (this.rowActions.length === 0) this.tableEvents.next({event: 'RELOAD_ACTIONS'});
  }

  protected rowActionEvent = (event: {item: any, actionCode: string}) => {
    const {item, actionCode} = event;
    switch (actionCode) {
      case this.commonTableActions.updateCode:
        this.createUpdateRole(item);
        break;
      case this.commonTableActions.deleteCode:
        this.deleteRole(item.id);
        break;
      case this.commonTableActions.disbleCode:
        this.disableOrEnableRole(item);
        break;
      default:
        break;
    }
  }

  protected tableActionManager = (event: ITableEvents) => {
    if (event.event === 'ROW_CLICK') {
      this.rowActionEvent(event.data);
    }
  }

  protected afterRegisterDialog = (result: any, wasUpdate: boolean) => {
    if (result) {
      this.tableEvents.next({event: wasUpdate ? 'RELOAD_PAGE' : 'RESET'});
    }
  }

  protected deleteRole(roleId: number) {
    const afterConfirmDialog = () => {
      this.roleService.requestDeleteRole(roleId)
        .subscribe({next: this.successDeleteRole, error: this.serviceError});
    };
    Notiflix.Confirm.show(
      'Eliminar Rol',
      '¿Está seguro de eliminar el rol?',
      'Si',
      'No',
      afterConfirmDialog
    );
  }

  protected successDeleteRole = (body: any) => {
    this.tableEvents.next({event: 'RELOAD_PAGE'});
  }

  protected disableOrEnableRole(item: IRole) {
    let status, title, message;
    if (item.roleStatus === UserStatus.ACTIVO) {
      title = 'Inhabilitar Usuario';
      message = '¿Está seguro de inhabilitar el rol?';
      status = UserStatus.INACTIVO;
    } else if (item.roleStatus === UserStatus.INACTIVO) {
      title = 'Habilitar Usuario';
      message = '¿Está seguro de habilitar el rol?';
      status = UserStatus.ACTIVO;
    }
    const afterConfirmDialog = () => {
      this.roleService.requestDisableRole(item.id, status)
        .subscribe({next: this.successDisableOrEnableRole, error: this.serviceError});
    };
    Notiflix.Confirm.show(
      title,
      message,
      'Si',
      'No',
      afterConfirmDialog
    );
  }

  protected successDisableOrEnableRole = (body: any) => {
    this.tableEvents.next({event: 'RELOAD_PAGE'});
  }

  protected serviceError = (error: any) => {
    console.error('Error al ejecutar servicio: ', error);
  }

  protected buildTableColumns = (): ITableColumn[] => ([
    { name: 'Nombre', property: 'name', visible: true, isModelProperty: true , isSort: true},
    { name: 'Descripción', property: 'description', visible: true, isModelProperty: true , isSort: true},
    { name: '¿Es Base?', property: 'baseRoleStr', visible: true, isModelProperty: true },
    { name: 'Estado', property: 'roleStatus', visible: true, isModelProperty: true },
  ])

  protected buildRegisterDialogData = (): IEntityRegisterDialog => ({
    title: 'Crear Rol',
    subtitle: null,
    btnOk: 'Guardar',
    actionType: 'REGISTER',
    entityId: null,
    updateFn: null,
    registerFn: (body: IRole) => this.roleService.requestCreateRole(body),
    fieldList: [
      {
        type: 'TEXT_INPUT',
        name: 'name',
        label: 'Nombre',
        default: null,
        validators: [
          requiredValidatorItem(),
          minLengthValidatorItem(3)
        ],
        maxlength: 35,
        options: {}
      },
      {
        type: 'TEXT_INPUT',
        name: 'description',
        label: 'Descripción',
        default: null,
        validators: [
          requiredValidatorItem(),
          minLengthValidatorItem(5)
        ],
        maxlength: 250,
        options: {}
      },
    ]
  })

  protected buildUpdateDialogData = (item: IRole): IEntityRegisterDialog => ({
    title: 'Actualizar Rol',
    subtitle: null,
    btnOk: 'Guardar',
    actionType: 'UPDATE',
    entityId: item.id,
    updateFn: (id: number, body: IRole) => this.roleService.requestUpdateRole(id, body),
    registerFn: null,
    fieldList: [
      {
        type: 'TEXT_INPUT',
        name: 'name',
        label: 'Nombre',
        default: item.name,
        validators: [
          requiredValidatorItem(),
          minLengthValidatorItem(3)
        ],
        maxlength: 35,
        options: {}
      },
      {
        type: 'TEXT_INPUT',
        name: 'description',
        label: 'Descripción',
        default: item.description,
        validators: [
          requiredValidatorItem(),
          minLengthValidatorItem(5)
        ],
        maxlength: 250,
        options: {}
      },
    ]
  })

  protected buildRowActions = (): ITableRowAction[] => {
    const actions = [];
    if (this.userActions.updateAction) actions.push({
      action: 'Actualizar',
      actionCode: this.commonTableActions.updateCode,
      icon: 'edit'
    });
    if (this.userActions.deleteAction) actions.push({
      action: 'Eliminar',
      actionCode: this.commonTableActions.deleteCode,
      icon: 'delete'
    });
    if (this.userActions.enableDisableAction) actions.push({
      action: 'Habilitar/Inhabilitar',
      actionCode: this.commonTableActions.disbleCode,
      icon: 'block'
    });
    return actions;
  }
}
