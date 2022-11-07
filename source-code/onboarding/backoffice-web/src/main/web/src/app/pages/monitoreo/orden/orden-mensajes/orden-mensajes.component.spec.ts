import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OrdenMensajesComponent } from './orden-mensajes.component';

describe('OrdenMensajesComponent', () => {
  let component: OrdenMensajesComponent;
  let fixture: ComponentFixture<OrdenMensajesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OrdenMensajesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(OrdenMensajesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
