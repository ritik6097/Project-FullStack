import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProfileService } from '../profile.service';
import { User } from './User';
import { MatSnackBar } from '@angular/material/snack-bar';
@Component({
  selector: 'app-profile-user',
  templateUrl: './profile-user.component.html',
  styleUrls: ['./profile-user.component.css']
})
export class ProfileUserComponent implements OnInit {
  // OBJECT OF THE required class
 user:User=new User();

  constructor(private route: Router,private profileservice:ProfileService,private snack:MatSnackBar) { }

  ngOnInit(): void {
  
   let getlocalemail=localStorage.getItem('user-email');
   console.log(getlocalemail);
   console.log("this got from locastorage");
}
  saveProfile(){
  this.profileservice.updateProfile(this.user).subscribe(data=>{
    console.log(data);
     // alert the exception thrown by backend if there is any
     if(data.message){
this.snack.open(data.message, "Remove", {
  duration:4000,
  horizontalPosition:'center',
  verticalPosition:'top'
  
});
     // alert(data.message);
    }
    // or give a alert for successfully profile updation
    else{
  this.snack.open("successfully updated your details","Remove", {
    duration:4000,
    horizontalPosition:'center',
    verticalPosition:'top'
    
  })
     // alert("successfully updated your details");
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
