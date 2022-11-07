import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'ordenes',
    loadChildren: () => import('./orden/orden.module').then(m => m.OrdenModule),
  },
  {
    path: 'mensajes',
    loadChildren: () => import('./mensaje/mensaje.module').then(m => m.MensajeModule),
  },

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MonitoreoRoutingModule { }
