import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './profile-user/User';

@Injectable({
  providedIn: 'root'
})
export class ProfileService {
 // getlocalemail:any;
 getlocalemail:string | null=localStorage.getItem('user-email');
  
   
  // here provide your base url
  private baseurl="http://localhost:8082/myprofile/update";
// here in costructor take private http client after importing httpmodule into your app.module.ts
  constructor(private httpclient:HttpClient) { }
// here create method the method that should be responsible for updating the profile
  updateProfile(user:User):Observable<any>{
   // this.getlocalemail=localStorage.getItem('local') ;
   // return this.httpclient.put(`${this.baseurl}/getlocalemail`,user);
  // console.log("http://localhost:8082/myprofile/update/" +this.getlocalemail);
   return this.httpclient.put("http://localhost:8082/myprofile/update/" +this.getlocalemail,user);

  }
}
