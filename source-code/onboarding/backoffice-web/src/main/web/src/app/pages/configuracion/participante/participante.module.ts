import {NgModule} from '@angular/core';
import {CommonModule, DatePipe} from '@angular/common';
import {ParticipanteComponent} from './participante.component';
import {MC4SharedModule} from '../../../../@mc4/mc4-shared.module';
import {MC4CardModule} from '../../../../@mc4/shared/card/card.module';
import {FlexLayoutModule, FlexModule} from '@angular/flex-layout';
import {ListModule} from '../../../../@mc4/shared/list/list.module';
import {ParticipanteRoutingModule} from './participante-routing.module';
import {MatBottomSheetModule} from '@angular/material/bottom-sheet';
import {CertComponent} from './cert/cert.component';
import {MatDividerModule} from '@angular/material/divider';
import {MatTooltipModule} from '@angular/material/tooltip';
import {TechnicalDataComponent} from './technical-data/technical-data.component';
import {ReactiveFormsModule} from '@angular/forms';


@NgModule({
  declarations: [
    ParticipanteComponent,
    CertComponent,
    TechnicalDataComponent
  ],
  imports: [
    CommonModule,
    ParticipanteRoutingModule,
    MC4SharedModule,
    MC4CardModule,
    FlexLayoutModule,
    FlexModule,
    ListModule,
    MatBottomSheetModule,
    MatDividerModule,
    MatTooltipModule,
    ReactiveFormsModule
  ],
  providers: [DatePipe]
})
export class ParticipanteModule { }
