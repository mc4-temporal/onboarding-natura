import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MC4CardModule } from '../../../../../@mc4/shared/card/card.module';
import { ListModule } from '../../../../../@mc4/shared/list/list.module';
import { LoadingOverlayModule } from '../../../../../@mc4/shared/loading-overlay/loading-overlay.module';
import { MaterialModule } from '../../../../../@mc4/shared/material-components.module';
import { RecentSalesWidgetTableComponent } from './recent-sales-widget-table/recent-sales-widget-table.component';
import { RecentSalesWidgetComponent } from './recent-sales-widget.component';
import { ChartsModule } from 'ng2-charts';

@NgModule({
  imports: [
    CommonModule,
    MaterialModule,

    // Core
    LoadingOverlayModule,
    MC4CardModule,
    ListModule,
    ChartsModule
  ],
  declarations: [RecentSalesWidgetComponent, RecentSalesWidgetTableComponent],
  exports: [RecentSalesWidgetComponent]
})
export class RecentSalesWidgetModule {
}
