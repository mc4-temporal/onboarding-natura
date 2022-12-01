import {Component, OnInit} from '@angular/core';
import {ParticipanteService} from '../../../commons/services/configuracion/participante.service';
import {ITableColumn, ITableEvents, ITableRowAction, noopTableEvent, PaginatedFn} from '../../../../@mc4/shared/table/table.model';
import {MatTableDataSource} from '@angular/material/table';
import {BehaviorSubject, Observable} from 'rxjs';
import {IParticipante, IParticipanteReq, ITechnicalData} from '../../../commons/model/configuracion.interface';
import {EntityRegisterDialogComponent} from '../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.component';
import {buildBottomSheetConfig, buildEntityRegisterDialog, buildRightDialogConfig} from '../../../commons/utils/dialog.util';
import {MatDialog} from '@angular/material/dialog';
import {IEntityRegisterDialog} from '../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.model';
import {Loading} from 'notiflix';
import {UtilService} from '../../../commons/services/util.service';
import {participanteTableColums, registerParticipanteDialogConfig} from './participante.util';
import {CertificadoService} from '../../../commons/services/configuracion/certificado.service';
import {MatBottomSheet} from '@angular/material/bottom-sheet';
import {CertComponent, ICertBottomShetData} from './cert/cert.component';
import {ResourceService} from '../../../commons/services/security/resource.service';
import {resourceCode} from '../../../commons/utils/constants';
import {ITechnicalDataRegister, TechnicalDataComponent} from './technical-data/technical-data.component';
import * as Notiflix from 'notiflix';

@Component({
  selector: 'mc4-participante',
  templateUrl: './participante.component.html',
  styleUrls: ['./participante.component.scss']
})
export class ParticipanteComponent implements OnInit {
  columns: ITableColumn[];
  rowActions: ITableRowAction[] = [];
  commonTableActions: any;
  dataSource: MatTableDataSource<IParticipante>;
  tableEvents = new BehaviorSubject<ITableEvents>(noopTableEvent());
  userActions: { [key: string]: boolean } = {};

  constructor(private participanteService: ParticipanteService,
              private utilService: UtilService,
              private certificadoService: CertificadoService,
              private resourceService: ResourceService,
              private matDialog: MatDialog,
              private matBottomShet: MatBottomSheet) {
    this.commonTableActions = {
      showCertList: '100',
      technicalData: '101'
    };
    this.columns = this.buildTableColumns();
    this.dataSource = new MatTableDataSource<IParticipante>();
  }

  ngOnInit() {
    this.tableEvents.subscribe(this.tableActionManager);
    this.resourceService.requestActionList(resourceCode.participanteResourceCode)
      .subscribe({next: this.successActionList});
  }

  requestParticipanteListFn: PaginatedFn = (queryParams: any) => this.participanteService.requestParticipanteLis(queryParams);

  filterData(filter: string) {
    const aditionalParams = {filter};
    this.tableEvents.next({event: 'RESET', data: {aditionalParams}});
  }

  participanteItemFormat = (content: IParticipante[]) => {
    return content.map(item => {
      if (item.camara) item.camaraStr = item.camara.nombre;
      else item.camaraStr = '';
      if (item.padre) item.padreStr = item.padre.nombre;
      else item.padreStr = '';
      return item;
    });
  }

  createUpdateParticipante = async (item: IParticipante = null) => {
    Loading.pulse();
    const queryParams = {
      page: 0, size: 1000,
    };
    const participantResp = await this.participanteService.requestParticipanteLis(queryParams)
      .toPromise()
      .catch(console.error);

    if (participantResp) {
      const tipoParticipanteList = await this.utilService.requestEnumAsList('tipoParticipante')
        .toPromise()
        .catch(console.error);
      Loading.remove(300);

      if (tipoParticipanteList) {
        const data = item ? this.buildUpdateDialogData(item) : this.buildRegisterDialogData(participantResp.content, tipoParticipanteList);
        this.matDialog.open(EntityRegisterDialogComponent, buildEntityRegisterDialog(data))
          .afterClosed()
          .subscribe(this.afterDialogReload);
      }
    }
  }

  buildFieldsAndRegister = (formValue: IParticipanteReq): Observable<any> => {
    return new Observable<any>(subscriber => {
      this.participanteService.requestCreateParticipante(formValue)
        .subscribe((body) => {
          subscriber.next(body);
          subscriber.unsubscribe();
        });
    });
  }

  protected successActionList = (data: any) => {
    this.userActions = data;
    this.rowActions = this.buildRowActions();
    if (this.rowActions.length === 0) this.tableEvents.next({event: 'RELOAD_ACTIONS'});
  }

  protected afterDialogReload = (result) => {
    if (result) {
      Notiflix.Notify.success('Solicitud finalizada con éxito.');
      this.tableEvents.next({event: 'RESET'});
    }
  }

  protected tableActionManager = (event: ITableEvents) => {
    if (event.event === 'ROW_CLICK') {
      this.rowActionEvent(event.data);
    }
  }

  protected rowActionEvent = (event: { item: any, actionCode: string }) => {
    const {item, actionCode} = event;
    if (actionCode === this.commonTableActions.showCertList) this.showCerList(item);
    if (actionCode === this.commonTableActions.technicalData) this.technicalDataConfig(item);
  }

  protected buildRegisterDialogData = (participanteList: IParticipante[], tipoParticipanteList: any[]): IEntityRegisterDialog =>
    registerParticipanteDialogConfig(participanteList, tipoParticipanteList, this.buildFieldsAndRegister)

  protected buildUpdateDialogData = (item: IParticipante): IEntityRegisterDialog => null;

  protected buildTableColumns = (): ITableColumn[] => participanteTableColums;

  protected buildRowActions = (): ITableRowAction[] => {
    const actions = [];
    if (this.userActions.viewCertAction) actions.push({
      action: 'Ver Certificados',
      actionCode: this.commonTableActions.showCertList,
      icon: 'list'
    });
    actions.push({
      action: 'Datos Técnicos',
      actionCode: this.commonTableActions.technicalData,
      icon: 'list'
    });
    return actions;
  }

  protected showCerList(item: IParticipante) {
    this.matBottomShet.open(CertComponent, buildBottomSheetConfig<ICertBottomShetData>({participante: item, userActions: this.userActions}))
      .afterDismissed()
      .subscribe(result => {
        console.log(result);
      });
  }

  protected async technicalDataConfig(item: IParticipante) {
    Notiflix.Loading.pulse();
    this.participanteService.requestGetTechnicalData(item.id)
      .subscribe({next: (body) => this.successGetTechnicalData(item.id, body)});
  }

  protected successGetTechnicalData = (participanteId: number, body: ITechnicalData) => {
    Notiflix.Loading.remove();
    const data: ITechnicalDataRegister = {
      participanteId,
      terchnicalData: body
    };
    this.matDialog.open(TechnicalDataComponent, buildRightDialogConfig(data))
      .afterClosed()
      .subscribe(this.afterDialogReload);
  }
}
