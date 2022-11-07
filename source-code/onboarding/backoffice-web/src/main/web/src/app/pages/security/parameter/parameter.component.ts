import {Component, OnInit} from '@angular/core';
import {
  ITableColumn,
  ITableEvents,
  ITableRowAction,
  noopTableEvent,
  PaginatedFn
} from '../../../../@mc4/shared/table/table.model';
import {MatTableDataSource} from '@angular/material/table';
import {IParameter, IParameterGroup} from '../../../commons/model/security.interface';
import {BehaviorSubject, of} from 'rxjs';
import {MatDialog} from '@angular/material/dialog';
import {ParameterService} from '../../../commons/services/security/parameter.service';
import {
  FieldItem,
  IEntityRegisterDialog
} from '../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.model';
import {
  minLengthValidatorItem,
  requiredValidatorItem
} from '../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.util';
import {EntityRegisterDialogComponent} from '../../../../@mc4/shared/entity-register-dialog/entity-register-dialog.component';
import {buildEntityRegisterDialog} from '../../../commons/utils/dialog.util';
import {FormControl, Validators} from '@angular/forms';
import {ParameterGroupService} from '../../../commons/services/security/parameter-group.service';
import {ParameterType} from '../../../commons/model/enum.value';
import {Loading} from 'notiflix';
import {DatePipe} from '@angular/common';
import {resourceCode} from '../../../commons/utils/constants';
import {ResourceService} from '../../../commons/services/security/resource.service';

@Component({
  selector: 'mc4-parameter',
  templateUrl: './parameter.component.html',
  styleUrls: ['./parameter.component.scss']
})
export class ParameterComponent implements OnInit {
  columns: ITableColumn[];
  rowActions: ITableRowAction[] = [];
  commonTableActions: any;
  dataSource: MatTableDataSource<IParameter>;
  tableEvents = new BehaviorSubject<ITableEvents>(noopTableEvent());
  groupParameterControl: FormControl;
  parameterGroups: IParameterGroup[];
  parameterActions: { [key: string]: boolean } = {};

  constructor(private parameterService: ParameterService,
              private matDialog: MatDialog,
              private parameterGroupService: ParameterGroupService,
              private resourceService: ResourceService,
              private datePipe: DatePipe) {
    this.commonTableActions = {
      updateCode: '101',
    };
    this.columns = this.buildTableColumns();
    this.dataSource = new MatTableDataSource<IParameter>();
    this.groupParameterControl = new FormControl(null, Validators.required);

  }

  ngOnInit() {
    this.tableEvents.subscribe(this.tableActionManager);
    this.resourceService.requestActionList(resourceCode.parameterResourceCode)
      .subscribe({next: this.successActionList});

    Loading.pulse();
    this.parameterGroupService.requestParameterGroupList()
      .subscribe({
        next: (body) => {
          this.parameterGroups = body;
          Loading.remove(300);
        },
      });
  }

  filterData(filter: string) {
    const aditionalParams = {filter};
    this.tableEvents.next({event: 'RESET', data: {aditionalParams}});
  }

  requestRoleListFn: PaginatedFn = (queryParams) => {
    return this.groupParameterControl.valid ? this.parameterService.requestParameterListByGroup(this.groupParameterControl.value, queryParams) : of();
  }

  itemParameterFormatter = (content: IParameter[]): IParameter[] => {
    return content.map(item => {
      if (item.parameterType === ParameterType.LOB) item.value = item.stringValue;
      if (item.parameterType === ParameterType.CADENA) item.value = item.stringValue;
      if (item.parameterType === ParameterType.LOB) item.value = item.lobValue;
      if (item.parameterType === ParameterType.NUMERICO) item.value = `${item.numberValue}`;
      if (item.parameterType === ParameterType.BOOLEANO) item.value = item.boolValue ? 'Si' : 'No';
      if (item.parameterType === ParameterType.FECHA) item.value = this.datePipe.transform(item.dateValue, 'dd/MM/yyyy HH:mm:ss');
      return item;
    });
  }

  groupParameterSelected() {
    if (this.groupParameterControl.valid) {
      this.tableEvents.next({event: 'RESET'});
    }
  }

  protected successActionList = (data: any) => {
    this.parameterActions = data;
    this.rowActions = this.buildRowActions();
    if (this.rowActions.length === 0) this.tableEvents.next({event: 'RELOAD_ACTIONS'});
  }

  protected buildTableColumns = (): ITableColumn[] => ([
    {name: 'Código', property: 'code', visible: true, isModelProperty: true, isSort: true, width: '300px'},
    {name: 'Valor', property: 'value', visible: true, isModelProperty: true},
    // {name: '¿Dato Sensible?', property: 'encodeStr', visible: true, isModelProperty: true, width: '150px'},
    // {name: 'Tipo Parametro', property: 'parameterType', visible: true, isModelProperty: true, width: '150px'},
    {name: 'Descripción', property: 'description', visible: true, isModelProperty: true, isSort: true}
  ])

  protected buildRowActions = (): ITableRowAction[] => {
    const actions = [];
    if (this.parameterActions.updateAction) actions.push({
      action: 'Actualizar',
      actionCode: this.commonTableActions.updateCode,
      icon: 'edit'
    });
    return actions;
  }

  protected tableActionManager = (event: ITableEvents) => {
    if (event.event === 'ROW_CLICK') {
      this.rowActionEvent(event.data);
    }
  }

  protected rowActionEvent = (event: { item: any, actionCode: string }) => {
    const {item, actionCode} = event;
    if (actionCode === this.commonTableActions.updateCode) this.updateParameter(item);
  }

  protected updateParameter = (item: IParameter = null) => {
    const data = this.buildUpdateDialogData(item);
    this.matDialog.open(EntityRegisterDialogComponent, buildEntityRegisterDialog(data))
      .afterClosed()
      .subscribe(result => this.afterRegisterDialog(result, !!item));
  }

  protected buildUpdateDialogData = (item: IParameter): IEntityRegisterDialog => ({
    title: 'Editar Parametro',
    subtitle: null,
    btnOk: 'Guardar',
    actionType: 'UPDATE',
    entityId: item.id,
    updateFn: (id: number, body: IParameter) => this.parameterService.requestUpdateParameter(id, body),
    registerFn: null,
    fieldList: [
      {
        type: 'TEXT_INPUT',
        name: 'name',
        label: 'Codigo',
        default: item.code,
        validators: [
          requiredValidatorItem(),
          minLengthValidatorItem(3)
        ],
        maxlength: 35,
        options: {},
        disabled: true
      },
      {
        type: 'TEXT_INPUT',
        name: 'description',
        label: 'Descripción',
        default: item.description,
        validators: [
          requiredValidatorItem(),
          minLengthValidatorItem(5)
        ],
        maxlength: 250,
        options: {}
      },
      {
        type: 'SLIDER',
        name: 'encode',
        label: '¿Dato sensible?',
        default: item.encode,
        validators: [
          requiredValidatorItem(),
        ],
        options: {}
      }, this.getComponentEdit(item)
    ]
  })

  protected getComponentEdit(item: IParameter) {
    let component: FieldItem = {label: '', name: '', type: undefined, validators: []};
    switch (item.parameterType) {
      case ParameterType.CADENA:
        component = {
          type: 'TEXT_INPUT',
          name: 'stringValue',
          label: 'Valor cadena',
          default: item.stringValue,
          validators: [
            requiredValidatorItem(),
          ],
          maxlength: 1096,
          options: {}
        };
        break;
      case ParameterType.BOOLEANO:
        component = {
          type: 'SLIDER',
          name: 'boolValue',
          label: 'Valor booleano',
          default: item.boolValue,
          validators: [
            requiredValidatorItem(),
          ],
          options: {}
        };
        break;
      case ParameterType.NUMERICO:
        component = {
          type: 'NUMBER_INPUT',
          name: 'numberValue',
          label: 'Valor numerico',
          default: item.numberValue,
          validators: [
            requiredValidatorItem(),
          ],
          maxlength: 1096,
          options: {}
        };
        break;
      case ParameterType.LOB:
        component = {
          type: 'TEXT_AREA',
          name: 'lobValue',
          label: 'Valor lob',
          default: item.lobValue,
          validators: [
            requiredValidatorItem(),
          ],
          options: {}
        };
        break;
      case ParameterType.FECHA:
        component = {
          type: 'DATE',
          name: 'dateValue',
          label: 'Valor fecha',
          default: item.dateValue,
          validators: [
            requiredValidatorItem(),
          ],
          options: {}
        };
        break;
      default:
        component = {label: '', name: '', type: undefined, validators: []};
    }
    return component;
  }

  protected afterRegisterDialog = (result: any, wasUpdate: boolean) => {
    if (result) {
      this.tableEvents.next({event: wasUpdate ? 'RELOAD_PAGE' : 'RESET'});
    }
  }

}
