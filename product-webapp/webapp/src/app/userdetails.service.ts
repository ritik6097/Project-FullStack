import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
//import { UserDetails } from './getprofile/UserDetails';

@Injectable({
  providedIn: 'root'
  
})

export class UserdetailsService {

  getlocalemail:string | null=localStorage.getItem('user-email');
  //localStorage.getItem('local') ;
 // here provide your base url
 private baseurl="http://localhost:8082/myprofile/getprofile";
  constructor(private httpclient:HttpClient) { }
  
  showProfilebyemail(getlocalemail:any): Observable<any>{
    //return this.httpclient.get(`${this.baseurl}/rr011@gmail.com`);
    return this.httpclient.get("http://localhost:8082/myprofile/getprofile/"+this.getlocalemail);
  }
}
