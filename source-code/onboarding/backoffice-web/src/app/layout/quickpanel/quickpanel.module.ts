import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MaterialModule } from '../../../@mc4/shared/material-components.module';
import { ScrollbarModule } from '../../../@mc4/shared/scrollbar/scrollbar.module';
import { QuickpanelComponent } from './quickpanel.component';

@NgModule({
  imports: [
    CommonModule,
    MaterialModule,
    ScrollbarModule
  ],
  declarations: [QuickpanelComponent],
  exports: [QuickpanelComponent]
})
export class QuickpanelModule {
}
