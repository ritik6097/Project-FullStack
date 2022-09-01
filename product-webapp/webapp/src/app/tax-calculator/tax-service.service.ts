import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './user.model';

@Injectable({
  providedIn: 'root'
})
export class TaxServiceService {

  constructor(private http:HttpClient) { }

  public saveNew(user:User){
    console.log(user);
    return this.http.post("http://localhost:8080/api/v1/TaxCalculated",user, {responseType: 'text' as 'json'});
  }

  


}
