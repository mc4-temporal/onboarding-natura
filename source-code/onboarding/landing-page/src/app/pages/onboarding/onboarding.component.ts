import {Component, OnInit, ViewChild} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {MatStepper} from '@angular/material/stepper';
import {FormUtil} from '../../commons/utils/form.util';
import {LandingService} from '../../commons/services/landing.service';
import * as Notiflix from 'notiflix';
import {OnboardingUtil} from './onboarding.util';
import * as moment from 'moment';

@Component({
  selector: 'mc4-onboarding',
  templateUrl: 'onboarding.component.html',
  styleUrls: ['onboarding.component.scss']
})

export class OnboardingComponent implements OnInit {
  @ViewChild('stepper') stepper: MatStepper;
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
  departamentoList: any[] = [{id: 1, nombre: 'Santa Cruz'}];
  localidadList: any[] = [{id: 1, nombre: 'Santa Cruz de la Sierra'}];

  pInfoForm: FormGroup;
  addressForm: FormGroup;
  directoraForm: FormGroup;
  responseInfo: any;
  constructor(private service: LandingService) {
  }

  ngOnInit() {
    this.initializeForms();
  }

  isErrorVisible(formType: 'pInfoForm' | 'addressForm', formControlName: string, validation: string): boolean {
    switch (formType) {
      case 'pInfoForm':
        return this.pInfoForm.controls[formControlName].hasError(validation) && this.pInfoForm.controls[formControlName].touched;
      case 'addressForm':
        return this.addressForm.controls[formControlName].hasError(validation) && this.addressForm.controls[formControlName].touched;
      default:
        return false;
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
      departamentoId: new FormControl(1, Validators.compose([Validators.required])),
      localidadId: new FormControl(1, Validators.compose([Validators.required])),
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
    this.directoraForm = new FormGroup({});
  }

  submitInfoForm() {
    if (FormUtil.isValidFormGroup(this.pInfoForm)) {
      Notiflix.Loading.pulse();
      this.service.requestSaveOnboardingInfo(this.pInfoForm.value)
        .subscribe({next: this.successSaveInfo});
      // this.stepper.next();
    }
  }

  submitAddressForm() {
    if (FormUtil.isValidFormGroup(this.addressForm)) {
      Notiflix.Loading.pulse();
      this.service.requestSaveOnboardingAddress(this.responseInfo.consultoraId, this.addressForm.value)
        .subscribe({next: this.successSaveAddress});
    }
    // this.stepper.next();
  }

  submitDirectoraForm() {
    if (FormUtil.isValidFormGroup(this.directoraForm)) {
      console.log(this.directoraForm.value);
    }
  }

  protected successSaveInfo = (body: any) => {
    this.responseInfo = body;
    Notiflix.Loading.remove();
    this.stepper.next();
  }

  protected successSaveAddress = (body: any) => {
    Notiflix.Loading.remove();
    this.stepper.next();
  }
}
