import { NgModule } from "@angular/core";
import { CommonModule, DatePipe } from "@angular/common";
import { DirectorComponent } from "./director.component";
import { DirectorRoutingModule } from "./director-routing.module";
import { FlexLayoutModule } from "@angular/flex-layout";
import { MC4SharedModule } from "src/@mc4/mc4-shared.module";
import { MC4CardModule } from "src/@mc4/shared/card/card.module";
import { ListModule } from "src/@mc4/shared/list/list.module";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { MatBottomSheetModule } from "@angular/material/bottom-sheet";
import { MatChipsModule } from "@angular/material/chips";
import { MatDatepickerModule } from "@angular/material/datepicker";
import { MatDialogModule } from "@angular/material/dialog";
import { MatDividerModule } from "@angular/material/divider";
import { MatSelectModule } from "@angular/material/select";
import { MatTabsModule } from "@angular/material/tabs";
import { MatTooltipModule } from "@angular/material/tooltip";
import { LogRoutingModule } from "../../security/log/log-routing.module";

@NgModule({
  declarations: [DirectorComponent],
  imports: [
    CommonModule,
    DirectorRoutingModule,
    MC4SharedModule,
    MC4CardModule,
    FlexLayoutModule,
    ListModule,
    FormsModule,
    ReactiveFormsModule,
    MatDatepickerModule,
    MatSelectModule,
    LogRoutingModule,
    MatDialogModule,
    MatTabsModule,
    MatChipsModule,
    MatDividerModule,
    MatTooltipModule,
    MatBottomSheetModule,
  ],
  providers: [DatePipe],
})
export class DirectorModule {}
