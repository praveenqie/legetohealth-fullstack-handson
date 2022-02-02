import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StoreEmployeesComponent } from './store-employees.component';

describe('StoreEmployeesComponent', () => {
  let component: StoreEmployeesComponent;
  let fixture: ComponentFixture<StoreEmployeesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StoreEmployeesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StoreEmployeesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
