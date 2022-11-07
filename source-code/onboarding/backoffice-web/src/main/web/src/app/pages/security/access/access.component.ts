import {Component, OnInit} from '@angular/core';
import {MatTableDataSource} from '@angular/material/table';
import {RoleService} from '../../../commons/services/security/role.service';
import {IPrivilege, IRole, IUserAccess} from '../../../commons/model/security.interface';
import {FormControl, Validators} from '@angular/forms';
import {ActionService} from '../../../commons/services/security/action.service';
import {MatDialog} from '@angular/material/dialog';
import {PrivilegesComponent} from './privileges/privileges.component';
import {buildRightDialogConfig} from '../../../commons/utils/dialog.util';
import {IPrivilegeDialogData} from './privileges/privileges.interface';
import {SidenavService} from '../../../layout/sidenav/sidenav.service';
import {BehaviorSubject} from 'rxjs';
import {
  actionTableColumItem,
  checkRowTableColumItem,
  ITableColumn,
  ITableEvents,
  ITableRowAction,
  noopTableEvent
} from '../../../../@mc4/shared/table/table.model';
import {ResourceService} from '../../../commons/services/security/resource.service';
import {resourceCode} from '../../../commons/utils/constants';

@Component({
  selector: 'mc4-access',
  templateUrl: './access.component.html',
  styleUrls: ['./access.component.scss']
})
export class AccessComponent implements OnInit {
  roleList: IRole[];
  commonTableActions: any;
  roleControl: FormControl;
  dataSource: MatTableDataSource<IUserAccess>;
  tableEvents = new BehaviorSubject<ITableEvents>(noopTableEvent());
  columns: ITableColumn[];

  rowActions: any[] = [];
  userActions: {[key: string]: boolean} = {};
  get visibleColumns() {
    return this.columns.filter(column => column.visible).map(column => column.property);
  }
  constructor(private roleService: RoleService,
              private actionService: ActionService,
              private resourceService: ResourceService,
              private sidenavService: SidenavService,
              private matDialog: MatDialog) {
    this.dataSource = new MatTableDataSource<IUserAccess>([]);
    this.roleControl = new FormControl(null, Validators.required);
    this.commonTableActions = {
      actionConfigCode: '100',
    };
    this.columns = this.buildColumns();
    const queryParams = {page: 0, size: 1000};
    this.roleService.requestRoleList(queryParams)
      .subscribe({
        next: (body) => this.roleList = body.content,
        error: this.serviceError
      });
  }

  ngOnInit() {
    this.tableEvents.subscribe(this.tableActionManager);
    this.resourceService.requestActionList(resourceCode.accessResourceCode)
      .subscribe({next: this.successActionList});
  }

  rowOptionClick(row, actionCode) {
    this.rowActionEvent({actionCode, item: row});
  }

  roleSelected() {
    if (this.roleControl.valid) {
      this.roleService.requestFindResourceByRole(this.roleControl.value)
        .subscribe({
          next: (body) => this.dataSource.data = body,
          error: this.serviceError
        });
    }
  }

  isGroupItem = (index, item: IUserAccess) => !!item.isParent;

  protected successActionList = (data: any) => {
    this.userActions = data;
    this.rowActions = this.buildRowActions();
    if (this.rowActions.length === 0) this.columns = this.columns.filter(item => item.property !== 'actions');
  }

  protected tableActionManager = (event: ITableEvents) => {
    if (event.event === 'ROW_CLICK') {
      this.rowActionEvent(event.data);
    }
  }

  protected rowActionEvent(event: {item: IUserAccess, actionCode: string}) {
    const {item, actionCode} = event;
    if (actionCode === this.commonTableActions.actionConfigCode) {
      this.roleResourcePrivilegesConfig(item).then(console.log);
    }
  }

  private async roleResourcePrivilegesConfig(item: IUserAccess) {
    const actionList = await this.actionService.requestAvailableActionList(item.resourceId)
      .toPromise()
      .catch(this.serviceError);
    if (actionList) {
      const myPrivilegeList = await this.actionService.requestPrivilegesByRolAndResource(this.roleControl.value, item.resourceId)
        .toPromise()
        .catch(this.serviceError);

      if (myPrivilegeList) {
        const privilegeList: IPrivilege[] = myPrivilegeList as IPrivilege[];
        const data: IPrivilegeDialogData = {
          roleId: this.roleControl.value,
          resourceId: item.resourceId,
          actionList,
          privilegeList
        };

        this.matDialog.open(
          PrivilegesComponent,
          buildRightDialogConfig<IPrivilegeDialogData>(data)
        ).afterClosed().subscribe(result => {
          if (result) {
            this.roleSelected();
            this.sidenavService.reloadResources();
          }
        });
      }
    }
  }

  protected serviceError = (error: any) => {
    console.error('ERROR: ', error);
  }

  protected buildRowActions = (): ITableRowAction[] => {
    const actions = [];
    if (this.userActions.configAccessAction) actions.push({
      action: 'Configurar Acciones',
      actionCode: this.commonTableActions.actionConfigCode,
      icon: 'edit'
    });
    return actions;
  }

  protected buildColumns = (): ITableColumn[] => ([
    checkRowTableColumItem,
    { name: 'Nombre', property: 'name', visible: true, isModelProperty: true },
    { name: 'Url', property: 'url', visible: true, isModelProperty: true },
    actionTableColumItem,
  ])

}
