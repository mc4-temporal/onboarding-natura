import {NgModule} from '@angular/core';

import {ProfileComponent} from './profile.component';
import {CommonModule, DatePipe} from '@angular/common';
import {FlexLayoutModule, FlexModule} from '@angular/flex-layout';
import {MC4SharedModule} from '../../../../@mc4/mc4-shared.module';
import {ProfileRoutingModule} from './profile-routing.module';
import {MC4CardModule} from '../../../../@mc4/shared/card/card.module';
import {MatCardModule} from '@angular/material/card';
import {MatTooltipModule} from '@angular/material/tooltip';

@NgModule({
  declarations: [ProfileComponent],
  imports: [
    CommonModule,
    ProfileRoutingModule,
    FlexLayoutModule,
    FlexModule,
    MC4SharedModule,
    MC4CardModule,
    MatCardModule,
    MatTooltipModule
  ],
  exports: [],
  providers: [
    DatePipe
  ],
})
export class ProfileModule {
}
