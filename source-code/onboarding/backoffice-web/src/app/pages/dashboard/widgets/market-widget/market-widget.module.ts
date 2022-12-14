import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MaterialModule } from '../../../../../@mc4/shared/material-components.module';
import { MarketWidgetComponent } from './market-widget.component';

@NgModule({
  imports: [
    CommonModule,
    MaterialModule
  ],
  declarations: [MarketWidgetComponent],
  exports: [MarketWidgetComponent]
})
export class MarketWidgetModule {
}
