import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { UserDetails } from './getprofile/UserDetails';

@Injectable({
  providedIn: 'root'
})

export class UserdetailsService {
 // here provide your base url
 private baseurl="http://localhost:8082/myprofile/getprofile";
  constructor(private httpclient:HttpClient) { }
  
  showProfilebyemail(email:any): Observable<any>{
    return this.httpclient.get(`${this.baseurl}/rr011@gmail.com`);
  }
}
