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
  departamentoTmpList: any[];
  municipioList: any[];
  municipioTmpList: any[];

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
    this.departamentoTmpList = body;
  }

  protected successMunicipioList = (body: any[]) => {
    this.municipioList = body;
    this.municipioTmpList = body;
  }

  submitForm() {
    this.eventManager.next({event: 'SUBMIT_DIRECCIONES'});
  }

  isErrorVisible(formControlName: string, validation: string): boolean {
    return this.form.controls[formControlName].hasError(validation) && this.form.controls[formControlName].touched;
  }

  filterDepartamentos(value: string) {
    if (!value) value = '';
    value = value.toLowerCase();
    this.departamentoList = this.departamentoTmpList.filter(it => it.nombre.toLowerCase().indexOf(value) >= 0);
  }

  filterMunicipios(value: string) {
    if (!value) value = '';
    value = value.toLowerCase();
    this.municipioList = this.municipioTmpList.filter(it => it.nombre.toLowerCase().indexOf(value) >= 0);
  }
}
