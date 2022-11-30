export type OnbEventType = 'NOOP' | 'SUBMIT_INFO_PERSONAL' | 'SUBMIT_DIRECCIONES' | 'SUBMIT_DIRECTORA_CONSULTORA' | 'RECUPERAR_DIRECTORA_CONSULTORA' | 'SOLICITAR_CREDITO';
export interface IOnbEvents {
  event: OnbEventType;
  data?: any;
}

export const noopOnbEvent = (): IOnbEvents => ({ event: 'NOOP' });

const estadoFlujoEnum = {
  formDatosPersonales: 'FORM_DATOS_PERSONALES'
};

const tipoDocumentoData = [
  {codigo: 'CI', descripcion: 'Doc. de identidad'},
  {codigo: 'CI-EXRANJERO', descripcion: 'Doc. de identidad extranjero'},
  {codigo: 'PASAPORTE', descripcion: 'Pasaporte'}
];

const expedicionData = [
  {codigo: '0', descripcion: 'Ninguno'},
  {codigo: 'SC', descripcion: 'Santa Cruz'},
  {codigo: 'CB', descripcion: 'Cochabamba'},
  {codigo: 'LP', descripcion: 'La Paz'},
  {codigo: 'CH', descripcion: 'Chuquisaca'},
  {codigo: 'OR', descripcion: 'Oruro'},
  {codigo: 'PT', descripcion: 'Potosí'},
  {codigo: 'TJ', descripcion: 'Tarija'},
  {codigo: 'BN', descripcion: 'Beni'},
  {codigo: 'PN', descripcion: 'Pando'},
];

export const OnboardingUtil = {
  estadoFlujoEnum,
  tipoDocumentoData,
  expedicionData
};
