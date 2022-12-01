import {Component, OnInit} from '@angular/core';
import {MatTableDataSource} from '@angular/material/table';
import {IJob} from '../../../commons/model/configuracion.interface';
import {ITableColumn, ITableEvents, ITableRowAction, noopTableEvent} from '../../../../@mc4/shared/table/table.model';
import {BehaviorSubject} from 'rxjs';
import {jobActionsCode, jobTableColums} from './job.util';
import {JobService} from '../../../commons/services/security/job.service';
import {DatePipe} from '@angular/common';
import * as Notiflix from 'notiflix';
import {buildBottomSheetConfig} from '../../../commons/utils/dialog.util';
import {MatBottomSheet} from '@angular/material/bottom-sheet';
import {IJobHistoryBottomShetData, JobHistoryComponent} from './job-history/job-history.component';
import {resourceCode} from '../../../commons/utils/constants';
import {ResourceService} from '../../../commons/services/security/resource.service';

@Component({
  selector: 'mc4-job',
  templateUrl: './job.component.html',
  styleUrls: ['./job.component.scss']
})
export class JobComponent implements OnInit {
  dataSource: MatTableDataSource<IJob>;
  columns: ITableColumn[];
  rowActions: ITableRowAction[] = [];
  singleRowActions: ITableRowAction[] = [];
  tableEvents = new BehaviorSubject<ITableEvents>(noopTableEvent());
  userActions: {[key: string]: boolean} = {};
  constructor(private jobService: JobService,
              private resourceService: ResourceService,
              private datePipe: DatePipe,
              private matBottomSheet: MatBottomSheet) {
    this.columns = this.buildTableColumns();
    this.dataSource = new MatTableDataSource<IJob>([]);
  }

  ngOnInit() {
    this.tableEvents.subscribe(this.tableActionManager);
    this.jobListRequest(true);
    this.resourceService.requestActionList(resourceCode.jobResourceCode)
      .subscribe({next: this.successActionList});
  }

  repararProcesos() {
    const afterConfirmDialog = () => {
      this.jobService.requestRepairJobs()
        .subscribe({next: this.successUpdateJob});
    };
    Notiflix.Confirm.show(
      'Reparar Procesos',
      '¿Está seguro de restablecer los procesos?',
      'Si',
      'No',
      afterConfirmDialog
    );
  }

  filterData(filter: string) {
    this.dataSource.filter = filter;
  }

  jobListRequest(reset: boolean = false) {
    if (reset) {
      this.tableEvents.next({event: 'RESET'});
    }
    Notiflix.Loading.pulse();
    this.jobService.requestJobList()
      .subscribe({next: this.successJobList});
  }

  protected successActionList = (data: any) => {
    data = {
      historyAction: true,
      deleteAction: true,
      pauseAction: true,
      restartAction: true,
      execNowAction: true,
    };
    this.userActions = data;
    this.rowActions = this.buildRowActions();
    this.singleRowActions = this.buildSingleRowActions();
    console.log(this.singleRowActions, this.rowActions);
    if (this.rowActions.length === 0 && this.singleRowActions.length === 0) {
      this.tableEvents.next({event: 'RELOAD_ACTIONS'});
    }
  }

  protected successJobList = (body: IJob[]) => {
    Notiflix.Loading.remove();
    body.forEach(item => {
      item.lastFiredTime = this.datePipe.transform(item.lastFiredTime, 'dd/MM/yyyy HH:mm:ss');
      item.nextFireTime = this.datePipe.transform(item.nextFireTime, 'dd/MM/yyyy HH:mm:ss');
    });
    this.dataSource = new MatTableDataSource<IJob>(body);
  }

  protected tableActionManager = (event: ITableEvents) => {
    if (event.event === 'ROW_CLICK') {
      this.rowActionEvent(event.data);
    }
  }

  protected rowActionEvent = (event: {item: IJob, actionCode: string}) => {
    const {item, actionCode} = event;
    if (actionCode === jobActionsCode.pause) this.pauseJob(item);
    if (actionCode === jobActionsCode.restart) this.restartJob(item);
    if (actionCode === jobActionsCode.execNow) this.executeNowJob(item);
    if (actionCode === jobActionsCode.delete) this.deleteJob(item);
    if (actionCode === jobActionsCode.history) this.historyJob(item);
  }

  protected historyJob(item: IJob) {
    this.matBottomSheet.open(JobHistoryComponent, buildBottomSheetConfig<IJobHistoryBottomShetData>({job: item, userActions: {}}))
      .afterDismissed()
      .subscribe(result => {
        console.log(result);
      });
  }

  protected pauseJob(item: IJob) {
    const afterConfirmDialog = () => {
      this.jobService.requestPauseJob(item.groupName, item.jobName)
        .subscribe({next: this.successUpdateJob});
    };
    Notiflix.Confirm.show(
      'Pausar Proceso',
      '¿Está seguro de pausar el proceso?',
      'Si',
      'No',
      afterConfirmDialog
    );
  }

  protected restartJob(item: IJob) {
    const afterConfirmDialog = () => {
      this.jobService.requestRestartJob(item.groupName, item.jobName)
        .subscribe({next: this.successUpdateJob});
    };
    Notiflix.Confirm.show(
      'Reiniciar Proceso',
      '¿Está seguro de reiniciar el proceso?',
      'Si',
      'No',
      afterConfirmDialog
    );
  }

  protected executeNowJob(item: IJob) {
    const afterConfirmDialog = () => {
      this.jobService.requestExecNowJob(item.groupName, item.jobName)
        .subscribe({next: this.successUpdateJob});
    };
    Notiflix.Confirm.show(
      'Ejecutar Ahora',
      '¿Está seguro de ejecutar ahora el proceso?',
      'Si',
      'No',
      afterConfirmDialog
    );
  }

  protected deleteJob(item: IJob) {
    const afterConfirmDialog = () => {
      this.jobService.requestDeleteJob(item.groupName, item.jobName)
        .subscribe({next: this.successUpdateJob});
    };
    Notiflix.Confirm.show(
      'Eliminar proceso',
      '¿Está seguro de eliminar el proceso?',
      'Si',
      'No',
      afterConfirmDialog
    );
  }

  protected successUpdateJob = (body: any) => {
    Notiflix.Notify.success('Acción realizada con éxito.');
    this.jobListRequest();
  }

  protected buildTableColumns = (): ITableColumn[] => jobTableColums;

  protected buildRowActions = (): ITableRowAction[] => {
    const actions = [];
    if (this.userActions.historyAction) {
      actions.push({
        action: 'Historial',
        actionCode: jobActionsCode.history,
        icon: 'list'
      });
    }

    if (this.userActions.deleteAction) {
      actions.push({
        action: 'Eliminar',
        actionCode: jobActionsCode.delete,
        icon: 'delete'
      });
    }
    return actions;
  }

  protected buildSingleRowActions = (): ITableRowAction[] => {
    const actions = [];
    if (this.userActions.pauseAction) {
      actions.push({
        action: 'Pausar',
        actionCode: jobActionsCode.pause,
        icon: 'pause_circle_filled',
        tooltip: 'Pausar proceso',
        isDisabledFn: (row: IJob) => row.jobStatus !== 'RUNNING' && row.jobStatus === 'PAUSED',
      });
    }
    if (this.userActions.restartAction) {
      actions.push({
        action: 'Reiniciar',
        actionCode: jobActionsCode.restart,
        icon: 'play_circle_filled',
        tooltip: 'Reiniciar proceso',
        isDisabledFn: (row: IJob) => row.jobStatus === 'SCHEDULED',
      });
    }
    if (this.userActions.execNowAction) {
      actions.push({
        action: 'Ejecutar ahora',
        actionCode: jobActionsCode.execNow,
        icon: 'adjust',
        tooltip: 'Ejecutar ahora',
      });
    }
    return actions;
  }
}
