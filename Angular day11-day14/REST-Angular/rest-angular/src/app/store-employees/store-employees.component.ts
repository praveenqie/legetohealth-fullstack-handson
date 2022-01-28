import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-store-employees',
  templateUrl: './store-employees.component.html',
  styleUrls: ['./store-employees.component.css']
})
export class StoreEmployeesComponent implements OnInit {

  constructor(private _service:EmployeeService,private _builder:FormBuilder) { }

  ngOnInit(): void {
  }

  employee = this._builder.group({
    id:[],name:[],salary:[]
  });
  emp: any=undefined;
  errMsg : any =undefined;
  success :boolean = false;
  onClickSubmit(e:any):void{
    this._service.storeEmployees(e).subscribe(response=>{
      this.emp=response;
      console.log(response);
      this.errMsg = undefined;
      this.success = true;
      console.log(this.success);
    },err=>{
      this.emp=undefined;
      this.errMsg=err;
      this.success=false;
    });
    this.employee.reset();
  }

}
