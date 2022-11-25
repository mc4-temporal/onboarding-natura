import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PageLayoutCardRoutingModule } from './page-layout-card-routing.module';
import { PageLayoutCardComponent } from './page-layout-card.component';
import { MC4SharedModule } from '../../../../@mc4/mc4-shared.module';
import { PageLayoutDemoContentModule } from '../components/page-layout-content/page-layout-demo-content.module';
import { MC4CardModule } from '../../../../@mc4/shared/card/card.module';

@NgModule({
  declarations: [PageLayoutCardComponent],
  imports: [
    CommonModule,
    PageLayoutCardRoutingModule,
    MC4SharedModule,
    MC4CardModule,
    PageLayoutDemoContentModule
  ]
})
export class PageLayoutCardModule {
}
