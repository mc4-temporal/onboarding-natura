import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PageLayoutDemoContentComponent } from './page-layout-demo-content.component';
import { MC4SharedModule } from '../../../../../@mc4/mc4-shared.module';

@NgModule({
  declarations: [PageLayoutDemoContentComponent],
  imports: [
    CommonModule,
    MC4SharedModule
  ],
  exports: [PageLayoutDemoContentComponent]
})
export class PageLayoutDemoContentModule {
}
