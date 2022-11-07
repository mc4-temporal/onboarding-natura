import {Component, Inject, OnInit} from '@angular/core';
import {MAT_BOTTOM_SHEET_DATA, MatBottomSheetRef} from '@angular/material/bottom-sheet';
import {ITableColumn, ITableEvents, ITableRowAction, noopTableEvent, PaginatedFn} from '../../../../../@mc4/shared/table/table.model';
import {MatTableDataSource} from '@angular/material/table';
import {ICertificado, IParticipante, ITechnicalData} from '../../../../commons/model/configuracion.interface';
import {BehaviorSubject, Observable} from 'rxjs';
import {certTableColums, addCertParticipanteDialogConfig} from '../participante.util';
import {CertificadoService} from '../../../../commons/services/configuracion/certificado.service';
import {EntityRegisterDialogComponent} from '../../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.component';
import {buildEntityRegisterDialog} from '../../../../commons/utils/dialog.util';
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from '@angular/material/dialog';
import {
  EntityRegisterServiceFn,
  FieldItem,
  IEntityRegisterDialog
} from '../../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.model';
import {DatePipe} from '@angular/common';
import {Loading} from 'notiflix';
import {saveAs} from 'file-saver';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {FileHandle} from '../../../../../@mc4/pipes/drag-area.directive';
import {DomSanitizer} from '@angular/platform-browser';
import {ParticipanteService} from '../../../../commons/services/configuracion/participante.service';
import * as Notiflix from 'notiflix';

@Component({
  selector: 'mc4-cert',
  templateUrl: './technical-data.component.html',
  styleUrls: ['./technical-data.component.scss']
})
export class TechnicalDataComponent implements OnInit {
  form: FormGroup;
  testResponse: string;
  constructor(public dialogRef: MatDialogRef<EntityRegisterDialogComponent>,
              @Inject(MAT_DIALOG_DATA) public data: ITechnicalDataRegister,
              private participanteService: ParticipanteService) { }

  ngOnInit() {
    this.form = new FormGroup({
      url: new FormControl(this.valueForControl('url'), Validators.compose([Validators.required])),
      connectTimeout: new FormControl(this.valueForControl('connectTimeout'), Validators.compose([Validators.required, Validators.min(10)])),
      readTimeout: new FormControl(this.valueForControl('readTimeout'), Validators.compose([Validators.required, Validators.min(10)])),
      receptorRequestBody: new FormControl(this.valueForControl('receptorRequestBody'), Validators.compose([Validators.required])),
      receptorResponsePartName: new FormControl(this.valueForControl('receptorResponsePartName'), Validators.compose([Validators.required])),
      receptoProcesadasBody: new FormControl(this.valueForControl('receptoProcesadasBody'), Validators.compose([Validators.required])),
      responseProcesadasResponsePartName: new FormControl(this.valueForControl('responseProcesadasResponsePartName'), Validators.compose([Validators.required])),
      receptorExpressBody: new FormControl(this.valueForControl('receptorExpressBody'), Validators.compose([Validators.required])),
      receptorExpressResponsePartName: new FormControl(this.valueForControl('receptorExpressResponsePartName'), Validators.compose([Validators.required])),
      testBody: new FormControl(this.valueForControl('testBody'), Validators.compose([Validators.required])),
      testResponsePartName: new FormControl(this.valueForControl('testResponsePartName'), Validators.compose([Validators.required])),
    });
  }

  submitForm() {
    if (this.form.valid) {
      if (this.data.terchnicalData) this.updateTechnicalData();
      else this.addTechnicalData();
    }
  }

  testMethod() {
    this.testResponse = null;
    Notiflix.Loading.pulse();
    this.participanteService.requestTestTechnicalData(this.form.value)
      .subscribe({next: this.successTest});
  }

  protected successTest = (body: any) => {
    Notiflix.Loading.remove();
    this.testResponse = body;
  }

  protected valueForControl(controlName: string): any {
    if (!this.data.terchnicalData) return null;
    return this.data.terchnicalData[controlName];
  }

  protected addTechnicalData() {
    Notiflix.Loading.pulse();
    this.participanteService.requestAddTechnicalData(this.data.participanteId, this.form.value)
      .subscribe({next: this.successService});
  }

  protected updateTechnicalData() {
    Notiflix.Loading.pulse();
    this.participanteService.requestUpdateTechnicalData(this.data.terchnicalData.id, this.form.value)
      .subscribe({next: this.successService});
  }

  protected successService = () => {
    Notiflix.Loading.remove();
    this.dialogRef.close(true);
  }
}

export interface ITechnicalDataRegister {
  participanteId: number;
  terchnicalData: ITechnicalData;
}
