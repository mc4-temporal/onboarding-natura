import {Component, Input, OnInit} from '@angular/core';
import {FormGroup} from '@angular/forms';
import {BehaviorSubject} from 'rxjs';
import {IOnbEvents} from '../../onboarding.util';
import {MatSelectChange} from '@angular/material/select';
import * as Notiflix from 'notiflix';
import {EstructuraGeograficaService} from '../../../../commons/services/estructura-geografica.service';

@Component({
  selector: 'mc4-direcciones',
  templateUrl: './direcciones.component.html',
  styleUrls: ['./direcciones.component.scss']
})
export class DireccionesComponent implements OnInit {
  @Input() form: FormGroup;
  @Input() eventManager: BehaviorSubject<IOnbEvents>;

  departamentoList: any[];
  municipioList: any[];

  constructor(private estructGeoService: EstructuraGeograficaService) {
  }

  ngOnInit() {
    console.log('INIT DIRECCIONES');
    this.eventManager.subscribe(this.actionManager);
    this.estructGeoService.requestDepartamentoList()
      .subscribe({next: this.successDepartamentoList});
  }

  protected actionManager = (event: IOnbEvents) => {
  }

  departamentoChange(event: MatSelectChange) {
    this.form.controls['localidadId'].reset(null);
    this.estructGeoService.requestMunicipioPorDepartamentoList(event.value)
      .subscribe({next: this.successMunicipioList});
  }

  protected successDepartamentoList = (body: any[]) => {
    this.departamentoList = body;
  }

  protected successMunicipioList = (body: any[]) => {
    this.municipioList = body;
  }

  submitForm() {
    this.eventManager.next({event: 'SUBMIT_DIRECCIONES'});
  }

  isErrorVisible(formControlName: string, validation: string): boolean {
    return this.form.controls[formControlName].hasError(validation) && this.form.controls[formControlName].touched;
  }
}
