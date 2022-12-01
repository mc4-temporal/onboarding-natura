import {NgModule} from '@angular/core';
import {CommonModule, DatePipe} from '@angular/common';

import {LogRoutingModule} from './log-routing.module';
import {LogComponent} from './log.component';
import {MC4SharedModule} from '../../../../@mc4/mc4-shared.module';
import {MC4CardModule} from '../../../../@mc4/shared/card/card.module';
import {FlexLayoutModule} from '@angular/flex-layout';
import {ListModule} from '../../../../@mc4/shared/list/list.module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatSelectModule} from '@angular/material/select';
import {DetailLogComponent} from './detail-log/detail-log.component';
import {MatDialogModule} from '@angular/material/dialog';
import {MatTabsModule} from '@angular/material/tabs';
import {MatChipsModule} from '@angular/material/chips';
import {MatDividerModule} from '@angular/material/divider';
import {MatTooltipModule} from '@angular/material/tooltip';
import {MatBottomSheetModule} from '@angular/material/bottom-sheet';


@NgModule({
  declarations: [LogComponent, DetailLogComponent],
  imports: [
    CommonModule,
    MC4SharedModule,
    MC4CardModule,
    FlexLayoutModule,
    ListModule,
    FormsModule,
    ReactiveFormsModule,
    MatDatepickerModule,
    MatSelectModule,
    LogRoutingModule,
    MatDialogModule,
    MatTabsModule,
    MatChipsModule,
    MatDividerModule,
    MatTooltipModule,
    MatBottomSheetModule
  ],
  entryComponents: [
    DetailLogComponent
  ],
  providers: [
    DatePipe
  ]
})
export class LogModule {
}
