import {Component, Input, OnInit} from '@angular/core';
import {FormGroup} from '@angular/forms';
import {BehaviorSubject} from 'rxjs';
import {IOnbEvents} from '../../onboarding.util';
import {EstructuraComercialService} from '../../../../commons/services/estructura-comercial.service';

@Component({
  selector: 'mc4-directora-consultora-conocida',
  templateUrl: './directora-consultora-conocida.component.html',
  styleUrls: ['./directora-consultora-conocida.component.scss']
})
export class DirectoraConsultoraConocidaComponent implements OnInit {
  @Input() form: FormGroup;
  @Input() eventManager: BehaviorSubject<IOnbEvents>;

  directoraList: any[] = [];
  consultoraList: any[] = [];

  constructor(private estructuraComService: EstructuraComercialService) {
  }

  ngOnInit() {
    console.log('INIT DIRECTORA CONSULTORA');
    this.eventManager.subscribe(this.actionManager);
  }

  protected actionManager = (event: IOnbEvents) => {
    if (event.event === 'RECUPERAR_DIRECTORA_CONSULTORA') {
      this.recuperarDatosList(event.data);
    }
  }

  protected recuperarDatosList(prospectoId: number) {
    this.estructuraComService.requestDirectorasDisponiblesPorConsultoraList(prospectoId)
      .subscribe({next: (body) => this.directoraList = body});

    this.estructuraComService.requestConsultoraRecomendanteList(prospectoId)
      .subscribe({next: (body) => this.consultoraList = body});
  }

  submitForm() {
    this.eventManager.next({event: 'SUBMIT_DIRECTORA_CONSULTORA'});
  }

  isErrorVisible(formControlName: string, validation: string): boolean {
    return this.form.controls[formControlName].hasError(validation) && this.form.controls[formControlName].touched;
  }
}
