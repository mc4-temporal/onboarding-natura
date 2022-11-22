export interface TransferReq {
  codDestinatario: string;
  codOriginante: string;
  codMoneda: string;
  importe: number;
  tipoOrden: string;
  tipoCuentaOrigen: string;
  tipoCuentaDestino: string;
  cuentaOrigen: string;
  cuentaDestino: string;
  glosa: string;
  ciNitOriginante: string;
  titularOriginante: string;
  ciNitDestinatario: string;
  titularDestinatario: string;
  origenFondos: string;
  destinoFondos: string;
  canal: string;

  tipoRegistro: 'SYNC' | 'ASYNC';
}


export interface GenerarOrdenQrReq {
  codOriginante: string;
  nombreRazonSocial: string;
  ciNit: string;
  numeroCuenta: string;
  moneda: string;
  importe: number;
  glosa: string;
  unicoUso: boolean;
  fechaVencimiento: string;
  codServicio: string;
}
