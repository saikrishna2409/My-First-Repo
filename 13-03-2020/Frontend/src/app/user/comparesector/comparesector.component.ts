import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-comparesector',
  templateUrl: './comparesector.component.html',
  styleUrls: ['./comparesector.component.css']
})
export class ComparesectorComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit() {
    // this.router.navigate(['/charts']);
  }

}
