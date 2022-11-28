import {Component, Input, OnInit} from '@angular/core';
import {BehaviorSubject} from 'rxjs';
import {IOnbEvents} from '../../onboarding.util';

@Component({
  selector: 'mc4-resumen-contado',
  templateUrl: './resumen-contado.component.html',
  styleUrls: ['./resumen-contado.component.scss']
})
export class ResumenContadoComponent implements OnInit {
  @Input() resumen: any;
  @Input() eventManager: BehaviorSubject<IOnbEvents>;
  constructor() { }

  ngOnInit() {
  }

  quieroSolicitarCredito() {
    this.eventManager.next({event: 'SOLICITAR_CREDITO'});
  }
}
