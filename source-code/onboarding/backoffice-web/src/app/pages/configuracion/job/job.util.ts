import {ITableColumn} from '../../../../@mc4/shared/table/table.model';

export const jobActionsCode = {
  pause: '1',
  restart: '2',
  execNow: '3',
  delete: '4',
  history: '5',
};

export const jobTableColums: ITableColumn[] = [
  {
    name: 'Proceso',
    property: 'jobName',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '14%'
  },
  {
    name: 'Descripción',
    property: 'description',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '21%'
  },
  {
    name: 'Última ejecución',
    property: 'lastFiredTime',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '12%',
  },
  {
    name: 'Próxima ejecución',
    property: 'nextFireTime',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '12%',
  },
  {
    name: 'Expresión cron',
    property: 'cronExpression',
    visible: true,
    isModelProperty: true,
    isSort: false,
    width: '12%',
  },
  {
    name: 'Estado',
    property: 'jobStatus',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '12%',
  },
];

export const jobHistoryColumns: ITableColumn[] = [
  {
    name: 'Proceso',
    property: 'jobName',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '20%',
  },
  {
    name: 'Mensaje',
    property: 'message',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '20%',
    largeText: {
      text: 'Ver Mensaje',
      actionCode: '100'
    }
  },
  {
    name: 'Fecha Inicio',
    property: 'startTime',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '20%',
  },
  {
    name: 'Fecha Fin',
    property: 'endTime',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '20%',
  },
  {
    name: 'Estado de ejecución',
    property: 'jobState',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '20%',
  }
];
