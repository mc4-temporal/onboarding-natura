import {Component, OnInit, ViewChild} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {MatStepper} from '@angular/material/stepper';
import {FormUtil} from '../../commons/utils/form.util';
import {LandingService} from '../../commons/services/landing.service';
import * as Notiflix from 'notiflix';
import {OnboardingUtil} from './onboarding.util';

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
    {codigo: 'PASAPORTE', descripcion: 'Pasaporte'},
  ];
  expedicionList: any[] = [
    {codigo: 'Ninguno', descripcion: 'Ninguno'},
    {codigo: 'SC', descripcion: 'SC'},
    {codigo: 'CBBA', descripcion: 'CBBA'},
    {codigo: 'LPZ', descripcion: 'LPZ'},
  ];

  pInfoForm: FormGroup;
  addressForm: FormGroup;
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
      nombres: new FormControl(null, Validators.compose([Validators.required])),
      apellidos: new FormControl(null, Validators.compose([Validators.required])),
      tipoDocumento: new FormControl(null, Validators.compose([Validators.required])),
      nroDocumento: new FormControl(null, Validators.compose([Validators.required])),
      complemento: new FormControl(null),
      expedicion: new FormControl(null),
      fechaNacimiento: new FormControl(null, Validators.compose([Validators.required])),
      telefono: new FormControl(null, Validators.compose([Validators.required])),
      correo: new FormControl(null, Validators.compose([Validators.required, Validators.email])),
      terminosCondiciones: new FormControl(null),
    });
    this.addressForm = new FormGroup({});
  }

  submitInfoForm() {
    if (FormUtil.isValidFormGroup(this.pInfoForm)) {
      const body = this.pInfoForm.value;
      Notiflix.Loading.pulse();
      this.service.requestSaveOnboardingInfo(OnboardingUtil.estadoFlujoEnum.formDatosPersonales, body)
        .subscribe({next: this.successSaveInfo});
    }
  }

  submitAddressForm() {
    console.log(this.pInfoForm);
    this.stepper.next();
  }

  protected successSaveInfo = (body: any) => {
    Notiflix.Loading.remove();
    this.stepper.next();
  }
}
