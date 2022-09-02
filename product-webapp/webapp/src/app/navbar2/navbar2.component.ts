import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar2',
  templateUrl: './navbar2.component.html',
  styleUrls: ['./navbar2.component.css']
})
export class Navbar2Component implements OnInit {


  userNameOnNavBar2 = localStorage.getItem("user-email");

  constructor(private route: Router) { }

  ngOnInit(): void {
  }

  onLogout(){
    
    this.route.navigateByUrl("/");
    localStorage.clear();
  }

}
