import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MC4CardModule } from '../../../../../@mc4/shared/card/card.module';
import { LoadingOverlayModule } from '../../../../../@mc4/shared/loading-overlay/loading-overlay.module';
import { MaterialModule } from '../../../../../@mc4/shared/material-components.module';
import { SalesSummaryWidgetComponent } from './sales-summary-widget.component';
import { ChartsModule } from 'ng2-charts';

@NgModule({
  imports: [
    CommonModule,
    MaterialModule,

    // Core
    LoadingOverlayModule,
    MC4CardModule,
    ChartsModule
  ],
  declarations: [SalesSummaryWidgetComponent],
  exports: [SalesSummaryWidgetComponent]
})
export class SalesSummaryWidgetModule {
}
