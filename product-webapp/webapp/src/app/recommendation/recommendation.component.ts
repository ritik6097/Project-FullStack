import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { ThisReceiver } from '@angular/compiler';
import { Model } from '../model';
import { Observable } from 'rxjs';
import { RecoService } from '../reco.service';
import { CaltaxService } from '../caltax.service';
import { Tax } from '../tax.model';

@Component({
  selector: 'app-recommendation',
  templateUrl: './recommendation.component.html',
  styleUrls: ['./recommendation.component.css']
})
export class RecommendationComponent  {
  advices : Model[]= [];
  taxes : Tax[]=[];

  final : string[] = [];
  json;
  
  mydata;
  mydata1;
  constructor(private recoservice: RecoService , private caltax: CaltaxService){
    
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

      // this.http.get('http://localhost:8098/tax-calculator-service/api/v1/GetTax').toPromise().then(
      // data=>{
        
        
      //   for(let key in data){
      //     if(data.hasOwnProperty(key)){
      //       this.advices.push(data[key]);
      //       this.json1 = this.advices[0];
      //       console.log(this.json1);    

      //     }
      //   }
      // });
  }
  
  ngOnInit(){
  
    this.recoservice.RefreshRequired.subscribe(response=>
      this.recoservice.getAllAlbums());
    
    this.recoservice.getAllAlbums().subscribe({
      next: advice=>{
        this.advices=advice
      }
    })


    this.caltax.RefreshRequired.subscribe(response=>
      this.caltax.getAllTax());

    this.caltax.getAllTax().subscribe({
      next: tax=>{
        this.taxes=tax
      }
    })

  }



  
  
}
