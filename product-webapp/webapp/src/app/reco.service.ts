import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, tap, map } from 'rxjs/operators';
import { Model } from './model';
@Injectable({
  providedIn: 'root'
})


export class RecoService {
    url: string = 'http://localhost:5500/advices';
    
    constructor(private _http: HttpClient) {}
   
    getAllAlbums(): Observable<Model []> {
      
      return this._http.get<Model []>(this.url)
        .pipe(
          tap(data =>
          console.log('All: ' + JSON.stringify(data)))
        );
    }
  }
    
    
   
  
  
        
