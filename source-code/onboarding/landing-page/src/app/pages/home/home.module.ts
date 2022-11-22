import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeRoutingModule } from './home-routing.module';
import { HomeComponent } from './home.component';
import { MC4SharedModule } from '../../../@mc4/mc4-shared.module';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {OnboardingModule} from '../onboarding/onboarding.module';

@NgModule({
  imports: [
    CommonModule,
    OnboardingModule,
    HomeRoutingModule,
    MC4SharedModule,
    MatDatepickerModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  declarations: [HomeComponent]
})
export class HomeModule {
}
