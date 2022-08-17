import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { ThisReceiver } from '@angular/compiler';

@Component({
  selector: 'app-recommendation',
  templateUrl: './recommendation.component.html',
  styleUrls: ['./recommendation.component.css']
})
export class RecommendationComponent  {
  postData={
    "iphl": 0,
    "ipl": 0,
    "eds": 0,
    "ifds": 0,
    "nps": 25000,
    "ifd": 0,
    "dtc": 0,
    "iohl": 12000,
    "oi": 0,
    "ifs": 850000,
    "bd": 0,
    "md": 5000,
    "ioel": 7000,
    "rir": 0,
    "gti1":750000,
    "ded1":0,
    "tax1":30000,
    "gti2":750000,
    "ded2":0,
    "tax2":70000
    
  };

  url="http://localhost:5200/saveproduct";
  json;
  constructor(private http:HttpClient){
    this.http.post(this.url,this.postData).toPromise().then((data:any)=>{
      console.log(data);
      this.json=data;
      console.log(typeof(this.json));

      
    });

  }

}
