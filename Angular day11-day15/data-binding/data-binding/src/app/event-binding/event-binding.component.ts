import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {

  userName = 'Arun';
  handleClick():void{
    this.userName='Abhinandan';
  };
  handleNames(v:string):void{
    this.userName=v;

  }

  ngOnInit(): void {
  }

}
