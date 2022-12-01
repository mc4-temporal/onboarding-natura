import {Component, Inject, OnInit} from '@angular/core';
import {MAT_BOTTOM_SHEET_DATA, MatBottomSheetRef} from '@angular/material/bottom-sheet';
import {ITableColumn, ITableEvents, ITableRowAction, noopTableEvent, PaginatedFn} from '../../../../../@mc4/shared/table/table.model';
import {MatTableDataSource} from '@angular/material/table';
import {ICertificado, IParticipante} from '../../../../commons/model/configuracion.interface';
import {BehaviorSubject, Observable} from 'rxjs';
import {certTableColums, addCertParticipanteDialogConfig} from '../participante.util';
import {CertificadoService} from '../../../../commons/services/configuracion/certificado.service';
import {EntityRegisterDialogComponent} from '../../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.component';
import {buildEntityRegisterDialog} from '../../../../commons/utils/dialog.util';
import {MatDialog} from '@angular/material/dialog';
import {IEntityRegisterDialog} from '../../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.model';
import {DatePipe} from '@angular/common';
import {Loading} from 'notiflix';
import {saveAs} from 'file-saver';

@Component({
  selector: 'mc4-cert',
  templateUrl: './cert.component.html',
  styleUrls: ['./cert.component.scss']
})
export class CertComponent implements OnInit {
  columns: ITableColumn[] = certTableColums;
  rowActions: ITableRowAction[];
  tableActionsCode: any;
  dataSource: MatTableDataSource<ICertificado>;
  tableEvents = new BehaviorSubject<ITableEvents>(noopTableEvent());
  constructor(public bottomSheetRef: MatBottomSheetRef<CertComponent>,
              @Inject(MAT_BOTTOM_SHEET_DATA) public data: ICertBottomShetData,
              private certService: CertificadoService,
              private matDialog: MatDialog,
              private datePipe: DatePipe) {
    this.tableActionsCode = {
      downFileCode: '100',
      updateCertCode: '101',
    };
    this.rowActions = this.buildRowActions();
    this.dataSource = new MatTableDataSource<ICertificado>();
  }

  ngOnInit() {
    this.tableEvents.subscribe(this.tableActionManager);
  }

  certItemFormat = (content: ICertificado[]) => {
    return content.map(item => {
      item.fechaVencimiento = this.datePipe.transform(item.fechaVencimiento, 'dd/MM/yyyy HH:mm:ss');
      return item;
    });
  }

  addCert() {
    const data = this.buildUpdateCertDialogData();
    this.matDialog.open(EntityRegisterDialogComponent, buildEntityRegisterDialog(data))
      .afterClosed()
      .subscribe(this.afterAddCert);
  }

  protected tableActionManager = (event: ITableEvents) => {
    if (event.event === 'ROW_CLICK') {
      this.rowActionEvent(event.data);
    }
  }

  protected rowActionEvent = (event: {item: ICertificado, actionCode: string}) => {
    const {item, actionCode} = event;
    if (actionCode === this.tableActionsCode.downFileCode) this.downCert(item);
  }

  protected downCert(item: ICertificado) {
    Loading.pulse();
    this.certService.requestDownCertFile(this.data.participante.id, item.id)
      .subscribe({
        next: (blob) => {
          saveAs(blob, `Cert-${this.data.participante.id}.cer`);
          Loading.remove(300);
        }
      });
  }

  protected afterAddCert = (result) => {
    if (result) {
      this.tableEvents.next({event: 'RESET'});
    }
  }

  protected buildUpdateCertDialogData = (): IEntityRegisterDialog =>
    addCertParticipanteDialogConfig(this.data.participante, this.buildFieldsAndUpdateCert)

  buildFieldsAndUpdateCert = (formValue: any): Observable<any> => {
    return new Observable<any>(subscriber => {
      this.certService.requestAddCertParticipante(this.data.participante.id, formValue)
        .subscribe((body) => {
          subscriber.next(body);
          subscriber.unsubscribe();
        });

    });
  }

  requestCertListFn: PaginatedFn = (queryParams: any) =>
    this.certService.requestCertList({...queryParams, participanteId: this.data.participante.id})

  protected buildRowActions = (): ITableRowAction[] => {
    const actions = [];
    if (this.data.userActions.downCertAction) actions.push({
      action: 'Descargar Certificado',
      actionCode: this.tableActionsCode.downFileCode,
      icon: 'download'
    });
    // if (this.data.userActions.updateCertAction) actions.push({
    //   action: 'Actualizar Certificado',
    //   actionCode: this.tableActionsCode.updateCertCode,
    //   icon: 'security'
    // });
    return actions;
  }
}

export interface ICertBottomShetData {
  participante: IParticipante;
  userActions: any;
}
