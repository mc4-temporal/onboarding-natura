import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MC4CardModule } from '../../../../../@mc4/shared/card/card.module';
import { MaterialModule } from '../../../../../@mc4/shared/material-components.module';
import { RealtimeUsersWidgetComponent } from './realtime-users-widget.component';
import { ScrollbarModule } from '../../../../../@mc4/shared/scrollbar/scrollbar.module';

@NgModule({
  imports: [
    CommonModule,
    MaterialModule,

    // Core
    MC4CardModule,
    ScrollbarModule
  ],
  declarations: [RealtimeUsersWidgetComponent],
  exports: [RealtimeUsersWidgetComponent]
})
export class RealtimeUsersWidgetModule {
}
