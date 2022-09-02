import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './user.model';

@Injectable({
  providedIn: 'root'
})
export class TaxServiceService {

  baseUrl = "https://walletbooster.stackroute.io"
  // baseUrl="http://localhost:8080"
  
  constructor(private http:HttpClient) { }

  public saveNew(user:User){
    console.log(user);
    return this.http.post(this.baseUrl + "/tax-calculator-service/api/v1/TaxCalculated",user, {responseType: 'text' as 'json'});
  }

  


}
