import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Blog } from './blog';

@Injectable({
  providedIn: 'root'
})
export class BlogService {

  baseUrl = "https://walletbooster.stackroute.io"
  constructor(private http:HttpClient) { }

  public addBlogFromRemote(blog:Blog):Observable<any>{
     return this.http.post(this.baseUrl + "/Blog/users/post",blog);
  }

  public registerUserFromRemote(blog:Blog):Observable<any>{
    return this.http.post(this.baseUrl + "/Blog/register",blog);
 }
 public getblogdata():Observable<any>{
  return this.http.get(this.baseUrl + "/Blog/users/blog")
 }
 public deletebyid(id:any):Observable<any>{
  return this.http.delete(this.baseUrl + "/Blog/users/"+id)
 }
 setid(id:any){
  return localStorage.setItem('_ai',id)
 }
 getid(){
  return localStorage.getItem('_ai')
 }
 getblogbyid(id:any){
  return this.http.get(this.baseUrl + "/Blog/users/"+id)
 }

  
}

