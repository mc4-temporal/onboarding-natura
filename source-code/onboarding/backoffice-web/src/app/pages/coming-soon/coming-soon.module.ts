import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ComingSoonRoutingModule } from './coming-soon-routing.module';
import { ComingSoonComponent } from './coming-soon.component';
import { MC4SharedModule } from '../../../@mc4/mc4-shared.module';
import { MC4CardModule } from '../../../@mc4/shared/card/card.module';

@NgModule({
  imports: [
    CommonModule,
    ComingSoonRoutingModule,
    MC4SharedModule,
    MC4CardModule
  ],
  declarations: [ComingSoonComponent]
})
export class ComingSoonModule {
}
