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
 baseUrl = "https://walletbooster.stackroute.io"
 private baseurl=this.baseUrl + "/user-service/myprofile/getprofile";
  constructor(private httpclient:HttpClient) { }
  
  showProfilebyemail(getlocalemail:any): Observable<any>{
    //return this.httpclient.get(`${this.baseurl}/rr011@gmail.com`);
    return this.httpclient.get(this.baseUrl + "/user-service/myprofile/getprofile/"+this.getlocalemail);
  }
}
