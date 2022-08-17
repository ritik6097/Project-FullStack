import { HttpClient } from '@angular/common/http';
import { Message } from '@angular/compiler/src/i18n/i18n_ast';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { UserServiceService } from '../user-service.service';
import { Register } from './Register';

@Component({
  selector: 'app-register-user',
  templateUrl: './register-user.component.html',
  styleUrls: ['./register-user.component.css']
})
export class RegisterUserComponent implements OnInit {
register :Register=new Register();
  constructor(private userService:UserServiceService) { }

  ngOnInit(): void {
  }
  saveUser()
{
  this.userService.createUser(this.register).subscribe(data=>{
console.log(data);
if(data.message){
  alert(data.message);
}
else{
  alert("successfully registered");
}
// alert("successfully registered");
  },error=>console.log(error));
}
  registeruser(){
    console.log(this.register);
    this.saveUser();
  }
}
