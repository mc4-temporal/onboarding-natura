import {NgModule} from '@angular/core';
import {CommonModule, DatePipe} from '@angular/common';

import {MensajeRoutingModule} from './mensaje-routing.module';
import {MC4SharedModule} from '../../../../@mc4/mc4-shared.module';
import {MC4CardModule} from '../../../../@mc4/shared/card/card.module';
import {FlexLayoutModule} from '@angular/flex-layout';
import {ListModule} from '../../../../@mc4/shared/list/list.module';
import {MensajeComponent} from './mensaje.component';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatSelectModule} from '@angular/material/select';
import {MatDividerModule} from '@angular/material/divider';


@NgModule({
  declarations: [MensajeComponent],
    imports: [
        CommonModule,
        MensajeRoutingModule,
        MC4SharedModule,
        MC4CardModule,
        FlexLayoutModule,
        ListModule,
        FormsModule,
        ReactiveFormsModule,
        MatDatepickerModule,
        MatSelectModule,
        MatDividerModule
    ],
  providers: [DatePipe]
})
export class MensajeModule { }
