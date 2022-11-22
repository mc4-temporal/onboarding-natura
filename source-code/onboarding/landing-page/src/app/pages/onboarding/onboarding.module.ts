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

@NgModule({
  imports: [
    CommonModule,
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
    DirectivePipesModule
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
