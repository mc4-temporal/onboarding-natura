import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";

const routes: Routes = [
  {
    path: "directora",
    loadChildren: () =>
      import("./director/director.module").then((m) => m.DirectorModule),
  },
  {
    path: "colaborador",
    loadChildren: () =>
      import("./colaborador/colaborador.module").then(
        (m) => m.ColaboradorModule
      ),
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class PanelesRoutingModule {}
