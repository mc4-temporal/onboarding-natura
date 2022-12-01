import { NgModule } from '@angular/core';
import {CommonModule, DatePipe} from '@angular/common';

import { JobRoutingModule } from './job-routing.module';
import { JobComponent } from './job.component';
import {MC4SharedModule} from '../../../../@mc4/mc4-shared.module';
import {MC4CardModule} from '../../../../@mc4/shared/card/card.module';
import {FlexLayoutModule, FlexModule} from '@angular/flex-layout';
import {ListModule} from '../../../../@mc4/shared/list/list.module';
import {MatBottomSheetModule} from '@angular/material/bottom-sheet';
import {MatDividerModule} from '@angular/material/divider';
import {MatTooltipModule} from '@angular/material/tooltip';
import {JobHistoryComponent} from './job-history/job-history.component';


@NgModule({
  declarations: [
    JobComponent,
    JobHistoryComponent
  ],
  imports: [
    CommonModule,
    JobRoutingModule,
    MC4SharedModule,
    MC4CardModule,
    FlexLayoutModule,
    FlexModule,
    ListModule,
    MatBottomSheetModule,
    MatDividerModule,
    MatTooltipModule
  ],
  providers: [DatePipe]
})
export class JobModule { }
