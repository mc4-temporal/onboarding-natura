import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MC4CardModule } from '../../../../../@mc4/shared/card/card.module';
import { LoadingOverlayModule } from '../../../../../@mc4/shared/loading-overlay/loading-overlay.module';
import { MaterialModule } from '../../../../../@mc4/shared/material-components.module';
import { ScrollbarModule } from '../../../../../@mc4/shared/scrollbar/scrollbar.module';
import { AdvancedPieChartWidgetComponent } from './advanced-pie-chart-widget.component';
import { ChartsModule } from 'ng2-charts';

@NgModule({
  imports: [
    CommonModule,
    MaterialModule,

    // Core
    MC4CardModule,
    LoadingOverlayModule,
    ScrollbarModule,
    ChartsModule
  ],
  declarations: [AdvancedPieChartWidgetComponent],
  exports: [AdvancedPieChartWidgetComponent]
})
export class AdvancedPieChartWidgetModule {
}
