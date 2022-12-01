import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {AccessRoutingModule} from './access-routing.module';
import {AccessComponent} from './access.component';
import {MC4SharedModule} from '../../../../@mc4/mc4-shared.module';
import {MC4CardModule} from '../../../../@mc4/shared/card/card.module';
import {FlexLayoutModule} from '@angular/flex-layout';
import {ListModule} from '../../../../@mc4/shared/list/list.module';
import {MatTableModule} from '@angular/material/table';
import {MatPaginatorModule} from '@angular/material/paginator';
import {MatSelectModule} from '@angular/material/select';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {PrivilegesComponent} from './privileges/privileges.component';
import {MatDialogModule} from '@angular/material/dialog';


@NgModule({
  declarations: [
    AccessComponent,
    PrivilegesComponent
  ],
  imports: [
    CommonModule,
    AccessRoutingModule,
    MC4SharedModule,
    MC4CardModule,
    FlexLayoutModule,
    ListModule,
    MatSelectModule,
    FormsModule,
    ReactiveFormsModule,

    MatTableModule,
    MatPaginatorModule,
    MatDialogModule,
  ],
  entryComponents: [
    PrivilegesComponent
  ]
})
export class AccessModule {
}
