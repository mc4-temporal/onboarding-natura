import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { LoadingOverlayModule } from '../../../../../@mc4/shared/loading-overlay/loading-overlay.module';
import { MaterialModule } from '../../../../../@mc4/shared/material-components.module';
import { LineChartWidgetComponent } from './line-chart-widget.component';
import { MC4CardModule } from '../../../../../@mc4/shared/card/card.module';
import { ChartsModule } from 'ng2-charts';

@NgModule({
  imports: [
    CommonModule,
    MaterialModule,

    // Core
    LoadingOverlayModule,

    // Chart Widget Style
    MC4CardModule,
    ChartsModule
  ],
  declarations: [LineChartWidgetComponent],
  exports: [LineChartWidgetComponent]
})
export class LineChartWidgetModule {
}
