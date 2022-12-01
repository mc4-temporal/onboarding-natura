import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PageLayoutCardTabbedRoutingModule } from './page-layout-card-tabbed-routing.module';
import { PageLayoutCardTabbedComponent } from './page-layout-card-tabbed.component';
import { MC4SharedModule } from '../../../../@mc4/mc4-shared.module';
import { MC4CardModule } from '../../../../@mc4/shared/card/card.module';
import { PageLayoutDemoContentModule } from '../components/page-layout-content/page-layout-demo-content.module';
import { MatTabsModule } from '@angular/material/tabs';

@NgModule({
  declarations: [PageLayoutCardTabbedComponent],
  imports: [
    CommonModule,
    PageLayoutCardTabbedRoutingModule,
    MC4SharedModule,
    MC4CardModule,
    PageLayoutDemoContentModule,
    MatTabsModule
  ]
})
export class PageLayoutCardTabbedModule {
}
