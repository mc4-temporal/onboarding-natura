import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {ResourceRoutingModule} from './resource-routing.module';
import {ResourceComponent} from './resource.component';
import {MC4SharedModule} from '../../../../@mc4/mc4-shared.module';
import {MC4CardModule} from '../../../../@mc4/shared/card/card.module';
import {ListModule} from '../../../../@mc4/shared/list/list.module';
import {MatTableModule} from '@angular/material/table';


@NgModule({
  declarations: [
    ResourceComponent
  ],
  imports: [
    CommonModule,
    MC4SharedModule,
    MC4CardModule,
    MatTableModule,
    ListModule,
    ResourceRoutingModule
  ]
})
export class ResourceModule { }
