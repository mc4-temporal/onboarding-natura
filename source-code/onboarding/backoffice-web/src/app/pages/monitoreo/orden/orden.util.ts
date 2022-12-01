import {CellCheckLoadingCellFn, ITableColumn} from '../../../../@mc4/shared/table/table.model';
import {IParticipante} from '../../../commons/model/configuracion.interface';
import {IEnumDto} from '../../../commons/model/enum.value';
import {EntityRegisterServiceFn, IEntityRegisterDialog} from '../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.model';
import {
  maxNumberValidatorItem, minLengthValidatorItem,
  minNumberValidatorItem, patternValidatorItem,
  requiredValidatorItem
} from '../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.util';
import {FormGroup, Validators} from '@angular/forms';
import {FormUtil} from '../../../commons/utils/form.util';

export const ordenTableColumnsConfig = (showLoadinCell: CellCheckLoadingCellFn): ITableColumn[] => ([
  {
    name: 'Part. Origen',
    property: 'partOrigenStr',
    visible: true,
    isModelProperty: true,
    isSort: false,
    width: '100px',
  },
  {
    name: 'Part. Destino',
    property: 'partDestinoStr',
    visible: true,
    isModelProperty: true,
    isSort: false,
    width: '100px',
  },
  {
    name: 'Fecha Registro',
    property: 'createdDate',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '150px',
  },
  {
    name: 'Num. Orden Originante',
    property: 'numeroOrdenOriginante',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '170px',
  },
  {
    name: 'Num. Orden Cámara',
    property: 'numeroOrdenCamara',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '170px',
  },
  {
    name: 'Num. Orden Destinatario',
    property: 'numeroOrdenDestinatario',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '170px',
  },
  {
    name: 'Tipo',
    property: 'tipo',
    visible: false,
    isModelProperty: true,
    isSort: true,
    width: '150px',
  },
  {
    name: 'Estado',
    property: 'estadoOrden',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '75px',
    showLoadinCell
  },
  {
    name: 'Modalidad',
    property: 'modalidad',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '100px',
  },
  {
    name: 'Etapa',
    property: 'etapaOrden',
    visible: false,
    isModelProperty: true,
    isSort: true,
    width: '150px',
  },
  {
    name: 'Monto',
    property: 'monto',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '100px',
  },
  {
    name: 'Moneda',
    property: 'moneda',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '150px',
  },
  {
    name: 'Cuenta Origen',
    property: 'numeroCuentaOrigen',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '150px',
  },
  {
    name: 'Cuenta Destino',
    property: 'numeroCuentaDestino',
    visible: true,
    isModelProperty: true,
    isSort: true,
    width: '150px',
  },
]);


export const ordenEntityRegisterConfig = (registerFn: EntityRegisterServiceFn,
                                          participanteOriginadorList: IParticipante[],
                                          participanteReceptorList: IParticipante[],
                                          tipoOrdenList: IEnumDto[],
                                          dominioMonedaList: any[],
                                          tipoCuentaOrigenList: any[],
                                          tipoCuentaDestinoList: any[],
                                          tipoRegistro: any[]): IEntityRegisterDialog => ({
  title: 'Nueva Orden',
  btnOk: 'Procesar',
  actionType: 'REGISTER',
  registerFn,
  fieldList: [
    {
      type: 'SELECT',
      name: 'codOriginante',
      label: 'P. Originante',
      validators: [
        requiredValidatorItem()
      ],
      selectOptions: {
        dataList: participanteOriginadorList,
        propValue: 'codigo',
        propShow: 'nombre'
      },
    },
    {
      type: 'SELECT',
      name: 'codDestinatario',
      label: 'P. Destinatario',
      validators: [
        requiredValidatorItem()
      ],
      selectOptions: {
        dataList: participanteReceptorList,
        propValue: 'codigo',
        propShow: 'nombre'
      },
    },
    {
      type: 'NUMBER_INPUT',
      name: 'importe',
      label: 'Monto',
      validators: [
        requiredValidatorItem(),
        minNumberValidatorItem(1),
        maxNumberValidatorItem(99999999),
        patternValidatorItem('^((?!0)\\d{1,5}|0|\\.\\d{1,2})($|\\.$|\\.\\d{1,2}$)', 'debe ser un número de 5 enteros y 2 decimales como maximo.')
      ],
    },
    {
      type: 'SELECT',
      name: 'codMoneda',
      label: 'Moneda',
      validators: [
        requiredValidatorItem()
      ],
      selectOptions: {
        dataList: dominioMonedaList,
        propValue: 'codigo',
        propShow: 'descripcion'
      },
    },
    {
      type: 'SELECT',
      name: 'tipoOrden',
      label: 'Tipo Operación',
      validators: [
        requiredValidatorItem()
      ],
      selectOptions: {
        dataList: tipoOrdenList,
        propValue: 'codigo',
        propShow: 'descripcion'
      },
    },
    {
      type: 'TEXT_INPUT',
      name: 'cuentaOrigen',
      label: 'Cuenta Origen',
      validators: [
        requiredValidatorItem(),
      ],
      maxlength: 15,
    },
    {
      type: 'SELECT',
      name: 'tipoCuentaOrigen',
      label: 'Tipo Cuenta Origen',
      default: 'CCAO',
      validators: [
        requiredValidatorItem()
      ],
      selectOptions: {
        dataList: tipoCuentaOrigenList,
        propValue: 'codigo',
        propShow: 'descripcion'
      },
    },
    {
      type: 'TEXT_INPUT',
      name: 'ciNitOriginante',
      label: 'CI/NIT Originante',
      validators: [
        requiredValidatorItem(),
      ],
      maxlength: 15,
    },
    {
      type: 'TEXT_INPUT',
      name: 'titularOriginante',
      label: 'Titular Originante',
      validators: [
        requiredValidatorItem(),
      ],
      maxlength: 60,
    },
    {
      type: 'TEXT_INPUT',
      name: 'cuentaDestino',
      label: 'Cuenta Destino',
      validators: [
        requiredValidatorItem(),
      ],
      maxlength: 15,
    },
    {
      type: 'SELECT',
      name: 'tipoCuentaDestino',
      label: 'Tipo Cuenta Destino',
      default: 'CCAD',
      validators: [
        requiredValidatorItem()
      ],
      selectOptions: {
        dataList: tipoCuentaDestinoList,
        propValue: 'codigo',
        propShow: 'descripcion'
      },
    },
    {
      type: 'TEXT_INPUT',
      name: 'ciNitDestinatario',
      label: 'CI/NIT Destinatario',
      validators: [
        requiredValidatorItem(),
      ],
      maxlength: 15,
    },
    {
      type: 'TEXT_INPUT',
      name: 'titularDestinatario',
      label: 'Titular Destinatario',
      validators: [
        requiredValidatorItem(),
      ],
      maxlength: 60,
    },
    {
      type: 'TEXT_INPUT',
      name: 'glosa',
      label: 'Motivo',
      validators: [
        requiredValidatorItem(),
        minLengthValidatorItem(5)
      ],
      maxlength: 60,
    },
    {
      type: 'TEXT_AREA',
      name: 'origenFondos',
      label: 'Origen Fondos',
      validators: [],
      maxlength: 200,
      options: {}
    },
    {
      type: 'TEXT_AREA',
      name: 'destinoFondos',
      label: 'Destino Fondos',
      validators: [],
      maxlength: 200,
      options: {}
    },
    {
      type: 'SELECT',
      name: 'tipoRegistro',
      label: 'Tipo de Registro',
      default: 'SYNC',
      validators: [
        requiredValidatorItem()
      ],
      selectOptions: {
        dataList: tipoRegistro,
        propValue: 'codigo',
        propShow: 'descripcion'
      },
    },
    {
      type: 'HIDDEN',
      name: 'canal',
      default: 'WEB',
      label: '',
      validators: [],
    }
  ]
});

export const ordenQrEntityRegisterConfig = (registerFn: EntityRegisterServiceFn,
                                            participanteOriginadorList: IParticipante[],
                                            dominioMonedaList: any[]): IEntityRegisterDialog => ({
  title: 'Nueva Orden QR',
  btnOk: 'Procesar',
  actionType: 'REGISTER',
  registerFn,
  fieldList: [
    {
      type: 'SELECT',
      name: 'codOriginante',
      label: 'P. Originante',
      validators: [
        requiredValidatorItem()
      ],
      selectOptions: {
        dataList: participanteOriginadorList,
        propValue: 'codigo',
        propShow: 'nombre'
      },
    },
    {
      type: 'TEXT_INPUT',
      name: 'nombreRazonSocial',
      label: 'Razón Social',
      validators: [
        requiredValidatorItem(),
      ],
      maxlength: 60,
    },
    {
      type: 'TEXT_INPUT',
      name: 'ciNit',
      label: 'CI/NIT',
      validators: [
        requiredValidatorItem(),
      ],
      maxlength: 15,
    },
    {
      type: 'TEXT_INPUT',
      name: 'numeroCuenta',
      label: 'Nro. Cuenta',
      validators: [
        requiredValidatorItem(),
      ],
      maxlength: 15,
    },
    {
      type: 'SELECT',
      name: 'moneda',
      label: 'Moneda',
      validators: [
        requiredValidatorItem()
      ],
      selectOptions: {
        dataList: dominioMonedaList,
        propValue: 'codigo',
        propShow: 'descripcion'
      },
    },
    {
      type: 'NUMBER_INPUT',
      name: 'importe',
      label: 'Monto',
      validators: [
        requiredValidatorItem(),
        minNumberValidatorItem(1),
        maxNumberValidatorItem(99999999),
        patternValidatorItem(FormUtil.buildNumberPattern(5, 2), 'debe ser un número de 5 enteros y 2 decimales como maximo.')
      ],
    },
    {
      type: 'TEXT_AREA',
      name: 'glosa',
      label: 'Glosa',
      validators: [
        requiredValidatorItem()
      ],
      maxlength: 30,
      options: {}
    },
    {
      type: 'SLIDER',
      name: 'unicoUso',
      label: '¿Uso Único?',
      default: false,
      validators: [
        requiredValidatorItem(),
      ]
    },
    {
      type: 'DATE',
      name: 'fechaVencimiento',
      label: 'Fecha Vencimiento',
      validators: [
        requiredValidatorItem(),
      ],
    }
  ]
});
