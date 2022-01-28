import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-remove-employee',
  templateUrl: './remove-employee.component.html',
  styleUrls: ['./remove-employee.component.css']
})
export class RemoveEmployeeComponent implements OnInit {

  @Input() employee: any;

  constructor(private _service: EmployeeService, private _builder: FormBuilder) { }
  ngOnInit(): void {
  }
emp:any = undefined;
errMsg :any = undefined;
  handleClick():void{
    let id = this.employee.id;
    console.log(`id for remove an employee ${id}`);
    this._service.removeEmployee(id).subscribe(response=>{
      this.emp = response;
    },err =>{
      this.errMsg = err;
    })
  }
}
