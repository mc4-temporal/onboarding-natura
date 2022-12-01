import { HttpClientModule } from "@angular/common/http";
import { BrowserModule } from "@angular/platform-browser";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations"; // Needed for Touch functionality of Material Components
import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { LayoutModule } from "./layout/layout.module";
import { PendingInterceptorModule } from "../@mc4/shared/loading-indicator/pending-interceptor.module";
import { AuthGuardService } from "./commons/guard/auth-guard.service";
import {
  MAT_FORM_FIELD_DEFAULT_OPTIONS,
  MatFormFieldDefaultOptions,
} from "@angular/material/form-field";
import {
  MAT_SNACK_BAR_DEFAULT_OPTIONS,
  MatSnackBarConfig,
} from "@angular/material/snack-bar";
import {
  DateAdapter,
  MAT_DATE_FORMATS,
  MAT_DATE_LOCALE,
} from "@angular/material/core";
import {
  MAT_MOMENT_DATE_ADAPTER_OPTIONS,
  MomentDateAdapter,
} from "@angular/material-moment-adapter";
import { ErrorHandler, LOCALE_ID, NgModule } from "@angular/core";
import localeEs from "@angular/common/locales/es-BO";
import { httpInterceptorProvider } from "./commons/interceptor";
import { registerLocaleData } from "@angular/common";
import * as moment from "moment";
import { NotiflixInit } from "../@mc4/utils/notiflix.init";
import { GlobalErrorHandler } from "./commons/interceptor/global-error.handler";

NotiflixInit.notiflixConfirmInit();
NotiflixInit.notiflixLoadingInit();
registerLocaleData(localeEs, "es-BO");
moment.locale("es-BO");

const CUSTOM_DATE_PICKER_FORMAT = {
  parse: {
    dateInput: "L",
  },
  display: {
    dateInput: "L",
    monthYearLabel: "MMM YYYY",
    dateA11yLabel: "L",
    monthYearA11yLabel: "MMMM YYYY",
  },
};

@NgModule({
  imports: [
    // Angular Core Module // Don't remove!
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,

    // MC4 Core Modules
    AppRoutingModule,

    // Layout Module (Sidenav, Toolbar, Quickpanel, Content)
    LayoutModule,

    // Displays Loading Bar when a Route Request or HTTP Request is pending
    PendingInterceptorModule,

    // Register a Service Worker (optional)
    // ServiceWorkerModule.register('ngsw-worker.js', { enabled: environment.production })
  ],
  declarations: [AppComponent],
  bootstrap: [AppComponent],
  providers: [
    httpInterceptorProvider,
    {
      provide: ErrorHandler,
      useClass: GlobalErrorHandler,
    },
    { provide: LOCALE_ID, useValue: "es-BO" },
    {
      provide: DateAdapter,
      useClass: MomentDateAdapter,
      deps: [MAT_DATE_LOCALE, MAT_MOMENT_DATE_ADAPTER_OPTIONS],
    },
    { provide: MAT_DATE_FORMATS, useValue: CUSTOM_DATE_PICKER_FORMAT },
    {
      provide: MAT_FORM_FIELD_DEFAULT_OPTIONS,
      useValue: {
        appearance: "outline",
      } as MatFormFieldDefaultOptions,
    },
    {
      provide: MAT_SNACK_BAR_DEFAULT_OPTIONS,
      useValue: {
        duration: 3000,
        horizontalPosition: "end",
        verticalPosition: "bottom",
      } as MatSnackBarConfig,
    },
    AuthGuardService,
  ],
})
export class AppModule {}
