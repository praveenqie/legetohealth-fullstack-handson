import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent  {
  
  // <app-child [username] = 'data'>
  @Input()
  username = 'Bruce';
  // <app-child (eventCounter) = parentData = $event>
  // <app-child (eventCounter) = parentFunction($event)>
  @Output()
  eventCounter : EventEmitter<number> = new EventEmitter<number>();
  counter : number = 0;
  childCounter : number = 0;
  incrementCounter() {
    this.counter = this.counter + 1;
    this.childCounter++;
    this.eventCounter.emit(this.counter);
    this.counter = 0;
  }
}
