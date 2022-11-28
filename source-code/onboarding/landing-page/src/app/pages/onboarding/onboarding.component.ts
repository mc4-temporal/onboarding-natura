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
      nombres: new FormControl('Juan Fernando', Validators.compose([Validators.required])),
      apellidos: new FormControl('Montero Figueroa', Validators.compose([Validators.required])),
      tipoDocumento: new FormControl('CI', Validators.compose([Validators.required])),
      nroDocumento: new FormControl('9796662', Validators.compose([Validators.required])),
      complemento: new FormControl(null),
      expedicion: new FormControl('SC'),
      fechaNacimiento: new FormControl(moment().subtract(22, 'y').toDate(), Validators.compose([Validators.required, FormUtil.personaMayorEdad()])),
      telefono: new FormControl('69233208', Validators.compose([Validators.required])),
      correo: new FormControl('fmontero@mc4.com.bo', Validators.compose([Validators.required, Validators.email])),
      terminosCondiciones: new FormControl(null),
    });
    this.addressForm = new FormGroup({
      departamentoId: new FormControl(null, Validators.compose([Validators.required])),
      localidadId: new FormControl(null, Validators.compose([Validators.required])),
      barrioZona: new FormControl('Barrio/Zona', Validators.compose([Validators.required])),
      avenidaCalle: new FormControl('Avenida/Calle', Validators.compose([Validators.required])),
      nroCasa: new FormControl('120'),
      referencia: new FormControl('Referencia de direccion Referencia de direccion Referencia de direccion', Validators.compose([Validators.required, Validators.minLength(50)])),
      barrioZonaEntrega: new FormControl('Barrio/Zona entrega', Validators.compose([Validators.required])),
      avenidaCalleEntrega: new FormControl('Avenida/Calle entrega', Validators.compose([Validators.required])),
      nroCasaEntrega: new FormControl('45'),
      referenciaEntrega: new FormControl('Referencia de direccion Referencia de direccion Referencia de direccion', Validators.compose([Validators.required, Validators.minLength(50)])),
      mismaDireccionEntrega: new FormControl(true),
    });
    this.directoraForm = new FormGroup({
      directoraId: new FormControl(null, Validators.compose([Validators.required])),
      consultoraId: new FormControl(null, Validators.compose([Validators.required])),
      correo: new FormControl('fmontero@mc4.com.bo', Validators.compose([Validators.required, Validators.email])),
      codigoConfirmacion: new FormControl(123, Validators.compose([Validators.required])),
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
