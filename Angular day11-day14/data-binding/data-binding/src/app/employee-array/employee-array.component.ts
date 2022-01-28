import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee-array',
  templateUrl: './employee-array.component.html',
  styleUrls: ['./employee-array.component.css']
})
export class EmployeeArrayComponent implements OnInit {


  ngOnInit(): void {
  }
  employees : any = [{'id':100,'name':'praveen','salary':20000},{'id':100,'name':'naveen','salary':40000},{'id':499,'name':'seema','salary':101010}];
}
