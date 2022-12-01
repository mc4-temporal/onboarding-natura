import {Component, OnInit} from '@angular/core';
import {actionTableColumItem, ITableColumn, ITableEvents, ITableRowAction, noopTableEvent} from '../../../../@mc4/shared/table/table.model';
import {MatTableDataSource} from '@angular/material/table';
import {BehaviorSubject} from 'rxjs';
import {ResourceService} from '../../../commons/services/security/resource.service';
import {IResource} from '../../../commons/model/security.interface';
import {resourceCode} from '../../../commons/utils/constants';

@Component({
  selector: 'mc4-resource',
  templateUrl: './resource.component.html',
  styleUrls: ['./resource.component.scss']
})
export class ResourceComponent implements OnInit {
  columns: ITableColumn[];
  dataSource: MatTableDataSource<IResource>;
  tableEvents = new BehaviorSubject<ITableEvents>(noopTableEvent());
  protected tableActionCode: any = {
    updateResource: '100'
  };

  rowActions: ITableRowAction[] = [];
  userActions: {[key: string]: boolean} = {};
  get visibleColumns() {
    return this.columns.filter(column => column.visible).map(column => column.property);
  }
  constructor(private resourceService: ResourceService) {
    this.dataSource = new MatTableDataSource<IResource>([]);

    this.columns = this.buildColumns();

    this.tableEvents.subscribe(this.tableActionManager);
    this.resourceService.requestAllResourceList()
      .subscribe({
        next: (body) => this.dataSource.data = body
      });
  }

  ngOnInit() {
    this.resourceService.requestActionList(resourceCode.resourcePageCode)
      .subscribe({next: this.successActionList});
  }

  isGroupItem = (index, item: IResource) => !item.idResourceParent;

  filterDataTable(text: string) {
    this.dataSource.filter = text;
  }

  rowOptionClick(row, actionCode) {
    this.rowActionEvent({actionCode, item: row});
  }

  protected successActionList = (data: any) => {
    this.userActions = data;
    this.rowActions = this.buildRowActions();
    if (this.rowActions.length === 0) this.columns.splice(this.columns.length - 1, 1);
  }

  protected buildRowActions = (): ITableRowAction[] => {
    const actions = [];
    if (this.userActions.updateAction) actions.push({
      action: 'Actualizar',
      actionCode: this.tableActionCode.updateResource,
      icon: 'edit'
    });
    return actions;
  }

  protected buildColumns = (): ITableColumn[] => ([
    { name: 'Nombre', property: 'name', visible: true, isModelProperty: true },
    { name: 'Ruta', property: 'route', visible: true, isModelProperty: true },
    { name: 'Orden', property: 'position', visible: true, isModelProperty: true },
    { name: 'Icono', property: 'icon', visible: true, isModelProperty: true },
    { name: 'Tipo', property: 'type', visible: true, isModelProperty: true },
    actionTableColumItem
  ])

  protected tableActionManager = (event: ITableEvents) => {
    console.log('COMP: ', event);
    if (event.event === 'ROW_CLICK') {
      this.rowActionEvent(event.data);
    }
  }

  protected rowActionEvent(event: {item: any, actionCode: string}) {
    console.log('ROW CLICK: ', event);
  }
}
