import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeArrayComponent } from './employee-array.component';

describe('EmployeeArrayComponent', () => {
  let component: EmployeeArrayComponent;
  let fixture: ComponentFixture<EmployeeArrayComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmployeeArrayComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeArrayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
