import {ITableColumn} from '../../../../@mc4/shared/table/table.model';
import {IParticipante} from '../../../commons/model/configuracion.interface';
import {
  EntityRegisterServiceFn,
  IEntityRegisterDialog
} from '../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.model';
import {minLengthValidatorItem, requiredValidatorItem} from '../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.util';
import {FormGroup, Validators} from '@angular/forms';

export const participanteTableColums: ITableColumn[] = [
  {
    name: 'Código',
    property: 'codigo',
    visible: true,
    isModelProperty: true,
    isSort: true
  },
  {
    name: 'Nombre',
    property: 'nombre',
    visible: true,
    isModelProperty: true,
    isSort: true
  },
  {
    name: 'Abreviación',
    property: 'abreviacion',
    visible: true,
    isModelProperty: true,
    isSort: true
  },
  {
    name: 'Tipo',
    property: 'tipo',
    visible: true,
    isModelProperty: true,
    isSort: true
  },
  {
    name: 'Camara',
    property: 'camaraStr',
    visible: true,
    isModelProperty: true,
    isSort: false
  },
  {
    name: 'Padre',
    property: 'padreStr',
    visible: true,
    isModelProperty: true,
    isSort: false
  },
];

export const registerParticipanteDialogConfig = (participanteList: IParticipante[], tipoParticipanteList: any[], registerFn: EntityRegisterServiceFn): IEntityRegisterDialog => ({
  title: 'Crear Participante',
  btnOk: 'Guardar',
  actionType: 'REGISTER',
  registerFn,
  fieldList: [
    {
      type: 'TEXT_INPUT',
      name: 'codigo',
      label: 'Código',
      default: null,
      validators: [
        requiredValidatorItem(),
        minLengthValidatorItem(1),
      ],
      maxlength: 10,
    },
    {
      type: 'TEXT_INPUT',
      name: 'nombre',
      label: 'Nombre',
      default: null,
      validators: [
        requiredValidatorItem(),
        minLengthValidatorItem(5)
      ],
      maxlength: 100,
    },
    {
      type: 'TEXT_INPUT',
      name: 'abreviacion',
      label: 'Abreviación',
      default: null,
      validators: [
        requiredValidatorItem(),
        minLengthValidatorItem(1),
      ],
      maxlength: 10,
    },
    {
      type: 'SELECT',
      name: 'tipo',
      label: 'Tipo participante',
      default: null,
      validators: [
        requiredValidatorItem()
      ],
      selectOptions: {
        dataList: tipoParticipanteList,
        propValue: 'codigo',
        propShow: 'descripcion'
      },
      valueChangeFn: (codigo: string, form: FormGroup, filesConfig: any) => {
        if (codigo === 'PARTICIPANTE_DESTINO' || codigo === 'CAMARA') {
          filesConfig['certificatePrivate'] = [];
          form.controls['certificatePrivate'].clearValidators();
          form.controls['certificatePrivate'].reset(null);
          form.controls['certificatePublic'].clearValidators();
          form.controls['certificatePublic'].addValidators(Validators.required);
          form.controls['certificatePublic'].markAsTouched();
        }
        if (codigo === 'PARTICIPANTE_ORIGEN') {
          filesConfig['certificatePublic'] = [];
          form.controls['certificatePublic'].clearValidators();
          form.controls['certificatePublic'].reset(null);
          form.controls['certificatePrivate'].clearValidators();
          form.controls['certificatePrivate'].addValidators(Validators.required);
          form.controls['certificatePrivate'].markAsTouched();
        }
      }
    },
    {
      type: 'SELECT',
      name: 'idCamara',
      label: 'Cámara',
      default: null,
      validators: [
        requiredValidatorItem()
      ],
      selectOptions: {
        dataList: participanteList,
        propValue: 'id',
        propShow: 'nombre'
      },
    },
    {
      type: 'SELECT',
      name: 'idPadre',
      label: 'Padre',
      default: null,
      validators: [
      ],
      selectOptions: {
        dataList: participanteList,
        propValue: 'id',
        propShow: 'nombre'
      },
    },
    {
      type: 'SLIDER',
      name: 'generaCert',
      label: '¿Generar certificado?',
      default: false,
      validators: [
        requiredValidatorItem(),
      ]
    },
    {
      type: 'FILE_INPUT',
      fileResult: 'BYTES',
      name: 'certificatePublic',
      label: 'Arrastrar certificado público',
      validators: [
        requiredValidatorItem(),
      ]
    },
    {
      type: 'FILE_INPUT',
      fileResult: 'BYTES',
      name: 'certificatePrivate',
      label: 'Arrastrar certificado privado',
      validators: [
        requiredValidatorItem(),
      ]
    }
  ]
});

export const addCertParticipanteDialogConfig = (participante: IParticipante, registerFn: EntityRegisterServiceFn): IEntityRegisterDialog => ({
  title: 'Registrar Certificado',
  btnOk: 'Guardar',
  actionType: 'REGISTER',
  registerFn,
  fieldList: [
    {
      type: 'FILE_INPUT',
      fileResult: 'BYTES',
      name: 'certificatePublic',
      label: 'Arrastrar certificado público',
      validators: participante.tipo === 'PARTICIPANTE_DESTINO' || participante.tipo === 'CAMARA' ? [
        requiredValidatorItem(),
      ] : []
    },
    {
      type: 'FILE_INPUT',
      fileResult: 'BYTES',
      name: 'certificatePrivate',
      label: 'Arrastrar certificado privado',
      validators: participante.tipo === 'PARTICIPANTE_ORIGEN' ? [
        requiredValidatorItem(),
      ] : []
    }
  ]
});

export const certTableColums: ITableColumn[] = [
  { name: 'Id', property: 'id', visible: true, isModelProperty: true, isSort: true, width: '10%'},
  { name: 'Vencimiento', property: 'fechaVencimiento', visible: true, isModelProperty: true, isSort: true, width: '45%'},
  { name: 'Serial', property: 'serial', visible: true, isModelProperty: true, isSort: false, width: '45%'},
];
