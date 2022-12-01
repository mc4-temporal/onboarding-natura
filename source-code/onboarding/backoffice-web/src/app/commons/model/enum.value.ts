export interface IEnumDto {
  codigo: string;
  descripcion: string;
}

export const EntityState = {
  ACTIVO: 'ACTIVO',
  INACTIVO: 'INACTIVO',
  ELIMINADO: 'ELIMINADO'
};

export const UserStatus = {
  ACTIVO: 'ACTIVO',
  INACTIVO: 'INACTIVO',
  BLOQUEADO: 'BLOQUEADO',
  ELIMINADO: 'ELIMINADO',
};

export const ParameterType = {
  CADENA: 'CADENA',
  NUMERICO: 'NUMERICO',
  BOOLEANO: 'BOOLEANO',
  FECHA: 'FECHA',
  LOB: 'LOB',
  UNDEFINED: 'UNDEFINED'
};

export const EstadoOrden = {
  pe: 'PE',
  tr: 'TR',
  pr: 'PR',
  re: 'RE',
  ca: 'CA',
  er: 'ER',
};

export const enumKeyId = {
  estadoOrden: 'estadoOrden',
  etapaOrden: 'etapaOrden',
  tipoOrden: 'tipoOrden',
  tipoProceso: 'tipoProceso'
};
