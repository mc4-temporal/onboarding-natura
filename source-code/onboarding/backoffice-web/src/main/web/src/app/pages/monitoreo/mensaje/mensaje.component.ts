import {Component, OnInit} from '@angular/core';
import {ITableColumn, ITableEvents, noopTableEvent, PaginatedFn} from '../../../../@mc4/shared/table/table.model';
import {MatTableDataSource} from '@angular/material/table';
import {BehaviorSubject, combineLatest} from 'rxjs';
import {IMensaje} from '../../../commons/model/monitoreo.interface';
import {MensajeService} from '../../../commons/services/monitoreo/mensaje.service';
import {FormControl, FormGroup} from '@angular/forms';
import {UtilService} from '../../../commons/services/util.service';
import * as moment from 'moment';
import {DateUtil} from '../../../commons/utils/date.util';
import {actionXmlCode, mensajeTableColums} from './mensaje.util';
import {ResourceService} from '../../../commons/services/security/resource.service';
import {resourceCode} from '../../../commons/utils/constants';
import {map} from 'rxjs/operators';
import {DatePipe} from '@angular/common';

@Component({
  selector: 'mc4-mensaje',
  templateUrl: './mensaje.component.html',
  styleUrls: ['./mensaje.component.scss']
})
export class MensajeComponent implements OnInit {
  columns: ITableColumn[];
  dataSource: MatTableDataSource<IMensaje>;
  tableEvents = new BehaviorSubject<ITableEvents>(noopTableEvent());
  form: FormGroup;
  tipoMensajeList: any[];
  etapaMensajeList: any[];
  showDataTable = false;
  userActions: {[key: string]: boolean} = {};
  xmlStr: string;
  constructor(private mensajeService: MensajeService,
              private resourceService: ResourceService,
              private utilService: UtilService,
              private datePipe: DatePipe) {
    this.form = new FormGroup({
      fechaInicio: new FormControl(moment().subtract(10, 'days').toDate()),
      fechaFin: new FormControl(moment().toDate()),
      etapaMensaje: new FormControl(''),
      tipoMensaje: new FormControl(''),
    });
    this.columns = this.buildTableColumns();
    this.dataSource = new MatTableDataSource<IMensaje>();
  }

  async ngOnInit() {
    this.tableEvents.subscribe(this.tableActionManager);
    this.resourceService.requestActionList(resourceCode.mensajeResourceCode)
      .subscribe({next: this.successActionList});

    combineLatest([
      this.utilService.requestEnumAsList('tipoMensaje'),
      this.utilService.requestEnumAsList('etapaMensaje')
    ]).pipe(
      map(([tipoMensajeList, etapaMensajeList]) => ({
        tipoMensajeList,
        etapaMensajeList
      }))
    ).subscribe((combineResp) => {
      this.tipoMensajeList = combineResp.tipoMensajeList;
      this.etapaMensajeList = combineResp.etapaMensajeList;
      this.applyFilter();
    });
  }

  backEvent = () => this.xmlStr = null;

  itemMensajeFormatterFn = (content: IMensaje[]): IMensaje[] => {
    return content.map(item => {
      if (item.fechaProcesamiento) item.fechaProcesamiento = this.datePipe.transform(item.fechaProcesamiento, DateUtil.buildFullDatePipeFormat());
      if (item.inicioEnvio) item.inicioEnvio = this.datePipe.transform(item.inicioEnvio, DateUtil.buildFullDatePipeFormat());
      if (item.finEnvio) item.finEnvio = this.datePipe.transform(item.finEnvio, DateUtil.buildFullDatePipeFormat());
      return item;
    });
  }

  requestMensajeListFn: PaginatedFn = (queryParams: any) =>
    this.mensajeService.requestMensajeList(queryParams)

  applyFilter() {
    const aditionalParams = {...this.form.value};
    aditionalParams.fechaInicio = moment(aditionalParams.fechaInicio).format(DateUtil.buildFullDateMomentFormat('-'));
    aditionalParams.fechaFin = moment(aditionalParams.fechaFin).format(DateUtil.buildFullDateMomentFormat('-'));
    this.showDataTable = true;
    this.tableEvents.next({event: 'RESET', data: {aditionalParams}});
  }

  protected tableActionManager = (event: ITableEvents) => {
    if (event.event === 'ROW_CLICK') {
      this.rowActionEvent(event.data);
    }
  }

  protected rowActionEvent = (event: {item: IMensaje, actionCode: string}) => {
    const {item, actionCode} = event;
    this.xmlStr = null;
    if (actionCode === actionXmlCode.mensajeRespuesta) {
      this.xmlStr = item.mensajeRespuesta;
    }
    if (actionCode === actionXmlCode.mensajePeticion) {
      this.xmlStr = item.mensajePeticion;
    }
  }

  protected buildTableColumns = (): ITableColumn[] => mensajeTableColums;

  protected successActionList = (data: any) => {
    this.userActions = data;
  }
}
