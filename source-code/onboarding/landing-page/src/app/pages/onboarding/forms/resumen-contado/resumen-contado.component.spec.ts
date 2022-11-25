import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ResumenContadoComponent } from './resumen-contado.component';

describe('ResumenContadoComponent', () => {
  let component: ResumenContadoComponent;
  let fixture: ComponentFixture<ResumenContadoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ResumenContadoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ResumenContadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
