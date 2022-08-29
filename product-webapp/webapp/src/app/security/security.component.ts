import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { JwtClientService } from '../services/jwt-client.service';
import { Login } from './Login';

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

  constructor(private service: JwtClientService, private route: Router) { }

  ngOnInit(): void {

  }

  public getAccessToken(authReq: any) {

    let resp = this.service.generateToken(this.authReq);
    resp.subscribe((data) => {
      this.tkn = data
      console.log(this.tkn)
      localStorage.setItem("token", this.tkn)
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

    console.log(loginform.value.email);
    localStorage.setItem("user-email", loginform.value.email)
    this.getAccessToken(this.authReq)
    // this.route.navigateByUrl("/profile-user")
  }

}
