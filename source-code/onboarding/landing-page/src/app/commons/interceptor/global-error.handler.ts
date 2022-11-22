import { ErrorHandler, Injectable, Injector } from '@angular/core';
import { LocationStrategy, PathLocationStrategy } from '@angular/common';
import * as StackTrace from 'stacktrace-js';
import {HttpErrorResponse} from '@angular/common/http';
import {environment} from '../../../environments/environment';
import {ProccessType} from '../model/security.interface';
import {LandingService} from '../services/landing.service';

@Injectable()
export class GlobalErrorHandler implements ErrorHandler {
  constructor(private injector: Injector) { }
  handleError(error) {
    const logService = this.injector.get(LandingService);
    const location = this.injector.get(LocationStrategy);
    const message = error.message ? error.message : error.toString();
    const url = location instanceof PathLocationStrategy ? location.path() : 'No Reconocida';

    const callback = function(stackframes) {
      const stringifiedStack = stackframes.map(function(sf) {
        return sf.toString();
      }).join('\n');
      logService.requestSendLog(
        environment.appLogProccess as ProccessType,
        'ERROR',
        { message, pagina: url, stack: stringifiedStack })
        .subscribe({next: console.log, error: console.error});
    };

    if (error instanceof HttpErrorResponse) {
      const errorFinal = JSON.stringify(error);
      logService.requestSendLog(
        environment.appLogProccess as ProccessType,
        'ERROR',
        { message, pagina: url, stack: errorFinal })
        .subscribe({next: console.log, error: console.error});
    } else {
      const errback = function(err) { console.log(err); };
      StackTrace.fromError(error).then(callback).catch(errback);
    }
    throw error;
  }

}
