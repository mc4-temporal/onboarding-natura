import {AbstractControl, FormGroup, ValidationErrors, ValidatorFn} from '@angular/forms';
import * as moment from 'moment';

const buildNumberPattern = (cantEnteros: number, cantDecimales: number) => `^((?!0)\\d{1,${cantEnteros}}|0|\\.\\d{1,${cantDecimales}})($|\\.$|\\.\\d{1,${cantDecimales}}$)`;

const isValidFormGroup = (form: FormGroup): boolean => {
  if (form.valid) return true;
  for (const controlsKey in form.controls) {
    if (form.controls[controlsKey].errors) {
      form.controls[controlsKey].markAsTouched({onlySelf: true});
    }
  }
  return false;
};

export function personaMayorEdad(): ValidatorFn {
  return (control: AbstractControl): ValidationErrors | null => {
    const valorFecha = control.value;
    if (!valorFecha) {
      return null;
    }
    const diferencia = moment().diff(moment(valorFecha), 'y', true);
    return diferencia < 18 ? {personaMayorEdad: true} : null;
  };
}

export const FormUtil = {
  buildNumberPattern,
  isValidFormGroup,
  personaMayorEdad
};
