import { NgModule } from '@angular/core';
import {CommonModule, DatePipe} from '@angular/common';

import { OrdenRoutingModule } from './orden-routing.module';
import {OrdenComponent} from './orden.component';
import {MC4SharedModule} from '../../../../@mc4/mc4-shared.module';
import {MC4CardModule} from '../../../../@mc4/shared/card/card.module';
import {FlexLayoutModule} from '@angular/flex-layout';
import {ListModule} from '../../../../@mc4/shared/list/list.module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatSelectModule} from '@angular/material/select';
import {OrdenMensajesComponent} from './orden-mensajes/orden-mensajes.component';
import {MatBottomSheetModule} from '@angular/material/bottom-sheet';
import {MatTooltipModule} from '@angular/material/tooltip';
import {MatDividerModule} from '@angular/material/divider';
import {MatChipsModule} from '@angular/material/chips';
import {QrViewComponent} from './qr-view.component/qr-view.component';


@NgModule({
  declarations: [
    OrdenComponent,
    OrdenMensajesComponent,
    QrViewComponent
  ],
  imports: [
    CommonModule,
    OrdenRoutingModule,
    MC4SharedModule,
    MC4CardModule,
    FlexLayoutModule,
    ListModule,
    FormsModule,
    ReactiveFormsModule,
    MatDatepickerModule,
    MatSelectModule,
    MatBottomSheetModule,
    MatTooltipModule,
    MatDividerModule,
    MatChipsModule,
  ],
  providers: [DatePipe]
})
export class OrdenModule { }
