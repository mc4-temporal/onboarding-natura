import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';

const routes: Routes = [
  {
    path: 'participante',
    loadChildren: () => import('./participante/participante.module').then(m => m.ParticipanteModule),
  },
  {
    path: 'procesos',
    loadChildren: () => import('./job/job.module').then(m => m.JobModule),
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ConfiguracionRoutingModule { }
