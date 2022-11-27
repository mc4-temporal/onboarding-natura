import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { LayoutComponent } from "./layout/layout.component";
import { AuthGuardService } from "./commons/guard/auth-guard.service";

const routes: Routes = [
  {
    path: "login",
    loadChildren: () =>
      import("./pages/authentication/login/login.module").then(
        (m) => m.LoginModule
      ),
  },
  {
    path: "register",
    loadChildren: () =>
      import("./pages/authentication/register/register.module").then(
        (m) => m.RegisterModule
      ),
  },
  {
    path: "forgot-password",
    loadChildren: () =>
      import(
        "./pages/authentication/forgot-password/forgot-password.module"
      ).then((m) => m.ForgotPasswordModule),
  },
  {
    path: "coming-soon",
    loadChildren: () =>
      import("./pages/coming-soon/coming-soon.module").then(
        (m) => m.ComingSoonModule
      ),
  },
  {
    path: "",
    component: LayoutComponent,
    children: [
      {
        path: "",
        loadChildren: () =>
          import("./pages/blank/blank.module").then((m) => m.BlankModule),
        pathMatch: "full",
        canActivate: [AuthGuardService],
      },
      {
        path: "security",
        loadChildren: () =>
          import("./pages/security/security.module").then(
            (m) => m.SecurityModule
          ),
        canActivate: [AuthGuardService],
      },
      {
        path: "paneles",
        loadChildren: () =>
          import("./pages/paneles/paneles.module").then((m) => m.PanelesModule),
        canActivate: [AuthGuardService],
      },
      {
        path: "configuracion",
        loadChildren: () =>
          import("./pages/configuracion/configuracion.module").then(
            (m) => m.ConfiguracionModule
          ),
        canActivate: [AuthGuardService],
      },
      {
        path: "monitoreo",
        loadChildren: () =>
          import("./pages/monitoreo/monitoreo.module").then(
            (m) => m.MonitoreoModule
          ),
        canActivate: [AuthGuardService],
      },
      {
        path: "components",
        loadChildren: () =>
          import("./pages/components/components.module").then(
            (m) => m.ComponentsModule
          ),
      },
      {
        path: "forms/form-elements",
        loadChildren: () =>
          import("./pages/forms/form-elements/form-elements.module").then(
            (m) => m.FormElementsModule
          ),
      },
      {
        path: "forms/form-wizard",
        loadChildren: () =>
          import("./pages/forms/form-wizard/form-wizard.module").then(
            (m) => m.FormWizardModule
          ),
      },
      {
        path: "page-layouts",
        loadChildren: () =>
          import("./pages/page-layouts/page-layouts.module").then(
            (m) => m.PageLayoutsModule
          ),
      },
      {
        path: "dashboard",
        loadChildren: () =>
          import("./pages/dashboard/dashboard.module").then(
            (m) => m.DashboardModule
          ),
      },
      {
        path: "icons",
        loadChildren: () =>
          import("./pages/icons/icons.module").then((m) => m.IconsModule),
      },
    ],
  },
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, {
      initialNavigation: "enabled",
      // preloadingStrategy: PreloadAllModules,
      scrollPositionRestoration: "enabled",
      anchorScrolling: "enabled",
      relativeLinkResolution: "legacy",
    }),
  ],
  exports: [RouterModule],
})
export class AppRoutingModule {}
