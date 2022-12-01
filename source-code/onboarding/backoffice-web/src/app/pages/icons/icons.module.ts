import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { BreadcrumbsModule } from '../../../@mc4/shared/breadcrumbs/breadcrumbs.module';
import { MC4CardModule } from '../../../@mc4/shared/card/card.module';
import { MaterialModule } from '../../../@mc4/shared/material-components.module';
import { IconsRoutingModule } from './icons-routing.module';
import { IconsComponent } from './icons.component';
import { ScrollbarModule } from '../../../@mc4/shared/scrollbar/scrollbar.module';

@NgModule({
  imports: [
    CommonModule,
    IconsRoutingModule,
    ReactiveFormsModule,
    MaterialModule,
    BreadcrumbsModule,
    MC4CardModule,
    ScrollbarModule
  ],
  declarations: [IconsComponent]
})
export class IconsModule {
}
