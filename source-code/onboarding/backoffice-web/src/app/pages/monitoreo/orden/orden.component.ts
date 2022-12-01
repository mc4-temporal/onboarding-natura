import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import * as moment from 'moment';
import {UtilService} from '../../../commons/services/util.service';
import {enumKeyId, EstadoOrden, IEnumDto} from '../../../commons/model/enum.value';
import {
  ITableColumn,
  ITableEvents,
  ITableRowAction,
  noopTableEvent,
  PaginatedFn,
  TableEventType
} from '../../../../@mc4/shared/table/table.model';
import {MatTableDataSource} from '@angular/material/table';
import {IMensaje, IOrdenResp} from '../../../commons/model/monitoreo.interface';
import {BehaviorSubject, combineLatest, Observable} from 'rxjs';
import {ordenEntityRegisterConfig, ordenQrEntityRegisterConfig, ordenTableColumnsConfig} from './orden.util';
import {DateUtil} from '../../../commons/utils/date.util';
import {OrdenService} from '../../../commons/services/monitoreo/orden.service';
import {DatePipe} from '@angular/common';
import {resourceCode} from '../../../commons/utils/constants';
import {ResourceService} from '../../../commons/services/security/resource.service';
import {map} from 'rxjs/operators';
import {EntityRegisterDialogComponent} from '../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.component';
import {buildBottomSheetConfig, buildEntityRegisterDialog} from '../../../commons/utils/dialog.util';
import {MatDialog} from '@angular/material/dialog';
import {BusinessService} from '../../../commons/services/business/business.service';
import {ParticipanteService} from '../../../commons/services/configuracion/participante.service';
import {GenerarOrdenQrReq, TransferReq} from '../../../commons/model/business.interface';
import {IOrdenMensajesBottomSheetData, OrdenMensajesComponent} from './orden-mensajes/orden-mensajes.component';
import {MatBottomSheet} from '@angular/material/bottom-sheet';
import * as Notiflix from 'notiflix';
import {Loading} from 'notiflix';
import {FormUtil} from '../../../commons/utils/form.util';
import {saveAs} from 'file-saver';
import {QrViewComponent} from './qr-view.component/qr-view.component';

@Component({
  selector: 'mc4-orden',
  templateUrl: './orden.component.html',
  styleUrls: ['./orden.component.scss']
})
export class OrdenComponent implements OnInit {
  form: FormGroup;
  estadoOrdenList: IEnumDto[];
  etapaOrdenList: IEnumDto[];
  tipoOrdenList: IEnumDto[];
  dateRangeConfig = {min: null, max: null};

  showDataTable = false;
  columns: ITableColumn[];
  rowActions: ITableRowAction[];
  commonTableActions: any;
  dataSource: MatTableDataSource<IOrdenResp>;
  tableEvents = new BehaviorSubject<ITableEvents>(noopTableEvent());
  userActions: {[key: string]: boolean} = {};

  constructor(private ordenService: OrdenService,
              private resourceService: ResourceService,
              private utilService: UtilService,
              private businessService: BusinessService,
              private participanteService: ParticipanteService,
              private datePipe: DatePipe,
              private matDialog: MatDialog,
              private matBottomShet: MatBottomSheet) {
    this.commonTableActions = {
      viewMessagesCode: '100'
    };
    this.form = new FormGroup({
      fechaInicio: new FormControl(moment().subtract(10, 'days').toDate(), Validators.required),
      fechaFin: new FormControl(moment().toDate(), Validators.required),
      estadoOrden: new FormControl(''),
      etapaOrden: new FormControl(''),
      tipoOrden: new FormControl(''),
      numOrdenOriginante: new FormControl(null),
      numOrdenDestinatario: new FormControl(null),
    });

    this.dateRangeConfig.min = moment().subtract(1, 'year').toDate();
    this.dateRangeConfig.max = moment().toDate();

    this.columns = this.buildTableColumns();
    this.dataSource = new MatTableDataSource<IOrdenResp>();
  }

  async ngOnInit() {
    this.tableEvents.subscribe(this.tableActionManager);
    this.resourceService.requestActionList(resourceCode.ordenResourceCode)
      .subscribe({next: this.successActionList});

    combineLatest([
      this.utilService.requestEnumAsList(enumKeyId.estadoOrden),
      this.utilService.requestEnumAsList(enumKeyId.etapaOrden),
      this.utilService.requestEnumAsList(enumKeyId.tipoOrden)
    ]).pipe(
      map(([estadoOrdenList, etapaOrdenList, tipoOrdenList]) => ({
        estadoOrdenList,
        etapaOrdenList,
        tipoOrdenList
      }))
    ).subscribe((combineResp) => {
      this.estadoOrdenList = combineResp.estadoOrdenList;
      this.etapaOrdenList = combineResp.etapaOrdenList;
      this.tipoOrdenList = combineResp.tipoOrdenList;
      this.applyFilter();
    });
  }

  itemOrdenFormatterFn = (content: IOrdenResp[]): IOrdenResp[] => {
    return content.map(item => {
      if (item.participanteOrigen) item.partOrigenStr = item.participanteOrigen.nombre;
      if (item.participanteDestino) item.partDestinoStr = item.participanteDestino.nombre;
      if (item.createdDate) item.createdDate = this.datePipe.transform(item.createdDate, DateUtil.buildFullDatePipeFormat());
      if (item.inicioProcesamiento) item.inicioProcesamiento = this.datePipe.transform(item.inicioProcesamiento, DateUtil.buildFullDatePipeFormat());
      if (item.finProcesamiento) item.finProcesamiento = this.datePipe.transform(item.finProcesamiento, DateUtil.buildFullDatePipeFormat());
      return item;
    });
  }

  requestOrdenListFn: PaginatedFn = (queryParams: any) => this.ordenService.requestOrdenList(queryParams);

  applyFilter(event: TableEventType = 'RESET') {
    if (this.form.valid) {
      const aditionalParams = {...this.form.value};
      aditionalParams.fechaInicio = moment(aditionalParams.fechaInicio).format(DateUtil.buildFullDateMomentFormat('-'));
      aditionalParams.fechaFin = moment(aditionalParams.fechaFin).format(DateUtil.buildFullDateMomentFormat('-'));

      this.showDataTable = true;
      this.tableEvents.next({event, data: {aditionalParams}});
    }
  }

  createOrden() {
    combineLatest([
      this.participanteService.requestParticipanteOriginadorList(),
      this.participanteService.requestParticipanteReceptorList(),
    ]).pipe(
      map(([participanteOriginadorList, participanteReceptorList]) => ({
        participanteOriginadorList,
        participanteReceptorList
      }))
    ).subscribe((combineResp) => {
      const dominioMonedaList = [{codigo: 'BOB', descripcion: 'BOB'}, {codigo: 'USD', descripcion: 'USD'}];
      const tipoCuentaOrigenList = [
        {codigo: 'CEFECTIVOO', descripcion: 'CEFECTIVOO'},
        {codigo: 'CCAO', descripcion: 'CCAO'},
        {codigo: 'CMOVILO', descripcion: 'CMOVILO'}
      ];
      const tipoCuentaDestinoList = [
        {codigo: 'CCAD', descripcion: 'CCAD'},
        {codigo: 'CPRESTAMOD', descripcion: 'CPRESTAMOD'},
        {codigo: 'CTARJETAD', descripcion: 'CTARJETAD'},
        {codigo: 'CMOVILD', descripcion: 'CMOVILD'},
        {codigo: 'CTELEFONIAD', descripcion: 'CTELEFONIAD'},
        {codigo: 'CPOSD', descripcion: 'CPOSD'},
        {codigo: 'CPASARELAD', descripcion: 'CPASARELAD'}
      ];
      const tipoRegistro = [
        {codigo: 'SYNC', descripcion: 'Síncrono'},
        {codigo: 'ASYNC', descripcion: 'Asíncrono'},
      ];
      const data = ordenEntityRegisterConfig(
        this.ordenEntityRegisterSubmit,
        combineResp.participanteOriginadorList,
        combineResp.participanteReceptorList,
        this.tipoOrdenList,
        dominioMonedaList,
        tipoCuentaOrigenList,
        tipoCuentaDestinoList,
        tipoRegistro
      );
      this.matDialog.open(EntityRegisterDialogComponent, buildEntityRegisterDialog(data))
        .afterClosed()
        .subscribe(console.log);
    });
  }

  ordenEntityRegisterSubmit = (formValue: TransferReq): Observable<any> => {
    return new Observable<any>(subscriber => {
      if (formValue.tipoRegistro === 'SYNC') {
        this.businessService.requestTransferSync(formValue)
          .subscribe((body) => {
            subscriber.next(body);
            subscriber.unsubscribe();
          });
      } else {
        this.businessService.requestTransferAsync(formValue)
          .subscribe((body) => {
            subscriber.next(body);
            subscriber.unsubscribe();
          });
      }
    });
  }

  createOrdenQr() {
    combineLatest([
      this.participanteService.requestParticipanteOriginadorList(),
    ]).pipe(
      map(([participanteOriginadorList]) => ({
        participanteOriginadorList,
      }))
    ).subscribe((combineResp) => {
      const dominioMonedaList = [{codigo: 'BOB', descripcion: 'BOB'}, {codigo: 'USD', descripcion: 'USD'}];
      const data = ordenQrEntityRegisterConfig(
        (body: GenerarOrdenQrReq) => this.businessService.requestGenerarOrdenQr(body),
        combineResp.participanteOriginadorList,
        dominioMonedaList,
      );
      this.tableEvents.next({event: 'STOP_COUNTER_TO_RELOAD'});
      this.matDialog.open(EntityRegisterDialogComponent, buildEntityRegisterDialog(data))
        .afterClosed()
        .subscribe(this.afterClosedOrdenQr);
    });
  }

  protected afterClosedOrdenQr = (result) => {
    if (result) {
      const data = {
        imgBase64: 'data:image/png;base64,' + result
      };
      this.matBottomShet.open(QrViewComponent, buildBottomSheetConfig(data))
        .afterDismissed()
        .subscribe(res => {
          this.tableEvents.next({event: 'RESET'});
        });
    }
  }

  protected tableActionManager = (event: ITableEvents) => {
    if (event.event === 'ROW_CLICK') {
      this.rowActionEvent(event.data);
    }
    if (event.event === 'DATA_IS_LOADED') {
      this.verificarEstados();
    }
  }

  protected verificarEstados() {
    if (this.dataSource.data) {
      const dataPendiente = this.dataSource.data.findIndex(it => it.estadoOrden === EstadoOrden.pe || it.estadoOrden === EstadoOrden.tr);
      if (dataPendiente >= 0) {
        this.tableEvents.next({event: 'START_COUNTER_TO_RELOAD'});
      } else {
        this.tableEvents.next({event: 'STOP_COUNTER_TO_RELOAD'});
      }
    }
  }

  protected rowActionEvent = (event: {item: any, actionCode: string}) => {
    const {item, actionCode} = event;
    if (actionCode === this.commonTableActions.viewMessagesCode) this.verOrdenMensajes(item);
  }

  protected verOrdenMensajes(item: IOrdenResp) {
    Notiflix.Loading.pulse();
    this.ordenService.requestOrdenMensajeList(item.id)
      .subscribe({next: (resp) => this.exitoMensajeList(resp, item)});
  }

  protected exitoMensajeList = (mensajeList: IMensaje[], orden: IOrdenResp) => {
    Loading.remove(300);
    this.tableEvents.next({event: 'STOP_COUNTER_TO_RELOAD'});
    this.matBottomShet.open(
      OrdenMensajesComponent,
      buildBottomSheetConfig<IOrdenMensajesBottomSheetData>({
        mensajeList,
        orden
      })
    ).afterDismissed()
      .subscribe(res => {
        this.verificarEstados();
      });
  }

  protected rowIsLoading = (row: IOrdenResp) => row.estadoOrden === 'PE';

  protected buildTableColumns = (): ITableColumn[] => ordenTableColumnsConfig(this.rowIsLoading);

  protected successActionList = (data: any) => {
    this.userActions = data;
    this.rowActions = this.buildRowActions();
    if (this.rowActions.length === 0) this.tableEvents.next({event: 'RELOAD_ACTIONS'});
  }

  protected buildRowActions = (): ITableRowAction[] => {
    const actions = [];
    if (this.userActions.viewMessagesAction) actions.push({
      action: 'Ver mensajes',
      actionCode: this.commonTableActions.viewMessagesCode,
      icon: 'list'
    });
    return actions;
  }
}
