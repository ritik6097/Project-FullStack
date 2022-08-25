import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './profile-user/User';

@Injectable({
  providedIn: 'root'
})
export class ProfileService {
  // here provide your base url
  private baseurl="http://localhost:8082/myprofile";
// here in costructor take private http client after importing httpmodule into your app.module.ts
  constructor(private httpclient:HttpClient) { }
// here create method the method that should be responsible for updating the profile
  updateProfile(user:User):Observable<any>{
    return this.httpclient.put(`${this.baseurl}/update/rk011@gmail.com`,user)
  }
}
