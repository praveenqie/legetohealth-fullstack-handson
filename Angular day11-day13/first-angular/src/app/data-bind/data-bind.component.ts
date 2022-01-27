import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-bind',
  templateUrl: './data-bind.component.html',
  styleUrls: ['./data-bind.component.css']
})
export class DataBindComponent {

  username = 'Alex';
  handleClick():void{
    this.username = 'Bruce';
  }

}

