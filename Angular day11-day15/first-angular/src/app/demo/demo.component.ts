import { Component } from '@angular/core'; 

@Component({
    selector: 'demo-app',
    templateUrl: './demo.component.html'
})
export class DemoComponent {
    username : string = 'Alex';
    dob : Date = new Date(1999, 10, 25);
}