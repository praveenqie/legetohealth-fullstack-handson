import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { EmployeeServiceService } from '../employee.service';
import { EmployeeModel } from './employee-dashboard.model';


@Component({
  selector: 'app-employee-dashboard',
  templateUrl: './employee-dashboard.component.html',
  styleUrls: ['./employee-dashboard.component.css']
})
export class EmployeeDashboardComponent implements OnInit {

  formGroupValue !: FormGroup;
  employeeModel: EmployeeModel = new EmployeeModel();
  employeeData: any;
  showAdd !: boolean;
  showUpdate !: boolean;
  constructor(private builder: FormBuilder, private service: EmployeeServiceService) { }

  ngOnInit(): void {

    this.formGroupValue = this.builder.group({
      EmployeeID: [''],
      FirstName: [''],
      LastName: [''],
      Age: [''],
      Salary: [''],
      City: ['']
    });
    this.getAllEmployess();
  }
  postEmployeeDetails() {
    this.employeeModel.FirstName = this.formGroupValue.value.FirstName;
    this.employeeModel.LastName = this.formGroupValue.value.LastName;
    this.employeeModel.Age = this.formGroupValue.value.Age;
    this.employeeModel.Salary = this.formGroupValue.value.Salary;
    this.employeeModel.City = this.formGroupValue.value.City;
    console.log(`This is post data name ${this.employeeModel.FirstName}`)
    this.service.storeEmployees(this.employeeModel).subscribe(response => {
      console.log(response);
      alert("Employee added succesfully!")
      this.getAllEmployess();
      this.formGroupValue.reset();
      let cancel = document.getElementById("cancel");

      cancel?.click();
    }, err => {
      alert("Something went wrong")
    });
  }

  getAllEmployess() {
    this.service.fetchEmployees().subscribe(response => {
      this.employeeData = response;
      console.log(response);
    }, err => {
      console.log(err);
    });

  }
  removeEmployee(employee: any): void {
    this.service.removeEmployee(employee.EmployeeID).subscribe(response => {
      console.log(response);
      alert("Employee deleted successfully ");
      this.getAllEmployess();
    }, err => {
      console.log(err);
    })
  }
  onAddEmployee() {
    this.formGroupValue.reset();
    this.showAdd = true;
    this.showUpdate = false;

  }
  onEditEmployee(employee: any) {
    this.showAdd = false;
    this.showUpdate = true;
    this.employeeModel.EmployeeID = employee.EmployeeID;
    this.formGroupValue.controls['FirstName'].setValue(employee.FirstName);
    this.formGroupValue.controls['LastName'].setValue(employee.LastName);
    this.formGroupValue.controls['Age'].setValue(employee.Age);
    this.formGroupValue.controls['Salary'].setValue(employee.Salary);
    this.formGroupValue.controls['City'].setValue(employee.City);
  }
  updateEmployeeDetails() {

    this.employeeModel.FirstName = this.formGroupValue.value.FirstName;
    this.employeeModel.LastName = this.formGroupValue.value.LastName;
    this.employeeModel.Age = this.formGroupValue.value.Age;
    this.employeeModel.Salary = this.formGroupValue.value.Salary;
    this.employeeModel.City = this.formGroupValue.value.City;
    console.log(`update data id ${this.employeeModel.EmployeeID}`)
    this.service.updateEmployee(this.employeeModel).subscribe(response => {
      console.log(response);
      alert("Employee updated succesfully!")
      this.getAllEmployess();
      this.formGroupValue.reset();
      let cancel = document.getElementById("cancel");

      cancel?.click();
    }, err => {
      alert("Something went wrong")
    });
  }
  searchEmployee() {
    this.service.searchEmployee(this.formGroupValue.value.EmployeeID).subscribe(response => {
      console.log(response);
      this.employeeData = response;

    }, error => {
      console.log(error);
    })
  }
}
