import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, Subject } from 'rxjs';
import { catchError, tap, map } from 'rxjs/operators';
import { Tax } from './tax.model';
@Injectable({
  providedIn: 'root'
})


export class CaltaxService {

  baseUrl = "https://walletbooster.stackroute.io"
    url: string = this.baseUrl + "/tax-calculator-service/api/v1/GetTax";
    tax : Tax[]=[];
    
    constructor(private http: HttpClient) {}

    private refreshRequired =new Subject<void>();

    get RefreshRequired(){
      return this.refreshRequired;
    }
   
    getAllTax(): Observable<Tax []> {
      
      return this.http.get<Tax []>(this.url)
        .pipe(
          tap(data =>
            this.RefreshRequired.next()
          //console.log('All: ' + JSON.stringify(data)))
        ));
    }
    
  }

  
    
    
   
  
  
        
