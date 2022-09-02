import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Register } from './register-user/Register';

@Injectable({
  providedIn: 'root'
})

export class UserServiceService {
// private baseurl="http://localhost:8080/user-service/myprofile/save";

private baseurl="https://walletbooster.stackroute.io/user-service/myprofile/save";

  constructor(private httpclient:HttpClient) { }
  createUser(register:Register):Observable<any>{
    return this.httpclient.post(`${this.baseurl}`,register);
  }
}
