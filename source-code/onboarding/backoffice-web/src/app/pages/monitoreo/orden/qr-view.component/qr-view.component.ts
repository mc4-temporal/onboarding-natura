import {Component, Inject, OnInit} from '@angular/core';
import {MAT_BOTTOM_SHEET_DATA, MatBottomSheetRef} from '@angular/material/bottom-sheet';
import {saveAs} from 'file-saver';
import * as moment from 'moment';

@Component({
  selector: 'mc4-qr-view',
  template: `
    <mc4-card-header>
      <mc4-card-header-heading fxLayoutAlign="center center">
        <h3 class="text-primary">Orden QR Generada</h3>
      </mc4-card-header-heading>
      <mc4-card-header-actions>
        <button mat-icon-button
                color="accent"
                matTooltip="Descargar"
                type="button"
                (click)="downloadQr()">
          <mat-icon>download</mat-icon>
        </button><button mat-icon-button
                color="warn"
                matTooltip="Cerrar"
                type="button"
                (click)="bottomSheetRef.dismiss()">
          <mat-icon>close</mat-icon>
        </button>
      </mc4-card-header-actions>
    </mc4-card-header>
    <mc4-card-content>
      <div fxLayout="row wrap" fxLayoutAlign="center center">
        <div fxFlex="100"
             fxFlex.gt-md="25"
             fxLayoutAlign="center center"
             class="img-container">
          <img [src]="this.data.imgBase64" alt="Qr">
        </div>
      </div>
    </mc4-card-content>
  `
})

export class QrViewComponent implements OnInit {
  constructor(public bottomSheetRef: MatBottomSheetRef<QrViewComponent>,
              @Inject(MAT_BOTTOM_SHEET_DATA) public data: any) {
  }

  ngOnInit() {
  }

  downloadQr() {
    saveAs(this.data.imgBase64, `QR_${moment().format('DDMMYYYY_HHMMss')}.jpg`);
  }
}
