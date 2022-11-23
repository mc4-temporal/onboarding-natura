import {Provider} from '@angular/core';
import { DateAdapter, MAT_DATE_FORMATS, MAT_DATE_LOCALE } from '@angular/material/core';
import { Injectable } from '@angular/core';
import { NativeDateAdapter } from '@angular/material/core';
import * as moment from 'moment';

const KEY: String = 'dateInput';
export const CUSTOM_DATE_FORMAT = {
  parse: {
    dateInput: {month: 'short', year: 'numeric', day: 'numeric'}
  },
  display: {
    dateInput: KEY,
    monthYearLabel: {year: 'numeric', month: 'short'},
    dateA11yLabel: {year: 'numeric', month: 'long', day: 'numeric'},
    monthYearA11yLabel: {year: 'numeric', month: 'long'},
  }
};

@Injectable()
export class CustomDateAdapter extends NativeDateAdapter {

  format(date: Date, displayFormat: any): string {
    moment.locale('es-BO');
    // tslint:disable-next-line:curly
    if (displayFormat === KEY) return moment(moment.utc(date)).format('DD/MM/YYYY');
    // tslint:disable-next-line:curly
    else return moment(moment.utc(date)).format('ll');
  }

}

export const dateFormatProvider: Provider[] = [
    { provide: MAT_DATE_LOCALE, useValue: 'es-BO' },
    { provide: MAT_DATE_FORMATS, useValue: CUSTOM_DATE_FORMAT },
    { provide: DateAdapter, useClass: CustomDateAdapter }
];
