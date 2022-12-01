import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { BlankRoutingModule } from './blank-routing.module';
import { BlankComponent } from './blank.component';
import { MC4SharedModule } from '../../../@mc4/mc4-shared.module';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {WebcamModule} from "ngx-webcam";
import {VideoPlayerComponent} from './video-player/video-player.component';

@NgModule({
  imports: [
    CommonModule,
    BlankRoutingModule,
    MC4SharedModule,
    MatDatepickerModule,
    FormsModule,
    ReactiveFormsModule,
    WebcamModule
  ],
  declarations: [BlankComponent, VideoPlayerComponent]
})
export class BlankModule {
}
