import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  checkchat = localStorage.getItem("user-email");
  constructor() { }

  ngOnInit(): void {
  }

}
