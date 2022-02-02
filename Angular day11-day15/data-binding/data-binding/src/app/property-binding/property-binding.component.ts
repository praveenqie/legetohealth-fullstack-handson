import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {

  username : string = 'Prashanth';
  toggebutton :boolean = false;

  handleClick(n:string):void{
    this.username = n;
    this.toggebutton = !this.toggebutton;
  }


  ngOnInit(): void {
  }

}
