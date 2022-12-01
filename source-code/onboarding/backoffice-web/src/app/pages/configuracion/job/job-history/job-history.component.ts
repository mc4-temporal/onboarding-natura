import {Component, Inject, OnInit} from '@angular/core';
import {MAT_BOTTOM_SHEET_DATA, MatBottomSheetRef} from '@angular/material/bottom-sheet';
import {ITableColumn, ITableEvents, noopTableEvent, PaginatedFn} from '../../../../../@mc4/shared/table/table.model';
import {MatTableDataSource} from '@angular/material/table';
import {IJob, IJobHistory} from '../../../../commons/model/configuracion.interface';
import {BehaviorSubject} from 'rxjs';
import {MatDialog} from '@angular/material/dialog';
import {DatePipe} from '@angular/common';
import {jobHistoryColumns} from '../job.util';
import {JobService} from '../../../../commons/services/security/job.service';
import {fadeInUpAnimation} from '../../../../../@mc4/animations/fade-in-up.animation';

@Component({
  selector: 'mc4-cert',
  templateUrl: './job-history.component.html',
  styleUrls: ['./job-history.component.scss'],
  animations: [fadeInUpAnimation]
})
export class JobHistoryComponent implements OnInit {
  textToView: string;
  columns: ITableColumn[] = jobHistoryColumns;
  tableActionsCode: any;
  dataSource: MatTableDataSource<any>;
  tableEvents = new BehaviorSubject<ITableEvents>(noopTableEvent());
  constructor(public bottomSheetRef: MatBottomSheetRef<JobHistoryComponent>,
              @Inject(MAT_BOTTOM_SHEET_DATA) public data: IJobHistoryBottomShetData,
              private jobService: JobService,
              private matDialog: MatDialog,
              private datePipe: DatePipe) {
    this.tableActionsCode = {
      verMas: '100',
    };
    this.dataSource = new MatTableDataSource<any>();
  }

  ngOnInit() {
    this.tableEvents.subscribe(this.tableActionManager);
  }

  historyItemFormat = (content: IJobHistory[]) => {
    return content.map(item => {
      item.startTime = this.datePipe.transform(item.startTime, 'dd/MM/yyyy HH:mm:ss');
      item.endTime = this.datePipe.transform(item.endTime, 'dd/MM/yyyy HH:mm:ss');
      return item;
    });
  }

  protected tableActionManager = (event: ITableEvents) => {
    if (event.event === 'ROW_CLICK') {
      this.rowActionEvent(event.data);
    }
  }

  protected rowActionEvent = (event: {item: IJobHistory, actionCode: string}) => {
    const {item, actionCode} = event;
    if (actionCode === this.tableActionsCode.verMas) {
      if (!item.message) {
        item.message = '';
      }
      let fullText = '';
      for (let i = 0; i < item.message.length; i++) {
        const fin = i + 130;
        if (fin > item.message.length) {
          fullText += item.message.substring(i) + '\n';
        } else {
          fullText += item.message.substring(i, fin) + '\n';
        }
        i += 130;
      }
      this.textToView = fullText;
    }
  }

  backEvent = () => this.textToView = null;

  requestHistoryListFn: PaginatedFn = (queryParams: any) =>
    this.jobService.requestJobHistoryList({...queryParams, groupName: this.data.job.groupName, jobName: this.data.job.jobName})
}

export interface IJobHistoryBottomShetData {
  job: IJob;
  userActions: any;
}
