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

  tipoRegistro: "SYNC" | "ASYNC";
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

export interface ConsultoraDto {
  id: number;
  fechaRegistro: string;
  canal: String;
  nombreCompleto: String;
  nroDocumento: String;
  ciudadLocalidad: String;
  tiempoEspera: String;
  telefono: String;
  contactado: string | boolean;
}

export interface CanalOnboardingDto {
  id: number;
  codigo: String;
  descripcion: String;
}

export interface MunicipioDto {
  codigoGera: number;
  nombre: String;
  latitud: String;
  longitud: String;
  idProvincia: number;
}

export interface ConsultoraRequest {
  filtroTexto: String;
  tipoConsultora: String;
  idCanalOnboarding: number;
  idMunicipio: number;
  fechaRegistroDesde: Date;
  fechaRegistroHasta: Date;
  idDirectora: number;
}
