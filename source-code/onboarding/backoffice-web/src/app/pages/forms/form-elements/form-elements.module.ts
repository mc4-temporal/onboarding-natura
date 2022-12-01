import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { BreadcrumbsModule } from '../../../../@mc4/shared/breadcrumbs/breadcrumbs.module';
import { MC4CardModule } from '../../../../@mc4/shared/card/card.module';
import { HighlightModule } from '../../../../@mc4/shared/highlightjs/highlight.module';
import { MaterialModule } from '../../../../@mc4/shared/material-components.module';
import { FormElementsRoutingModule } from './form-elements-routing.module';
import { FormElementsComponent } from './form-elements.component';
import { MC4SharedModule } from '../../../../@mc4/mc4-shared.module';

@NgModule({
  imports: [
    CommonModule,
    FormElementsRoutingModule,
    MaterialModule,
    MC4SharedModule,
    ReactiveFormsModule,

    // Core
    HighlightModule,
    MC4CardModule,
    BreadcrumbsModule
  ],
  declarations: [FormElementsComponent]
})
export class FormElementsModule {
}
