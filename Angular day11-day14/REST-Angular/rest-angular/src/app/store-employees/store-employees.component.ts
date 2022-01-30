import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ModalDismissReasons, NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { EmployeeService } from '../employee.service';
import { FetchEmployeesComponent } from '../fetch-employees/fetch-employees.component';

@Component({
  selector: 'app-store-employees',
  templateUrl: './store-employees.component.html',
  styleUrls: ['./store-employees.component.css']
})
export class StoreEmployeesComponent implements OnInit {

  constructor(private _service: EmployeeService, private _builder: FormBuilder, private modalService: NgbModal) { }
  closeResult = '';
  ngOnInit(): void {
   
  }

  employee = this._builder.group({
    id: [], name: [], salary: []
  });
  emp: any = undefined;
  errMsg: any = undefined;
  success: boolean = false;
  onClickSubmit(e: any): void {
    this._service.storeEmployees(e).subscribe(response => {
      this.emp = response;
      console.log(response);
      this.errMsg = undefined;
      this.success = true;
      console.log(this.success);
    
    }, err => {
      this.emp = undefined;
      this.errMsg = err;
      this.success = false;
    });
    this.employee.reset();
  }

  open(content: any): void {
    this.modalService.open(content,
      { ariaLabelledBy: 'modal-basic-title' }).result.then((result) => {
        this.closeResult = `Closed with: ${result}`;
      }, (reason) => {
        this.closeResult =
          `Dismissed ${this.getDismissReason(reason)}`;
      });
  }

  private getDismissReason(reason: any): string {
    if (reason === ModalDismissReasons.ESC) {
      return 'by pressing ESC';
    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
      return 'by clicking on a backdrop';
    } else {
      return `with: ${reason}`;
    }
  }

}
