import {NgModule} from '@angular/core';

import {XmlViewerComponent} from './xml-viewer.component';
import {FlexModule} from '@angular/flex-layout';
import {MatButtonModule} from '@angular/material/button';
import {MatTooltipModule} from '@angular/material/tooltip';
import {MatIconModule} from '@angular/material/icon';
import {XmlPipe} from '../../pipes/xml.pipe';
import {CommonModule} from '@angular/common';
import {HighlightModule} from '../highlightjs/highlight.module';

@NgModule({
  imports: [
    CommonModule,
    FlexModule,
    MatButtonModule,
    MatTooltipModule,
    MatIconModule,
    HighlightModule
  ],
  exports: [
    XmlViewerComponent
  ],
  declarations: [XmlViewerComponent, XmlPipe],
  providers: [],
})
export class XmlViewerModule {
}
