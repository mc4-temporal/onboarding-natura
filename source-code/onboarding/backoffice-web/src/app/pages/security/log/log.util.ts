import {ITableColumn} from '../../../../@mc4/shared/table/table.model';
import {ILog} from '../../../commons/model/security.interface';

const logTypeContainerStyleBuild = (row: ILog) => {
  switch (row.logType) {
    case 'INFO':
      return {'background-color': '#00aced', 'padding': '3px', 'color': 'white', 'border-radius': '5px'};
    case 'WARNING':
      return {'background-color': 'yellow', 'padding': '3px', 'color': 'white', 'border-radius': '5px'};
    case 'ERROR':
      return {'background-color': 'red', 'padding': '3px', 'color': 'white', 'border-radius': '5px'};
    case 'DEBUG':
      return {'background-color': 'gray', 'padding': '3px', 'color': 'white', 'border-radius': '5px'};
    default:
      return {};
  }
};

export const logTableColums: ITableColumn[] = [
  {
    name: 'Fecha Registro',
    property: 'createdDate',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '100px'
  },
  {
    name: 'Tipo Proceso',
    property: 'processType',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '75px'
  },
  {
    name: 'Tipo Log',
    property: 'logType',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '75px',
    textContainerCellStyle: logTypeContainerStyleBuild
  },
  {
    name: 'Mensaje',
    property: 'log',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '300px'
  }
];
