import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DataBindComponent } from './data-bind.component';

describe('DataBindComponent', () => {
  let component: DataBindComponent;
  let fixture: ComponentFixture<DataBindComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DataBindComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DataBindComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
