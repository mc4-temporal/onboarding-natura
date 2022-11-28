import {TableEventType} from '../../../@mc4/shared/table/table.model';

const estadoFlujoEnum = {
  formDatosPersonales: 'FORM_DATOS_PERSONALES'
};

export const OnboardingUtil = {
  estadoFlujoEnum
};

export type OnbEventType = 'NOOP' | 'SUBMIT_INFO_PERSONAL' | 'SUBMIT_DIRECCIONES' | 'SUBMIT_DIRECTORA_CONSULTORA' | 'RECUPERAR_DIRECTORA_CONSULTORA' | 'SOLICITAR_CREDITO';
export interface IOnbEvents {
  event: OnbEventType;
  data?: any;
}

export const noopOnbEvent = (): IOnbEvents => ({ event: 'NOOP' });
