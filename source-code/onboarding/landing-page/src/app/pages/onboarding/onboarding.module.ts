import {NgModule} from '@angular/core';

import {OnboardingComponent} from './onboarding.component';
import {CommonModule} from '@angular/common';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {FlexModule} from '@angular/flex-layout';
import {MatStepperModule} from '@angular/material/stepper';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatButtonModule} from '@angular/material/button';
import {MatInputModule} from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import {MatIconModule} from '@angular/material/icon';
import {DirectivePipesModule} from '../../../@mc4/directive-pipes/directive-pipes.module';
import {MatTooltipModule} from '@angular/material/tooltip';
import {MatSlideToggleModule} from '@angular/material/slide-toggle';
import {MatDividerModule} from '@angular/material/divider';
import {OnbFormsModule} from './forms/onb-forms.module';

@NgModule({
  imports: [
    CommonModule,
    OnbFormsModule,
    FormsModule,
    FlexModule,
    ReactiveFormsModule,
    MatDatepickerModule,
    MatStepperModule,
    MatFormFieldModule,
    MatButtonModule,
    MatInputModule,
    MatSelectModule,
    MatIconModule,
    DirectivePipesModule,
    MatTooltipModule,
    MatSlideToggleModule,
    MatDividerModule
  ],
  declarations: [
    OnboardingComponent,
  ],
  exports: [
    OnboardingComponent
  ],
  providers: [
  ],
})
export class OnboardingModule {
}
