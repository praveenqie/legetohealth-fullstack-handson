import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FetchEmployeesComponent } from './fetch-employees.component';

describe('FetchEmployeesComponent', () => {
  let component: FetchEmployeesComponent;
  let fixture: ComponentFixture<FetchEmployeesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FetchEmployeesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FetchEmployeesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
