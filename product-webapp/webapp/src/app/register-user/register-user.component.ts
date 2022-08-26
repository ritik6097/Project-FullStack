import { HttpClient } from '@angular/common/http';
import { Message } from '@angular/compiler/src/i18n/i18n_ast';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { UserServiceService } from '../user-service.service';
import { Register } from './Register';

@Component({
  selector: 'app-register-user',
  templateUrl: './register-user.component.html',
  styleUrls: ['./register-user.component.css']
})
export class RegisterUserComponent implements OnInit {
  // OBJECT OF THE required class
register :Register=new Register();

  constructor(private userService:UserServiceService,private route:Router) { }

  ngOnInit(): void {
  }

  saveUser()
{
  this.userService.createUser(this.register).subscribe(data=>{

     console.log(data);
     // alert the exception thrown by backend if there is any
     if(data.message){
  alert(data.message);
}
// or give a alert for successfully registration
else{
  alert("successfully registered");
}
// alert("successfully registered");
  },error=>{console.log(error)});
}
  registeruser(){
    console.log(this.register);
    this.saveUser();
    this.onsubmit();
  }
  
  onsubmit(){
    this.route.navigateByUrl("/login")
  }
}
