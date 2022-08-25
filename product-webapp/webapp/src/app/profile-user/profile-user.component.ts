import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProfileService } from '../profile.service';
import { User } from './User';

@Component({
  selector: 'app-profile-user',
  templateUrl: './profile-user.component.html',
  styleUrls: ['./profile-user.component.css']
})
export class ProfileUserComponent implements OnInit {
  // OBJECT OF THE required class
 user:User=new User();

  constructor(private route: Router,private profileservice:ProfileService) { }

  ngOnInit(): void {
  }
  
  saveProfile(){
  this.profileservice.updateProfile(this.user).subscribe(data=>{
    console.log(data);
     // alert the exception thrown by backend if there is any
     if(data.message){
      alert(data.message);
    }
    // or give a alert for successfully profile updation
    else{
      alert("successfully updated your details");
    }
  },
    
    error=>{console.log(error);});
  }

  profileupdate(){
    console.log(this.user);
    this.saveProfile();
    this.onsubmit();
  }

  onsubmit(){
    this.route.navigateByUrl("/")
  }
}
