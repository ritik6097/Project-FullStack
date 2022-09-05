import { HttpClient } from '@angular/common/http';
import { Message } from '@angular/compiler/src/i18n/i18n_ast';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { UserServiceService } from '../user-service.service';
import { Register } from './Register';
import { MatSnackBar } from '@angular/material/snack-bar';
@Component({
  selector: 'app-register-user',
  templateUrl: './register-user.component.html',
  styleUrls: ['./register-user.component.css']
})
export class RegisterUserComponent implements OnInit {
  // OBJECT OF THE required class
register :Register=new Register();
   localemail:any="";



  constructor(private userService:UserServiceService,private route:Router, private snack:MatSnackBar) { }
 
  ngOnInit(): void {
  }

  saveUser()
{
  this.userService.createUser(this.register).subscribe(data=>{

     console.log(data);
     // alert the exception thrown by backend if there is any
     if(data.message){
 this.snack.open(data.message,"cancel", {
  duration:4000,
  horizontalPosition:'center',
  verticalPosition:'top'
  
});
  // alert(data.message);
}
// or give a alert for successfully registration
else{
  this.snack.open("user has been registered successfully", "cancel",{
    duration:4000,
    horizontalPosition:'center',
    verticalPosition:'top'
    
  });
 // alert("successfully registered");
}
// alert("successfully registered");
  },error=>{console.log(error)});
}
  registeruser(){
    console.log(this.register);
    this.saveUser();
    this.onsubmit();
 this.localemail=this.register.email;
// localStorage.setItem('local',this.localemail);
  }
  
  onsubmit(){
    this.route.navigateByUrl("/login")
    localStorage.setItem("register", "success")
  }
}
