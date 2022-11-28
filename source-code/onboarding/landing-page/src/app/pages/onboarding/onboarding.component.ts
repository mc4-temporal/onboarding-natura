import {Component, OnInit, ViewChild} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {MatStepper} from '@angular/material/stepper';
import {FormUtil} from '../../commons/utils/form.util';
import {LandingService} from '../../commons/services/landing.service';
import * as Notiflix from 'notiflix';
import {IOnbEvents, noopOnbEvent} from './onboarding.util';
import * as moment from 'moment';
import {BehaviorSubject} from 'rxjs';

@Component({
  selector: 'mc4-onboarding',
  templateUrl: 'onboarding.component.html',
  styleUrls: ['onboarding.component.scss']
})

export class OnboardingComponent implements OnInit {
  @ViewChild('stepper') stepper: MatStepper;
  pInfoForm: FormGroup;
  addressForm: FormGroup;
  directoraForm: FormGroup;
  responseInfo: any;

  eventManager = new BehaviorSubject<IOnbEvents>(noopOnbEvent());
  constructor(private landingService: LandingService) {
  }

  ngOnInit() {
    this.eventManager.subscribe(this.onbActionManager);
    this.initializeForms();
  }
  protected onbActionManager = (event: IOnbEvents) => {
    if (event.event === 'SUBMIT_INFO_PERSONAL') {
      this.submitInfoForm();
    }
    if (event.event === 'SUBMIT_DIRECCIONES') {
      this.submitAddressForm();
    }
    if (event.event === 'SUBMIT_DIRECTORA_CONSULTORA') {
      this.submitDirectoraForm();
    }
  }

  protected initializeForms() {
    this.pInfoForm = new FormGroup({
      nombres: new FormControl(null, Validators.compose([Validators.required])),
      apellidos: new FormControl(null, Validators.compose([Validators.required])),
      tipoDocumento: new FormControl(null, Validators.compose([Validators.required])),
      nroDocumento: new FormControl(null, Validators.compose([Validators.required])),
      complemento: new FormControl(null),
      expedicion: new FormControl(null),
      fechaNacimiento: new FormControl(null, Validators.compose([Validators.required, FormUtil.personaMayorEdad()])),
      telefono: new FormControl(null, Validators.compose([Validators.required])),
      correo: new FormControl(null, Validators.compose([Validators.required, Validators.email])),
      terminosCondiciones: new FormControl(null),
    });
    this.addressForm = new FormGroup({
      departamentoId: new FormControl(null, Validators.compose([Validators.required])),
      localidadId: new FormControl(null, Validators.compose([Validators.required])),
      barrioZona: new FormControl(null, Validators.compose([Validators.required])),
      avenidaCalle: new FormControl(null, Validators.compose([Validators.required])),
      nroCasa: new FormControl(null),
      referencia: new FormControl(null, Validators.compose([Validators.required, Validators.minLength(50)])),
      barrioZonaEntrega: new FormControl(null, Validators.compose([Validators.required])),
      avenidaCalleEntrega: new FormControl(null, Validators.compose([Validators.required])),
      nroCasaEntrega: new FormControl(null),
      referenciaEntrega: new FormControl(null, Validators.compose([Validators.required, Validators.minLength(50)])),
      mismaDireccionEntrega: new FormControl(true),
    });
    this.directoraForm = new FormGroup({
      directoraId: new FormControl(null, Validators.compose([Validators.required])),
      consultoraId: new FormControl(null, Validators.compose([Validators.required])),
      correo: new FormControl(null, Validators.compose([Validators.required, Validators.email])),
      codigoConfirmacion: new FormControl(null, Validators.compose([Validators.required])),
    });
  }

  submitInfoForm() {
    if (FormUtil.isValidFormGroup(this.pInfoForm)) {
      Notiflix.Loading.pulse();
      this.landingService.requestSaveOnboardingInfo(this.pInfoForm.value)
        .subscribe({next: this.successSaveInfo});
    }
  }

  submitAddressForm() {
    if (FormUtil.isValidFormGroup(this.addressForm)) {
      Notiflix.Loading.pulse();
      this.landingService.requestSaveOnboardingAddress(this.responseInfo.consultoraId, this.addressForm.value)
        .subscribe({next: this.successSaveAddress});
    }
  }

  submitDirectoraForm() {
    if (FormUtil.isValidFormGroup(this.directoraForm)) {
      Notiflix.Loading.pulse();
      this.landingService.requestSaveOnboardingDirectora(this.responseInfo.consultoraId, this.directoraForm.value)
        .subscribe({next: this.successSaveDirectora});
    }
  }

  protected successSaveDirectora = (body: any) => {
    this.responseInfo = body;
    Notiflix.Loading.remove();
    this.stepper.next();
  }

  protected successSaveInfo = (body: any) => {
    this.responseInfo = body;
    Notiflix.Loading.remove();
    this.stepper.next();
  }

  protected successSaveAddress = (body: any) => {
    this.eventManager.next({event: 'RECUPERAR_DIRECTORA_CONSULTORA', data: this.responseInfo.consultoraId});
    Notiflix.Loading.remove();
    this.stepper.next();
  }
}
