import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {UserRoutingModule} from './user-routing.module';
import {UserComponent} from './user.component';
import {MC4SharedModule} from '../../../../@mc4/mc4-shared.module';
import {MC4CardModule} from '../../../../@mc4/shared/card/card.module';
import {FlexLayoutModule} from '@angular/flex-layout';
import {ListModule} from '../../../../@mc4/shared/list/list.module';


@NgModule({
  declarations: [
    UserComponent
  ],
  imports: [
    CommonModule,
    UserRoutingModule,
    MC4SharedModule,
    MC4CardModule,
    FlexLayoutModule,
    ListModule,
  ]
})
export class UserModule { }
