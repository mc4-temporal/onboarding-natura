import {FormGroup} from '@angular/forms';

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

export const FormUtil = {
  buildNumberPattern,
  isValidFormGroup
};
