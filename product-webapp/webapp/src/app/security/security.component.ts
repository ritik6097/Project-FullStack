import { Component, OnInit } from '@angular/core';
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
    "userName":"abcabc",
    "password":"abc123"
  }

  constructor(private service:JwtClientService) { }

  ngOnInit(): void {
    this.getAccessToken(this.authReq)
  }

  public getAccessToken(authReq: any){

    let resp = this.service.generateToken(authReq);
    resp.subscribe(data=>this.tkn=data)

  }

  public LoginUser(){

  }
}
