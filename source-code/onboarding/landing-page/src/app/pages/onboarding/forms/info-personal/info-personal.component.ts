import {Component, Input, OnInit} from '@angular/core';
import {FormGroup} from '@angular/forms';
import {BehaviorSubject} from 'rxjs';
import {IOnbEvents} from '../../onboarding.util';

@Component({
  selector: 'mc4-info-personal',
  templateUrl: './info-personal.component.html',
  styleUrls: ['./info-personal.component.scss']
})
export class InfoPersonalComponent implements OnInit {
  @Input() form: FormGroup;
  @Input() eventManager: BehaviorSubject<IOnbEvents>;

  tipoDocumentoList: any[] = [
    {codigo: 'CI', descripcion: 'Doc. de identidad'},
    {codigo: 'CI-EXRANJERO', descripcion: 'Doc. de identidad extranjero'},
    {codigo: 'PASAPORTE', descripcion: 'Pasaporte'}
  ];
  expedicionList: any[] = [
    {codigo: 'Ninguno', descripcion: 'Ninguno'},
    {codigo: 'SC', descripcion: 'SC'},
    {codigo: 'CBBA', descripcion: 'CBBA'},
    {codigo: 'LPZ', descripcion: 'LPZ'},
  ];
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
}
