import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {IPrivilegeDialogData} from './privileges.interface';
import {IAction} from '../../../../commons/model/security.interface';
import {RoleService} from '../../../../commons/services/security/role.service';

@Component({
  selector: 'mc4-privileges',
  templateUrl: './privileges.component.html',
  styleUrls: ['./privileges.component.scss']
})
export class PrivilegesComponent implements OnInit {

  constructor(public dialogRef: MatDialogRef<PrivilegesComponent>,
              @Inject(MAT_DIALOG_DATA) public data: IPrivilegeDialogData,
              private roleService: RoleService) { }

  ngOnInit() {
  }

  toggleActionChange(isChecked: boolean, item: IAction) {
    let isNew = true;
    for (let i = 0; i < this.data.privilegeList.length; i++) {
      if (this.data.privilegeList[i].idAuthAction === item.id) {
        this.data.privilegeList[i].enable = isChecked;
        isNew = false;
        break;
      }
    }
    if (isNew) {
      this.data.privilegeList.push({
        id: null,
        idAuthAction: item.id,
        idAuthRoleResource: null,
        enable: isChecked,
      });
    }
  }

  isActionChecked(item: IAction) {
    return !!this.data.privilegeList.find(priv => priv.idAuthAction === item.id && priv.enable);
  }

  submitData() {
    if (this.data.privilegeList.length === 0) {
      this.dialogRef.close(false);
      return;
    }
    this.roleService.requestConfigurePrivileges(this.data.roleId, this.data.resourceId, this.data.privilegeList)
      .subscribe({next: this.successConfigure, error: console.error});
  }

  protected successConfigure = (body: boolean) => {
    this.dialogRef.close(body);
  }
}
