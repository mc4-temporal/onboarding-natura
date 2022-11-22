import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {fadeInUpAnimation} from '../../animations/fade-in-up.animation';
import {fadeInRightAnimation} from '../../animations/fade-in-right.animation';
import {EntityRegisterServiceFn, FieldItem, IEntityRegisterDialog} from './entity-register-dialog.model';
import {FormControl, FormGroup} from '@angular/forms';
import {Loading} from 'notiflix';
import {FileHandle} from '../../directive-pipes/drag-area.directive';
import {fileUtil} from '../../../app/commons/utils/file.util';
import {HttpClient} from '@angular/common/http';
import {DomSanitizer} from '@angular/platform-browser';

@Component({
  selector: 'mc4-entity-register-dialog',
  templateUrl: './entity-register-dialog.component.html',
  styleUrls: ['./entity-register-dialog.component.scss'],
  animations: [fadeInUpAnimation, fadeInRightAnimation]
})
export class EntityRegisterDialogComponent implements OnInit {
  form: FormGroup;
  fieldList: FieldItem[];
  registerFn: EntityRegisterServiceFn;

  files: FileHandle[] = [];
  fileConfig = {};
  constructor(public dialogRef: MatDialogRef<EntityRegisterDialogComponent>,
              @Inject(MAT_DIALOG_DATA) public data: IEntityRegisterDialog,
              private sanitizer: DomSanitizer) { }

  ngOnInit() {
    this.fieldList = this.data.fieldList;
    this.registerFn = this.data.registerFn;
    this.buildFormGroup();
  }

  submitForm() {
    if (this.form.valid) {
      Loading.pulse();
      if (this.data.actionType === 'REGISTER') {
        if (this.data.registerFn) {
          this.data.registerFn(this.form.value)
            .subscribe({next: this.successRegisterOrUpdateFn});
        } else {
          this.successRegisterOrUpdateFn(this.form.value);
        }
      } else if (this.data.actionType === 'UPDATE') {
        if (this.data.updateFn) {
          this.data.updateFn(this.data.entityId, this.form.value)
            .subscribe({next: this.successRegisterOrUpdateFn});
        } else {
          this.successRegisterOrUpdateFn(this.form.value);
        }
      }
    } else {
      for (const key in this.form.controls) {
        if (!this.form.controls[key].valid) {
          this.form.controls[key].markAsTouched();
        }
      }
    }
  }

  protected successRegisterOrUpdateFn = (body: any) => {
    Loading.remove(300);
    this.dialogRef.close(body ? body : true);
  }

  protected buildFormGroup() {
    this.form = new FormGroup({});
    for (const item of this.fieldList) {
      if (!item.validators) item.validators = [];
      const validatorList = item.validators.map(vItem => vItem.validator);
      this.form.addControl(item.name, new FormControl({value: item.default , disabled: item.disabled }, validatorList));
      if (item.valueChangeFn) {
        this.form.controls[item.name]
          .valueChanges
          .subscribe((value) => item.valueChangeFn(value, this.form, this.fileConfig));
      }
      if (item.type === 'FILE_INPUT') {
        this.fileConfig[item.name] = [];
      }
    }
  }

  togglePassword(field: FieldItem) {
    if (field.typeInp === 'password') {
      field.typeInp = 'text';
    } else if (field.typeInp === 'text') {
      field.typeInp = 'password';
    }
  }

  async filesDropped(files: FileHandle[], field: FieldItem) {
    const controlName = field.name;
    this.fileConfig[controlName] = files;
    if (field.fileResult === 'BYTES') {
      const bytes = await fileUtil.fileToByteArray(files[0].file);
      this.form.get(controlName).setValue(bytes);
    }
    if (field.fileResult === 'BASE64') {
      const base64 = await fileUtil.fileToBase64(files[0].file);
      this.form.get(controlName).setValue(base64);
    }
  }

  async loadFiles(event: any, field: FieldItem) {
    const files: FileHandle[] = [];
    for (const file of event.target.files) {
      const url = this.sanitizer.bypassSecurityTrustUrl(window.URL.createObjectURL(file));
      files.push({ file, url});
    }
    if (files.length > 0) {
      await this.filesDropped(files, field);
    }
  }

  isImage(file: FileHandle) {
    return file.file.type && file.file.type.indexOf('image') >= 0;
  }

  fieldFileLabel(field: FieldItem) {
    let reqStr = '';
    const isRequired = field.validators.find(it => it.type === 'required');
    if (isRequired) {
      reqStr = ' *';
    }
    return field.label + reqStr;
  }
}
