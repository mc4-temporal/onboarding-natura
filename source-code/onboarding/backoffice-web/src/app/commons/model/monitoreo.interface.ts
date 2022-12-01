import {IParticipante} from './configuracion.interface';

export class IMensaje {
  id: number;
  orden: any;
  tipoMensaje: string;
  mensajePeticion: string;
  mensajeRespuesta: string;
  fechaProcesamiento: string;
  inicioEnvio: string;
  finEnvio: string;
  etapa: string;
  intento: number;
  resultado: string;
  resultadoDescripcion: string;
}


export interface IOrdenResp {
  id: number;
  codigoResultado: string;
  descripcionResultado: string;
  estadoOrden: string;
  etapaOrden: string;
  fechaActualEtapa: string;
  fechaRegistro: string;
  createdDate: string;
  finProcesamiento: string;
  inicioProcesamiento: string;
  moneda: string;
  monto: number;
  numeroCuentaDestino: string;
  numeroCuentaOrigen: string;
  numeroOrdenCamara: string;
  numeroOrdenDestinatario: string;
  numeroOrdenOriginante: string;
  tipo: string;
  participanteDestino: IParticipante;
  participanteOrigen: IParticipante;
  mensajes: IMensaje[];

  partOrigenStr: string;
  partDestinoStr: string;
}
