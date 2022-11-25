import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {InfoPersonalComponent} from './info-personal/info-personal.component';
import {DireccionesComponent} from './direcciones/direcciones.component';
import {
  DirectoraConsultoraConocidaComponent
} from './directora-consultora-conocida/directora-consultora-conocida.component';
import {ResumenContadoComponent} from './resumen-contado/resumen-contado.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {FlexModule} from '@angular/flex-layout';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatInputModule} from '@angular/material/input';
import {DirectivePipesModule} from '../../../../@mc4/directive-pipes/directive-pipes.module';
import {MatTooltipModule} from '@angular/material/tooltip';
import {MatSelectModule} from '@angular/material/select';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatSlideToggleModule} from '@angular/material/slide-toggle';
import {MatDividerModule} from '@angular/material/divider';
import {MatStepperModule} from '@angular/material/stepper';


@NgModule({
  declarations: [
    InfoPersonalComponent,
    DireccionesComponent,
    DirectoraConsultoraConocidaComponent,
    ResumenContadoComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    FlexModule,
    ReactiveFormsModule,
    MatDatepickerModule,
    MatFormFieldModule,
    MatButtonModule,
    MatInputModule,
    MatSelectModule,
    MatIconModule,
    DirectivePipesModule,
    MatTooltipModule,
    MatSlideToggleModule,
    MatDividerModule,
    MatStepperModule
  ],
  exports: [
    InfoPersonalComponent,
    DireccionesComponent,
    DirectoraConsultoraConocidaComponent,
    ResumenContadoComponent
  ]
})
export class OnbFormsModule { }
