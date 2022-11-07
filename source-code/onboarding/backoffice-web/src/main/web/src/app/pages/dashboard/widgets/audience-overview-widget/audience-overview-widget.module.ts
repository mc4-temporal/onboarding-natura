import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { MC4CardModule } from '../../../../../@mc4/shared/card/card.module';
import { LoadingOverlayModule } from '../../../../../@mc4/shared/loading-overlay/loading-overlay.module';
import { MaterialModule } from '../../../../../@mc4/shared/material-components.module';
import { AudienceOverviewWidgetComponent } from './audience-overview-widget.component';
import { ChartsModule } from 'ng2-charts';

@NgModule({
  imports: [
    CommonModule,
    MaterialModule,
    ReactiveFormsModule,

    // Core
    LoadingOverlayModule,
    MC4CardModule,
    ChartsModule,
  ],
  declarations: [AudienceOverviewWidgetComponent],
  exports: [AudienceOverviewWidgetComponent]
})
export class AudienceOverviewWidgetModule {
}
