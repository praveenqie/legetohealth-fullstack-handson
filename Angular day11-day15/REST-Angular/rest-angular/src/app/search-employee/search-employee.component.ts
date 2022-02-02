import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-search-employee',
  templateUrl: './search-employee.component.html',
  styleUrls: ['./search-employee.component.css']
})
export class SearchEmployeeComponent implements OnInit {

  constructor(private service:EmployeeService,private builder:FormBuilder) {
     
   }

   
  ngOnInit(): void {
  }
  employee = this.builder.group({
    id:[],name:[],salary:[]
  });
emp :any = undefined;
errMsg :any = undefined;
isSuccess :boolean=false;
  handclick():void{
    let employeeId = this.employee.controls['id'].value;
    console.log(employeeId);
    this.service.searchEmployee(employeeId).subscribe(response=>{
    this.emp = response;
    this.isSuccess=true;
    },error=>{
      this.errMsg = error;
      this.isSuccess=false;
    })
  }

}
