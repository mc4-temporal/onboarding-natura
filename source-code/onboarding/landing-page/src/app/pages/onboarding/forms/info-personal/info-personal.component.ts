import {Component, Input, OnInit} from '@angular/core';
import {FormGroup} from '@angular/forms';
import {BehaviorSubject} from 'rxjs';
import {IOnbEvents, OnboardingUtil} from '../../onboarding.util';

@Component({
  selector: 'mc4-info-personal',
  templateUrl: './info-personal.component.html',
  styleUrls: ['./info-personal.component.scss']
})
export class InfoPersonalComponent implements OnInit {
  @Input() form: FormGroup;
  @Input() eventManager: BehaviorSubject<IOnbEvents>;

  tipoDocumentoList: any[] = OnboardingUtil.tipoDocumentoData;
  expedicionList: any[] = OnboardingUtil.expedicionData;
  constructor() {
  }

  ngOnInit() {
    console.log('INIT INFO PERS');
    this.eventManager.subscribe(this.actionManager);
  }

  protected actionManager = (event: IOnbEvents) => {};

  submitForm() {
    this.eventManager.next({event: 'SUBMIT_INFO_PERSONAL'});
  }

  isErrorVisible(formControlName: string, validation: string): boolean {
    return this.form.controls[formControlName].hasError(validation) && this.form.controls[formControlName].touched;
  }

  enableComplemento() {
    return this.form.controls['tipoDocumento'].value === 'CI';
  }
}
