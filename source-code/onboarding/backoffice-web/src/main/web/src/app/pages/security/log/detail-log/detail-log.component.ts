import {Component, Inject, OnInit} from '@angular/core';
import {ILog} from '../../../../commons/model/security.interface';
import {MatSnackBar} from '@angular/material/snack-bar';
import {fileUtil} from '../../../../commons/utils/file.util';
import {MAT_BOTTOM_SHEET_DATA, MatBottomSheetRef} from '@angular/material/bottom-sheet';

@Component({
  selector: 'mc4-detail-log',
  templateUrl: './detail-log.component.html',
  styleUrls: ['./detail-log.component.scss']
})
export class DetailLogComponent implements OnInit {

  constructor(public bottomSheetRef: MatBottomSheetRef<DetailLogComponent>,
              @Inject(MAT_BOTTOM_SHEET_DATA) public data: ILog,
              private matSnackBar: MatSnackBar
  ) {
  }

  async copyToClipboard() {
    await navigator.clipboard.writeText(this.data.log);
    this.matSnackBar.open('Copiado al porta papeles');
  }

  ngOnInit() {
  }


  downloadFileMessage(log: string) {
    fileUtil.downloadTextAsFile(log, `log_${this.data.createdDateStr.replace(' ', '_').replace(':', '_')}.txt`);
  }

  openLink(event: MouseEvent): void {
    this.bottomSheetRef.dismiss();
    event.preventDefault();
  }
}
