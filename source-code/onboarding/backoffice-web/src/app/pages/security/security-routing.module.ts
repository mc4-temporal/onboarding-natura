import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';

const routes: Routes = [
  {
    path: 'users',
    loadChildren: () => import('./user/user.module').then(m => m.UserModule),
  },
  {
    path: 'roles',
    loadChildren: () => import('./role/role.module').then(m => m.RoleModule),
  },
  {
    path: 'resources',
    loadChildren: () => import('./resource/resource.module').then(m => m.ResourceModule),
  },
  {
    path: 'access',
    loadChildren: () => import('./access/access.module').then(m => m.AccessModule)
  },
  {
    path: 'parameters',
    loadChildren: () => import('./parameter/parameter.module').then(m => m.ParameterModule),
  },
  {
    path: 'log',
    loadChildren: () => import('./log/log.module').then(m => m.LogModule),
  },
  {
    path: 'profile',
    loadChildren: () => import('./profile/profile.module').then(m => m.ProfileModule),
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SecurityRoutingModule { }
