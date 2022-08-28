import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { UserdetailsService } from '../userdetails.service';
import { UserDetails } from './UserDetails';

@Component({
  selector: 'app-getprofile',
  templateUrl: './getprofile.component.html',
  styleUrls: ['./getprofile.component.css']
})
export class GetprofileComponent implements OnInit {
  userdetails:UserDetails=new UserDetails();
 firstName ="";
 lastName=" " ;
 dob="";
 gender="";
 contactNumber="";
 email="";
 fullname="";
  constructor( private profileservice:UserdetailsService, private router:Router) { }

  ngOnInit(): void {
    this.userdetails=new UserDetails();
    let email="rr011@gmail.com";
     this.profileservice.showProfilebyemail(email).subscribe((data)=>{
     this.userdetails=data;
     console.log(this.userdetails);
     this.firstName=this.userdetails.firstName;
     this.lastName=this.userdetails.lastName;
     this.dob=this.userdetails.dob;
     this.contactNumber=this.userdetails.contactNumber;
     this.email=this.userdetails.email;
     this.gender=this.userdetails.gender;
     });
     
      
  }

  

 
}
