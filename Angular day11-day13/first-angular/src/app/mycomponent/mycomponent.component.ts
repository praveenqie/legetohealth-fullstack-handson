import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mycomponent',
  templateUrl: './mycomponent.component.html',
  styleUrls: ['./mycomponent.component.css']
})

export class MycomponentComponent {
  name : string = 'Alex';
  salary: number = 35200;
  dob : Date = new Date(2000, 9, 15);
  fruits : any = ["Apple", "Grapes", "Orange"];
  status : boolean = true;
}




