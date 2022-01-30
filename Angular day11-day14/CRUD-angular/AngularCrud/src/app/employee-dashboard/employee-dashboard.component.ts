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
  showAdd !:boolean;
  showUpdate !:boolean;
  constructor(private builder: FormBuilder, private service: EmployeeServiceService) { }

  ngOnInit(): void {

    this.formGroupValue = this.builder.group({
      name: [''],
      salary: ['']
    });
    this.getAllEmployess();
  }
  postEmployeeDetails() {
    this.employeeModel.name = this.formGroupValue.value.name;
    this.employeeModel.salary = this.formGroupValue.value.salary;
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
  removeEmployee(employee:any):void{
    this.service.removeEmployee(employee.id).subscribe(response=>{
      console.log(response);
      alert("Employee deleted successfully ");
      this.getAllEmployess();
    },err =>{
      console.log(err);
    })
  }
  onAddEmployee(){
    this.formGroupValue.reset();
    this.showAdd = true;
    this.showUpdate=false;

  }
  onEditEmployee(employee:any){
    this.showAdd = false;
    this.showUpdate=true;
    this.employeeModel.id = employee.id;
    this.formGroupValue.controls['name'].setValue(employee.name);
    this.formGroupValue.controls['salary'].setValue(employee.salary);
  }
  updateEmployeeDetails(){
  
    this.employeeModel.name = this.formGroupValue.value.name;
    this.employeeModel.salary = this.formGroupValue.value.salary;
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
}
