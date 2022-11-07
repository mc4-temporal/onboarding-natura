import {ITableColumn} from '../../../../@mc4/shared/table/table.model';
export const actionXmlCode = {
  mensajePeticion: '1',
  mensajeRespuesta: '2',
  downloadXmls: '3'
};

export const mensajeTableColums: ITableColumn[] = [
  {
    name: 'Tipo Mensaje',
    property: 'tipoMensaje',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '150px'
  },
  {
    name: 'Mensaje Petición',
    property: 'mensajePeticion',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '150px',
    largeText: {
      text: 'Ver XML',
      actionCode: actionXmlCode.mensajePeticion
    }
  },
  {
    name: 'Mensaje Respuesta',
    property: 'mensajeRespuesta',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '150px',
    largeText: {
      text: 'Ver XML',
      actionCode: actionXmlCode.mensajePeticion
    }
  },
  {
    name: 'Fecha Procesam.',
    property: 'fechaProcesamiento',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '150px'
  },
  {
    name: 'Inicio Envío',
    property: 'inicioEnvio',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '150px'
  },
  {
    name: 'Fin Envío',
    property: 'finEnvio',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '150px'
  },
  {
    name: 'Etapa',
    property: 'etapa',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '100px'
  },
  {
    name: 'Intento',
    property: 'intento',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '100px'
  },
  {
    name: 'Resultado',
    property: 'resultado',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '200px'
  },
  {
    name: 'Resultado Descr.',
    property: 'resultadoDescripcion',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '200px'
  },
];
