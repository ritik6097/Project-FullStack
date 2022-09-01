import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { JwtClientService } from '../services/jwt-client.service';
import { Login } from './Login';
import { MatSnackBar } from '@angular/material/snack-bar';
@Component({
  selector: 'app-security',
  templateUrl: './security.component.html',
  styleUrls: ['./security.component.css']
})
export class SecurityComponent implements OnInit {

  login: Login = new Login();

  tkn;

  email!: String;
  password!: String;

  authReq: any = {
    "email": this.email,
    "password": this.password
  }

  constructor(private service: JwtClientService, private route: Router,private snack:MatSnackBar) { }

  ngOnInit(): void {

  }
  public sendEmailToUser(email){
    let setu=this.service.sendEmail(email);
    setu.subscribe(()=>{
      console.log("message from security.ts")
    });
  }

  public getAccessToken(authReq: any, logindata) {

    let resp = this.service.generateToken(this.authReq);
    resp.subscribe((data) => {
      this.tkn = data
      // console.log(this.tkn)
      localStorage.setItem("token", this.tkn)
      // localStorage.setItem("user-email", logindata.value.email)
      this.sendEmailToUser(localStorage.getItem('user-email'));
        // route to home or profile as per their frequency
      if(localStorage.getItem('user-email')==logindata.value.email)
      {
      this.route.navigateByUrl("/");
      }
      else{
        this.route.navigateByUrl("/profile-user");
        localStorage.setItem("user-email", logindata.value.email)
      }
      
    }, () => {
      this.snack.open("invalid Credentials","Remove")
     // alert("invalid Credentials")
    })

  }

  public LoginUser() {
    // console.log(loginform.email)
  }


  loginIntoApp(loginform) {

    this.authReq = {
      "email": loginform.value.email, 
      "password": loginform.value.password
    }

    this.getAccessToken(this.authReq, loginform)
    
  }


}
