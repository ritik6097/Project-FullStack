import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { ThisReceiver } from '@angular/compiler';
import { Model } from '../model';
import { Observable } from 'rxjs';
import { RecoService } from '../reco.service';

@Component({
  selector: 'app-recommendation',
  templateUrl: './recommendation.component.html',
  styleUrls: ['./recommendation.component.css']
})
export class RecommendationComponent  {
  advices : Model[]= [];
  final : string[] = [];
  json;
  json1;
  mydata;
  mydata1;
  constructor(private http : HttpClient, private recoservice: RecoService){
    
    // this.http.get('http://localhost:5500/advices').toPromise().then(
    //   data=>{
        
        
    //     for(let key in data){
    //       if(data.hasOwnProperty(key)){
    //         this.advices.push(data[key]);
    //         this.json = this.advices[0];
    //         // console.log(this.json);
            
            

    //       }
    //     }


       

    //   });

      this.http.get('http://localhost:8080/api/v1/GetTax').toPromise().then(
      data=>{
        
        
        for(let key in data){
          if(data.hasOwnProperty(key)){
            this.advices.push(data[key]);
            this.json1 = this.advices[0];
            console.log(this.json1);    

          }
        }
      });
  }
  
  ngOnInit(){
    this.recoservice.getAllAlbums().subscribe({
      next: advice=>{
        this.advices=advice
      }
    })
  }
  
}
