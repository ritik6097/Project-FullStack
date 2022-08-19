import { Component, OnInit } from '@angular/core';
import { User } from './User';

@Component({
  selector: 'app-profile-user',
  templateUrl: './profile-user.component.html',
  styleUrls: ['./profile-user.component.css']
})
export class ProfileUserComponent implements OnInit {
 user:User=new User();
  constructor() { }

  ngOnInit(): void {
  }
  profileupdate(){
    console.log(this.user);
  }
}
