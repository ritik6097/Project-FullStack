import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Register } from './register-user/Register';

@Injectable({
  providedIn: 'root'
})

export class UserServiceService {
private baseurl="http://localhost:8082/myprofile";
  constructor(private httpclient:HttpClient) { }
  createUser(register:Register):Observable<any>{
    return this.httpclient.post(`${this.baseurl}/save`,register);
  }
}
