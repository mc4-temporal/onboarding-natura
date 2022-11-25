import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DirectoraConsultoraConocidaComponent } from './directora-consultora-conocida.component';

describe('DirectoraConsultoraConocidaComponent', () => {
  let component: DirectoraConsultoraConocidaComponent;
  let fixture: ComponentFixture<DirectoraConsultoraConocidaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DirectoraConsultoraConocidaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DirectoraConsultoraConocidaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
