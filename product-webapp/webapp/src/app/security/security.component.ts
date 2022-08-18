import { Component, OnInit } from '@angular/core';
import { JwtClientService } from '../services/jwt-client.service';

@Component({
  selector: 'app-security',
  templateUrl: './security.component.html',
  styleUrls: ['./security.component.css']
})
export class SecurityComponent implements OnInit {

  authReq:any;

  constructor(private service:JwtClientService) { }

  ngOnInit(): void {
  }

  public getAccessToken(){

    

  }

}
