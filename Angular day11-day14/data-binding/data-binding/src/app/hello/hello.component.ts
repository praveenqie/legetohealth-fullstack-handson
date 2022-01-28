import { Component, OnInit } from '@angular/core';
import { Data } from '@angular/router';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css']
})
export class HelloComponent  {

  employeeName :string="praveen";
  salary :number =200000;
  age : number = 26;
  dob : Date = new Date(1996,1,8);
  phones : any = ["iphone","samsung","RealME"];
  status :boolean = true;
}
