import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import { FetchEmployeesComponent } from './fetch-employees/fetch-employees.component';
import { StoreEmployeesComponent } from './store-employees/store-employees.component';
import { RemoveEmployeeComponent } from './remove-employee/remove-employee.component';
import { SearchEmployeeComponent } from './search-employee/search-employee.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap'


@NgModule({
  declarations: [
    AppComponent,
    FetchEmployeesComponent,
    StoreEmployeesComponent,
    RemoveEmployeeComponent,
    SearchEmployeeComponent
  ],
  imports: [
    BrowserModule,FormsModule,ReactiveFormsModule,HttpClientModule, NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
