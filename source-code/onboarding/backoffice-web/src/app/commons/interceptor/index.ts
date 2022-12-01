
import {ErrorInterceptor} from './error.interceptor';
import {HTTP_INTERCEPTORS} from '@angular/common/http';
import {HeadersInterceptor} from './headers.interceptor';

export const httpInterceptorProvider = [
  { provide: HTTP_INTERCEPTORS, useClass: ErrorInterceptor, multi: true },
  { provide: HTTP_INTERCEPTORS, useClass: HeadersInterceptor, multi: true }
];
