import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class JwtClientService {

  constructor(private http:HttpClient) { }

  // private sendEmailBaseUrl = "http://localhost:8085/sendEmail"
  baseUrl = "https://walletbooster.stackroute.io"

  public generateToken(request) {
    
    return this.http.post(this.baseUrl + "/authentication-service/authenticate", request,{responseType: "text" as "json"} )
  }

  public hello(token){
    let tokenStr = "Bearer "+ token;
    const headers = new HttpHeaders().set("Authorization", tokenStr)
    return this.http.get(this.baseUrl + "/authentication-service/", {headers, responseType:"text" as "json"})

  }
  // getlocalemail:string | null=localStorage.getItem('user-email');
  public sendEmail(email){

  // console.log('hii===================>>>>');
  // console.log("http://localhost:8085/login/" +email);
    return this.http.get(this.baseUrl + "/email-service/login/" +email)
   
  }
}
