import {Component, OnInit} from '@angular/core';
import {ITableColumn, ITableEvents, ITableRowAction, noopTableEvent, PaginatedFn} from '../../../../@mc4/shared/table/table.model';
import {MatTableDataSource} from '@angular/material/table';
import {IRole, IUser} from '../../../commons/model/security.interface';
import {BehaviorSubject} from 'rxjs';
import {UserService} from '../../../commons/services/security/user.service';
import {EntityRegisterDialogComponent} from '../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.component';
import {buildEntityRegisterDialog} from '../../../commons/utils/dialog.util';
import {MatDialog} from '@angular/material/dialog';
import {IEntityRegisterDialog} from '../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.model';
import {
  emailValidatorItem,
  minLengthValidatorItem,
  requiredValidatorItem
} from '../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.util';
import {RoleService} from '../../../commons/services/security/role.service';
import {UserStatus} from '../../../commons/model/enum.value';
import * as Notiflix from 'notiflix';
import {ResourceService} from '../../../commons/services/security/resource.service';
import {resourceCode} from '../../../commons/utils/constants';

@Component({
  selector: 'mc4-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.scss']
})
export class UserComponent implements OnInit {
  columns: ITableColumn[];
  rowActions: ITableRowAction[] = [];
  commonTableActions: any;
  dataSource: MatTableDataSource<IUser>;
  tableEvents = new BehaviorSubject<ITableEvents>(noopTableEvent());
  userActions: {[key: string]: boolean} = {};
  constructor(private userService: UserService,
              private roleService: RoleService,
              private resourceService: ResourceService,
              private matDialog: MatDialog) {
    this.commonTableActions = {
      createCode: '100',
      updateCode: '101',
      deleteCode: '102',
      disbleCode: '103'
    };
    this.columns = this.buildTableColumns();
    this.dataSource = new MatTableDataSource<IUser>();
  }

  ngOnInit() {
    this.tableEvents.subscribe(this.tableActionManager);
    this.resourceService.requestActionList(resourceCode.userResourceCode)
      .subscribe({next: this.successActionList});
  }

  requestUserListFn: PaginatedFn = (queryParams) => this.userService.requestUserList(queryParams);

  createUpdateUser = (item: IUser = null) => {
    const queryParams = {page: 0, size: 200};
    this.roleService.requestRoleList(queryParams)
      .subscribe({
        next: (body) => this.successRoleList(item, body.content)
      });
  }

  filterData(filter: string) {
    const aditionalParams = {filter};
    this.tableEvents.next({event: 'RESET', data: {aditionalParams}});
  }

  protected successActionList = (data: any) => {
    this.userActions = data;
    this.rowActions = this.buildRowActions();
    if (this.rowActions.length === 0) this.tableEvents.next({event: 'RELOAD_ACTIONS'});
  }

  protected successRoleList = (item: IUser, roleList: IRole[]) => {
    const data = item ? this.buildUpdateDialogData(item, roleList) : this.buildRegisterDialogData(roleList);
    this.matDialog.open(EntityRegisterDialogComponent, buildEntityRegisterDialog(data))
      .afterClosed()
      .subscribe(result => this.afterRegisterDialog(result, !!item));
  }

  protected serviceError = (error: any) => {
    console.error('Error al ejecutar servicio: ', error);
  }

  protected afterRegisterDialog = (result: any, wasUpdate: boolean) => {
    if (result) {
      this.tableEvents.next({event: wasUpdate ? 'RELOAD_PAGE' : 'RESET'});
    }
  }

  protected tableActionManager = (event: ITableEvents) => {
    if (event.event === 'ROW_CLICK') {
      this.rowActionEvent(event.data);
    }
  }

  protected rowActionEvent = (event: {item: any, actionCode: string}) => {
    const {item, actionCode} = event;
    if (actionCode === this.commonTableActions.updateCode) this.createUpdateUser(item);
    if (actionCode === this.commonTableActions.deleteCode) this.deleteUser(item.id);
    if (actionCode === this.commonTableActions.disbleCode) this.disableOrEnableUser(item);
  }

  protected deleteUser(userId: number) {
    const afterConfirmDialog = () => {
      this.userService.requestDeleteUser(userId)
        .subscribe({next: this.successDeleteUser, error: this.serviceError});
    };
    Notiflix.Confirm.show(
      'Eliminar Usuario',
      '¿Está seguro de eliminar el usuario?',
      'Si',
      'No',
      afterConfirmDialog
    );
  }

  protected successDeleteUser = (body: any) => {
    this.tableEvents.next({event: 'RELOAD_PAGE'});
  }

  protected disableOrEnableUser(item: IUser) {
    let status, title, message;
    if (item.userStatus === UserStatus.ACTIVO) {
      title = 'Inhabilitar Usuario';
      message = '¿Está seguro de inhabilitar el usuario?';
      status = UserStatus.INACTIVO;
    } else if (item.userStatus === UserStatus.INACTIVO) {
      title = 'Habilitar Usuario';
      message = '¿Está seguro de habilitar el usuario?';
      status = UserStatus.ACTIVO;
    }
    const afterConfirmDialog = () => {
      this.userService.requestDisableUser(item.id, status)
        .subscribe({next: this.successDisableOrEnableUser, error: this.serviceError});
    };
    Notiflix.Confirm.show(
      title,
      message,
      'Si',
      'No',
      afterConfirmDialog
    );
  }

  protected successDisableOrEnableUser = (body: any) => {
    this.tableEvents.next({event: 'RELOAD_PAGE'});
  }

  protected buildRegisterDialogData = (roleList: IRole[]): IEntityRegisterDialog => ({
    title: 'Crear Usuario',
    btnOk: 'Guardar',
    actionType: 'REGISTER',
    registerFn: (body: IUser) => this.userService.requestCreateUser(body),
    fieldList: [
      {
        type: 'TEXT_INPUT',
        name: 'username',
        label: 'Usuario',
        default: null,
        validators: [
          requiredValidatorItem(),
          minLengthValidatorItem(5)
        ],
        maxlength: 20,
      },
      {
        type: 'TEXT_INPUT',
        name: 'name',
        label: 'Nombre',
        default: null,
        validators: [
          requiredValidatorItem(),
          minLengthValidatorItem(5)
        ],
        maxlength: 100,
      },
      {
        type: 'TEXT_INPUT',
        name: 'lastname',
        label: 'Apellidos',
        default: null,
        validators: [
          requiredValidatorItem()
        ],
        maxlength: 100,
      },
      {
        type: 'TEXT_INPUT',
        name: 'email',
        label: 'Correo',
        default: null,
        validators: [
          emailValidatorItem()
        ],
        maxlength: 100,
      },
      {
        type: 'SELECT',
        name: 'idAuthRole',
        label: 'Rol',
        default: null,
        validators: [
          requiredValidatorItem()
        ],
        selectOptions: {
          dataList: roleList,
          propValue: 'id',
          propShow: 'name'
        },
      }
    ]
  })

  protected buildUpdateDialogData = (item: IUser, roleList: IRole[]): IEntityRegisterDialog => ({
    title: 'Actualizar Usuario',
    btnOk: 'Guardar',
    actionType: 'UPDATE',
    entityId: item.id,
    updateFn: (id: number, body: IUser) => this.userService.requestUpdateUser(id, body),
    fieldList: [
      {
        type: 'TEXT_INPUT',
        name: 'username',
        label: 'Usuario',
        default: item.username,
        validators: [
          requiredValidatorItem(),
          minLengthValidatorItem(5)
        ],
        maxlength: 20,
      },
      {
        type: 'TEXT_INPUT',
        name: 'name',
        label: 'Nombre',
        default: item.name,
        validators: [
          requiredValidatorItem(),
          minLengthValidatorItem(5)
        ],
        maxlength: 100,
      },
      {
        type: 'TEXT_INPUT',
        name: 'lastname',
        label: 'Apellidos',
        default: item.lastname,
        validators: [
          requiredValidatorItem()
        ],
        maxlength: 100,
      },
      {
        type: 'TEXT_INPUT',
        name: 'email',
        label: 'Correo',
        default: item.email,
        validators: [
          emailValidatorItem()
        ],
        maxlength: 100,
      },
      {
        type: 'SELECT',
        name: 'idAuthRole',
        label: 'Rol',
        default: item.idAuthRole,
        validators: [
          requiredValidatorItem()
        ],
        selectOptions: {
          dataList: roleList,
          propValue: 'id',
          propShow: 'name'
        },
      }
    ]
  })

  protected buildTableColumns = (): ITableColumn[] => ([
    { name: 'Usuario', property: 'username', visible: true, isModelProperty: true , isSort: true},
    { name: 'Nombre', property: 'fullName', sortProperty: 'name', visible: true, isModelProperty: true , isSort: true},
    { name: 'Correo', property: 'email', visible: true, isModelProperty: true , isSort: true},
    { name: 'Rol', property: 'rolName', visible: true, isModelProperty: true },
    { name: 'Estado', property: 'userStatus', visible: true, isModelProperty: true },
  ])

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
