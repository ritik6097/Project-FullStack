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

  login :Login=new Login();

  tkn;

  authReq:any={
    "email":"abc@gmail.com",
    "password":"abc123"
  }

  constructor(private service:JwtClientService,private route :Router) { }
 
  ngOnInit(): void {
    
  }

  public getAccessToken(authReq: any){

    let resp = this.service.generateToken(authReq);
    resp.subscribe(data=>this.tkn=data)

  }

  public LoginUser(){
  }
    onsubmit(){
      this.getAccessToken(this.authReq)
      console.log(this.tkn)
      this.route.navigateByUrl("/profile-user")
    }
  
}
