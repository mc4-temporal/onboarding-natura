import {Component, OnInit} from '@angular/core';
import {MatTableDataSource} from '@angular/material/table';
import {ITableColumn, PaginatedFn} from '../../../../@mc4/shared/table/table.model';
import {UserService} from '../../../commons/services/security/user.service';
import {DatePipe} from '@angular/common';
import {EntityRegisterDialogComponent} from '../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.component';
import {buildEntityRegisterDialog} from '../../../commons/utils/dialog.util';
import {MatDialog} from '@angular/material/dialog';
import {IUser} from '../../../commons/model/security.interface';
import {IEntityRegisterDialog} from '../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.model';
import {minLengthValidatorItem, requiredValidatorItem} from '../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.util';
import {AuthService} from '../../../commons/services/security/auth.service';

@Component({
  selector: 'mc4-profile',
  templateUrl: 'profile.component.html',
  styleUrls: ['./profile.component.scss']
})

export class ProfileComponent implements OnInit {
  dataSource: MatTableDataSource<any>;
  columns: ITableColumn[];
  userInfo: IUser;
  constructor(private userService: UserService,
              private authService: AuthService,
              private matDialog: MatDialog,
              private datePipe: DatePipe) {
    this.columns = this.buildTableColumns();
    this.dataSource = new MatTableDataSource<any>();
  }

  ngOnInit() {
    this.userInfo = {} as IUser;
    if (this.authService.isLoggedIn()) {
      this.userInfo = this.authService.getUserInfo();
      this.userInfo.initials = this.userInfo.name[0];
      if (this.userInfo.lastname && this.userInfo.lastname.length > 1) {
        this.userInfo.initials += this.userInfo.lastname[0];
      }
    }
  }

  requestLogListFn: PaginatedFn = (queryParams) => this.userService.requestHistorialSesionList(queryParams);

  protected buildTableColumns = (): ITableColumn[] => ([
    { name: 'Fecha', property: 'fecha', visible: true, isModelProperty: true , isSort: false, width: '15%'},
    { name: 'Tipo Log', property: 'logType', visible: true, isModelProperty: true , isSort: false, width: '15%'},
    { name: 'Log', property: 'log', visible: true, isModelProperty: true , isSort: false, width: '60%'}
  ])

  itemFormatter = (content: any[]): any[] => {
    return content.map(item => {
      item.fecha = this.datePipe.transform(item.createdDate, 'dd/MM/yyyy HH:mm:ss');
      return item;
    });
  }

  changePassword() {
    const data = this.buildChangePassDialogData();
    this.matDialog.open(EntityRegisterDialogComponent, buildEntityRegisterDialog(data))
      .afterClosed()
      .subscribe(result => {
        console.log('RES: ', result);
      });
  }

  protected buildChangePassDialogData = (): IEntityRegisterDialog => ({
    title: 'Cambiar Contraseña',
    btnOk: 'Cambiar',
    actionType: 'REGISTER',
    registerFn: (body: IUser) => this.userService.requestChangePass(body),
    fieldList: [
      {
        type: 'TEXT_PASSWORD',
        typeInp: 'password',
        name: 'presentPassword',
        label: 'Contraseña Actual',
        default: null,
        validators: [
          requiredValidatorItem(),
          minLengthValidatorItem(5)
        ],
        maxlength: 20,
      },
      {
        type: 'TEXT_PASSWORD',
        typeInp: 'password',
        name: 'newPassword',
        label: 'Contraseña Nueva',
        default: null,
        validators: [
          requiredValidatorItem(),
          minLengthValidatorItem(5)
        ],
        maxlength: 20,
      },
      {
        type: 'TEXT_PASSWORD',
        typeInp: 'password',
        name: 'confirmPassword',
        label: 'Confirmar Contraseña',
        default: null,
        validators: [
          requiredValidatorItem(),
          minLengthValidatorItem(5)
        ],
        maxlength: 20,
      },
    ]
  })
}
