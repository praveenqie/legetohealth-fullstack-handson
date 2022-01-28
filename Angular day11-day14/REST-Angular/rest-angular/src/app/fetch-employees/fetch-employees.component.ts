import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-fetch-employees',
  templateUrl: './fetch-employees.component.html',
  styleUrls: ['./fetch-employees.component.css']
})
export class FetchEmployeesComponent implements OnInit {

  constructor(private _service:EmployeeService,private builder:FormBuilder) { 
    this.handleClick = this.handleClick.bind(this);
  }

  ngOnInit(): void {
  }

  @Input() emp:any;
  employee =this.builder.group({
    id:[],name:[],salary:[] 
  })
errMsg :any=undefined;

handleClick():void{
  this._service.fetchEmployees().subscribe(response=>{
    this.emp=response;
    console.log(response);
    this.errMsg = undefined;
    
  },err=>{
    this.emp=undefined;
    this.errMsg=err;
  });
  this.employee.reset();
}



}
