import {IAction, IPrivilege} from '../../../../commons/model/security.interface';

export interface IPrivilegeDialogData {
  roleId: number;
  resourceId: number;
  actionList: IAction[];
  privilegeList: IPrivilege[];
}
