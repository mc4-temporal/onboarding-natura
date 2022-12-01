import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {RoleRoutingModule} from './role-routing.module';
import {RoleComponent} from './role.component';
import {MC4SharedModule} from '../../../../@mc4/mc4-shared.module';
import {MaterialModule} from '../../../../@mc4/shared/material-components.module';
import {ListModule} from '../../../../@mc4/shared/list/list.module';
import {MatIconModule} from '@angular/material/icon';
import {MatDialogModule} from '@angular/material/dialog';
import {FlexLayoutModule} from '@angular/flex-layout';


@NgModule({
  declarations: [
    RoleComponent
  ],
  imports: [
    CommonModule,
    RoleRoutingModule,
    MC4SharedModule,
    MaterialModule,
    MatIconModule,
    ListModule,
    MatDialogModule,
    FlexLayoutModule,
  ]
})
export class RoleModule {
}
