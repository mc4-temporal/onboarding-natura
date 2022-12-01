import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { MaterialModule } from '../../../../@mc4/shared/material-components.module';
import { FormWizardRoutingModule } from './form-wizard-routing.module';
import { FormWizardComponent } from './form-wizard.component';
import { MC4SharedModule } from '../../../../@mc4/mc4-shared.module';

@NgModule({
  imports: [
    CommonModule,
    FormWizardRoutingModule,
    MC4SharedModule,
    ReactiveFormsModule,
    MaterialModule,
  ],
  declarations: [FormWizardComponent]
})
export class FormWizardModule {
}
