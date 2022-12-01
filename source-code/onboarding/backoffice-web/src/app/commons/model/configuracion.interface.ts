export interface IParticipante {
  id: number;
  abreviacion: string;
  camara: any;
  codigo: string;
  createdBy: string;
  createdDate: string;
  deleted: boolean;
  modifiedBy: string;
  modifiedDate: string;
  nombre: string;
  padre: any;
  tipo: string;
  version: string;

  camaraId: string;
  camaraStr: string;
  padreId: string;
  padreStr: string;
  fullName: string;
}

export interface IParticipanteReq {
  codigo: string;
  nombre: string;
  abreviacion: string;
  tipo: string;
  idCamara: number;
  idPadre: number;
  certificatePublic: any[];
  certificatePrivate: any[];

  certificatePublicStr: string;
  generaCert: boolean;
}

export interface IParticipanteResp {
  id: number;
  nombre: string;
  codigo: string;
  abreviacion: string;
  tipo: string;
  camara: IParticipanteResp;
  padre: IParticipanteResp;
}

export interface ICertificado {
  id: number;
  participanteId: number;
  jks: number[]; // byte[]
  fechaVencimiento: string;
  serial: string;
  password: string;
  jksStr: string;
}


export type JobStatusType = 'SCHEDULED' | 'PAUSED' | 'RUNNING';
export interface IJob {
  groupName: string;
  jobName: string;
  triggerName: string;
  scheduleTime: string;
  lastFiredTime: string;
  nextFireTime: string;
  jobStatus: JobStatusType;
  description: string;
  cronExpression: string;
  triggerKey: string;
}

export type JobHistoryStatusType = 'FINALIZADO' | 'REPROGRAMADO' | 'ERROR' | 'WARNING' | 'EJECUTANDO';
export interface IJobHistory {
  id: number;
  groupName: string;
  jobName: string;
  startTime: string;
  endTime: string;
  jobState: JobHistoryStatusType;
  message: string;
}


export interface ITechnicalData {
  id: number;
  url: string;
  connectTimeout: number;
  readTimeout: number;
  receptorRequestBody: string;
  receptorResponsePartName: string;
  receptoProcesadasBody: string;
  responseProcesadasResponsePartName: string;
  receptorExpressBody: string;
  receptorExpressResponsePartName: string;
  testBody: string;
  testResponsePartName: string;
}
