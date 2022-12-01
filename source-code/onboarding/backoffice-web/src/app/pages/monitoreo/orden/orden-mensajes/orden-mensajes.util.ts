import {ITableColumn} from '../../../../../@mc4/shared/table/table.model';

export const actionCodeMensaje = {
  mensajePeticion: '1',
  mensajeRespuesta: '2',
  downloadXmls: '3'
};

export const ordenMensajeTableColums: ITableColumn[] = [
  {
    name: 'Tipo Mensaje',
    property: 'tipoMensaje',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '10%'
  },
  {
    name: 'Mensaje Petición',
    property: 'mensajePeticion',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '10%',
    largeText: {
      text: 'Ver XML',
      actionCode: actionCodeMensaje.mensajePeticion
    }
  },
  {
    name: 'Mensaje Eespuesta',
    property: 'mensajeRespuesta',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '10%',
    largeText: {
      text: 'Ver XML',
      actionCode: actionCodeMensaje.mensajeRespuesta
    }
  },
  {
    name: 'Fecha Procesam.',
    property: 'fechaProcesamiento',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '10%'
  },
  {
    name: 'Inicio Envío',
    property: 'inicioEnvio',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '10%'
  },
  {
    name: 'Fin Envío',
    property: 'finEnvio',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '10%'
  },
  {
    name: 'Etapa',
    property: 'etapa',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '10%'
  },
  {
    name: 'Intento',
    property: 'intento',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '10%'
  },
  {
    name: 'Resultado',
    property: 'resultado',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '10%'
  },
  {
    name: 'Resultado Descr.',
    property: 'resultadoDescripcion',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '10%'
  }
];
