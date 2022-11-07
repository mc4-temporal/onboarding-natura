import * as vkbeautify from 'vkbeautify';
import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'xml'
})
export class XmlPipe implements PipeTransform {
  transform(value: string): string {
    if (!value) return '';
    return vkbeautify.xml(value);
  }
}
