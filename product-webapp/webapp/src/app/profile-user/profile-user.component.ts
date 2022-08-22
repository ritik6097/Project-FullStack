import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from './User';

@Component({
  selector: 'app-profile-user',
  templateUrl: './profile-user.component.html',
  styleUrls: ['./profile-user.component.css']
})
export class ProfileUserComponent implements OnInit {
 user:User=new User();
  constructor(private route: Router) { }

  ngOnInit(): void {
  }
  profileupdate(){
    console.log(this.user);
  }
  onsubmit(){
    this.route.navigateByUrl("/")
  }
}
