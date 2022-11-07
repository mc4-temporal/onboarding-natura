import {Component, OnInit} from '@angular/core';
import {
  ITableColumn,
  ITableEvents,
  ITableRowAction,
  noopTableEvent,
  PaginatedFn
} from '../../../../@mc4/shared/table/table.model';
import {MatTableDataSource} from '@angular/material/table';
import {BehaviorSubject} from 'rxjs';
import {FormControl, FormGroup} from '@angular/forms';
import {ResourceService} from '../../../commons/services/security/resource.service';
import {UtilService} from '../../../commons/services/util.service';
import * as moment from 'moment';
import {resourceCode} from '../../../commons/utils/constants';
import {map} from 'rxjs/operators';
import {DateUtil} from '../../../commons/utils/date.util';
import {LogService} from '../../../commons/services/security/log.service';
import {ILog} from '../../../commons/model/security.interface';
import {logTableColums} from './log.util';
import {DatePipe} from '@angular/common';
import {buildBottomSheetConfig, buildBottomSheetConfigCustom} from '../../../commons/utils/dialog.util';
import {MatBottomSheet} from '@angular/material/bottom-sheet';
import {DetailLogComponent} from './detail-log/detail-log.component';

@Component({
  selector: 'mc4-log',
  templateUrl: './log.component.html',
  styleUrls: ['./log.component.scss']
})
export class LogComponent implements OnInit {
  columns: ITableColumn[];
  dataSource: MatTableDataSource<ILog>;
  tableEvents = new BehaviorSubject<ITableEvents>(noopTableEvent());
  form: FormGroup;
  processList: any[];
  showDataTable = false;
  logActions: { [key: string]: boolean } = {};
  commonTableActions: any;
  rowActions: ITableRowAction[] = [];

  constructor(private logService: LogService,
              private utilService: UtilService,
              private resourceService: ResourceService, private matBottomShet: MatBottomSheet,
              private datePipe: DatePipe) {
    this.form = new FormGroup({
      from: new FormControl(moment().subtract(10, 'days').toDate()),
      to: new FormControl(moment().toDate()),
      process: new FormControl(''),
      q: new FormControl(''),
    });
    this.columns = this.buildTableColumns();
    this.dataSource = new MatTableDataSource<ILog>();
    this.commonTableActions = {
      viewCode: '100',
    };
  }

  async ngOnInit() {
    this.resourceService.requestActionList(resourceCode.logResourceCod)
      .subscribe({next: this.successActionList});
    this.tableEvents.subscribe(this.tableActionManager);

    this.utilService.requestEnumAsList('tipoProceso')
      .pipe(
        map((processType) => ({
          processType
        }))
      ).subscribe((combineResp) => {
      this.processList = combineResp.processType;
      this.applyFilter();
    });
  }

  itemLogFormatterFn = (content: ILog[]): ILog[] => {
    return content.map(item => {
      if (item.createdDate) {
        item.createdDate = this.datePipe.transform(item.createdDate, DateUtil.buildFullDatePipeFormat());
      }
      return item;
    });
  };
  protected buildRowActions = (): ITableRowAction[] => {
    const actions = [];
    console.warn(this.logActions);

    if (this.logActions.viewLogAction) {
      console.log(this.logActions);
      actions.push({
        action: 'Detalle',
        actionCode: this.commonTableActions.viewCode,
        icon: 'find_in_page'
      });

    }
    return actions;
  };
  requestLogListFn: PaginatedFn = (queryParams: any) =>
    this.logService.requestLogList(queryParams);

  applyFilter() {
    const aditionalParams = {...this.form.value};
    aditionalParams.from = moment(aditionalParams.fechaInicio).format(DateUtil.buildFullDateMomentFormat('-'));
    aditionalParams.to = moment(aditionalParams.fechaFin).format(DateUtil.buildFullDateMomentFormat('-'));
    this.showDataTable = true;
    this.tableEvents.next({event: 'RESET', data: {aditionalParams}});
  }

  protected buildTableColumns = (): ITableColumn[] => logTableColums;

  protected successActionList = (data: any) => {
    this.logActions = data;
    this.rowActions = this.buildRowActions();
    if (this.rowActions.length === 0) this.tableEvents.next({event: 'RELOAD_ACTIONS'});

  };
  protected tableActionManager = (event: ITableEvents) => {
    if (event.event === 'ROW_CLICK') {
      this.rowActionEvent(event.data);
    }
  };

  protected rowActionEvent = (event: { item: any, actionCode: string }) => {
    const {item, actionCode} = event;
    if (actionCode === this.commonTableActions.viewCode) {
      this.matBottomShet.open(
        DetailLogComponent,
        buildBottomSheetConfigCustom<ILog>(item, {
          autoFocus: 'dialog',
          disableClose: false,
          closeOnNavigation: true,
          panelClass: 'bottom-shet-container-80'
        })
      ).afterDismissed()
        .subscribe(res => {
          if (res) {
            console.log('close dialog');
          }
        });
    }
  };
}
