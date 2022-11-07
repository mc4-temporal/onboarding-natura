import {Component, Inject, OnInit} from '@angular/core';
import {MAT_BOTTOM_SHEET_DATA, MatBottomSheetRef} from '@angular/material/bottom-sheet';
import {IMensaje, IOrdenResp} from '../../../../commons/model/monitoreo.interface';
import {ITableColumn, ITableEvents, ITableRowAction, noopTableEvent} from '../../../../../@mc4/shared/table/table.model';
import {MatTableDataSource} from '@angular/material/table';
import {BehaviorSubject} from 'rxjs';
import {DateUtil} from '../../../../commons/utils/date.util';
import {DatePipe} from '@angular/common';
import {actionCodeMensaje, ordenMensajeTableColums} from './orden-mensajes.util';
import {XmlPipe} from '../../../../../@mc4/pipes/xml.pipe';
import {fileUtil} from '../../../../commons/utils/file.util';
import {fadeInUpAnimation} from '../../../../../@mc4/animations/fade-in-up.animation';

@Component({
  selector: 'mc4-orden-mensajes',
  templateUrl: './orden-mensajes.component.html',
  styleUrls: ['./orden-mensajes.component.scss'],
  animations: [fadeInUpAnimation]
})
export class OrdenMensajesComponent implements OnInit {
  columns: ITableColumn[];
  dataSource: MatTableDataSource<IMensaje>;
  rowActions: ITableRowAction[] = [{
    action: 'Descargar XML\'s',
    actionCode: '3',
    icon: 'download'
  }];
  tableEvents = new BehaviorSubject<ITableEvents>(noopTableEvent());
  xmlMensaje: any;
  selectedItem: IMensaje;
  constructor(public bottomSheetRef: MatBottomSheetRef<OrdenMensajesComponent>,
              @Inject(MAT_BOTTOM_SHEET_DATA) public data: IOrdenMensajesBottomSheetData,
              private datePipe: DatePipe,
              private xmlPipe: XmlPipe) {
    this.columns = this.buildTableColumns();
  }

  ngOnInit() {
    this.dataSource = new MatTableDataSource<IMensaje>(this.itemMensajeFormatterFn(this.data.mensajeList));
    this.tableEvents.subscribe(this.tableActionManager);
  }

  backEvent = () => this.xmlMensaje = null;

  protected tableActionManager = (event: ITableEvents) => {
    if (event.event === 'ROW_CLICK') {
      this.rowActionEvent(event.data);
    }
  }

  protected rowActionEvent = (event: {item: IMensaje, actionCode: string}) => {
    const {item, actionCode} = event;
    if (actionCode === actionCodeMensaje.mensajeRespuesta) {
      this.xmlMensaje = item.mensajeRespuesta;
      this.selectedItem = item;
    }
    if (actionCode === actionCodeMensaje.mensajePeticion) {
      this.xmlMensaje = item.mensajePeticion;
      this.selectedItem = item;
    }
    if (actionCode === actionCodeMensaje.downloadXmls) {
      this.downloadFile(item);
    }
  }

  protected downloadFile(item: IMensaje) {
    let content = '<!--' +
      '*******************************************************************************************************\n' +
      '**********************************************XML DE PETICIÓN**********************************************\n' +
      '***********************************************************************************************************' +
      '-->\n\n';
    if (item.mensajePeticion) content += item.mensajePeticion;
    content += '\n\n<!--' +
      '*******************************************************************************************************\n' +
      '**********************************************XML DE RESPUESTA*********************************************\n' +
      '***********************************************************************************************************' +
      '-->\n\n';
    if (item.mensajeRespuesta) content += item.mensajeRespuesta;
    fileUtil.downloadTextAsFile(this.xmlPipe.transform(content), `Mensajes_XML_Orden_${item.id}.xml`);
  }

  protected itemMensajeFormatterFn = (content: IMensaje[]): IMensaje[] => {
    return content.map(item => {
      if (item.fechaProcesamiento) item.fechaProcesamiento = this.datePipe.transform(item.fechaProcesamiento, DateUtil.buildFullDatePipeFormat());
      if (item.inicioEnvio) item.inicioEnvio = this.datePipe.transform(item.inicioEnvio, DateUtil.buildFullDatePipeFormat());
      if (item.finEnvio) item.finEnvio = this.datePipe.transform(item.finEnvio, DateUtil.buildFullDatePipeFormat());
      return item;
    });
  }

  protected buildTableColumns = (): ITableColumn[] => ordenMensajeTableColums;
}

export interface IOrdenMensajesBottomSheetData {
  mensajeList: IMensaje[];
  orden: IOrdenResp;
}
