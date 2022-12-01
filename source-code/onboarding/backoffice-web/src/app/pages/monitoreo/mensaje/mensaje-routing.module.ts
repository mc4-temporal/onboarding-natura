import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {MensajeComponent} from './mensaje.component';

const routes: Routes = [
  {
    path: '',
    component: MensajeComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MensajeRoutingModule { }
