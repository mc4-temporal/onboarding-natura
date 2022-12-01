import {NgModule} from '@angular/core';
import {CommonModule, DatePipe} from '@angular/common';

import {ParameterRoutingModule} from './parameter-routing.module';
import {MC4SharedModule} from '../../../../@mc4/mc4-shared.module';
import {MaterialModule} from '../../../../@mc4/shared/material-components.module';
import {MatIconModule} from '@angular/material/icon';
import {ListModule} from '../../../../@mc4/shared/list/list.module';
import {MatDialogModule} from '@angular/material/dialog';
import {ParameterComponent} from './parameter.component';
import {MC4CardModule} from '../../../../@mc4/shared/card/card.module';
import {ReactiveFormsModule} from '@angular/forms';


@NgModule({
  declarations: [ParameterComponent],
  imports: [
    CommonModule,
    ParameterRoutingModule,
    MC4SharedModule,
    MaterialModule,
    MatIconModule,
    ListModule,
    MatDialogModule,
    MC4CardModule,
    ReactiveFormsModule
  ],
  providers: [
    DatePipe
  ]
})
export class ParameterModule { }
