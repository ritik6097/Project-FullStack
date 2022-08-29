import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { TaxServiceService } from './tax-service.service';

import { User } from './user.model';

@Component({
  selector: 'app-tax-calculator',
  templateUrl: './tax-calculator.component.html',
  styleUrls: ['./tax-calculator.component.css']
})
export class TaxCalculatorComponent implements OnInit {

  step: any=1;
  submitted: any=false;
  multistepObject: User =new User();
  message:any;
  multistep!: FormGroup;
  
        
  
  constructor(private route : Router,
              private service:TaxServiceService, private multistepForm: FormBuilder) {}

  

  ngOnInit(): void {
    this.multistep= new FormGroup({ 
        Year: new FormControl('',Validators.required),
        Age: new FormControl('',Validators.required),
    
      
        IFS: new FormControl('',[Validators.required]),
        IFI: new FormControl('',[Validators.required]),
        IPHL: new FormControl('',[Validators.required]),
        IPL: new FormControl('',[Validators.required]),
        EDS: new FormControl('',[Validators.required]),
        OI: new FormControl('',[Validators.required]),
        RI: new FormControl('',[Validators.required]),
        IDA: new FormControl('',[Validators.required]),
      
      
        BD: new FormControl('',[Validators.required]),
        MI: new FormControl('',[Validators.required]),
        IEL: new FormControl('',[Validators.required]),
        NPS: new FormControl('',[Validators.required]),
        IFD: new FormControl('',[Validators.required]),
        DTC: new FormControl('',[Validators.required]),
        IHL: new FormControl('',[Validators.required])
      })

    
  }
  
  // User object



  get userDetails(){
    return this.multistep.controls['multistep']['controls'];
  }

  // get taxDetails(){
  //   return this.multistep.controls['taxDetails']['controls'];
  // }

  // get deductionDetails(){
  //   return this.multistep.controls['deductionDetails']['controls'];
  // }
   
  submit(){
    this.submitted= true;
    this.step=this.step+1;
    // For User this.userDetails(page 1)

    // if(this.multistep.controls['userDetails'].invalid && this.step==1){
    //   return;
    // }

    // // For Tax Details(page 2)
    // if(this.multistep.controls['taxDetails'].invalid && this.step==2){
    //   return;
    // }

    // // For Deduction Details(page 3)

    // if(this.multistep.controls['deductionDetails'].invalid && this.step==3){
    //   return;
    // }
    
    // if(this.step==4){
    //   this.route.navigate(['Ritik Component'])
    // }
  }

  calculate(){
    // console.log(this.multistep.value)
    // console.log(this.multistep.value.taxDetails)
    // console.log(this.multistep.value.deductionDetails)
    this.multistepObject.ifs= this.multistep.value.IFS;
    this.multistepObject.ifi=this.multistep.value.IFI;
    this.multistepObject.iphl=this.multistep.value.IPHL;
    this.multistepObject.ipl=this.multistep.value.IPL;
    this.multistepObject.eds=this.multistep.value.EDS;
    this.multistepObject.oi=this.multistep.value.OI;
    this.multistepObject.ri=this.multistep.value.RI;
    this.multistepObject.ida=this.multistep.value.IDA;
    this.multistepObject.bd=this.multistep.value.BD;
    this.multistepObject.mi=this.multistep.value.MI;
    this.multistepObject.iel=this.multistep.value.IEL;
    this.multistepObject.nps=this.multistep.value.NPS;
    this.multistepObject.ifd=this.multistep.value.IFD;
    this.multistepObject.dtc=this.multistep.value.DTC;
    this.multistepObject.ihl=this.multistep.value.IHL;
    
    // console.log("multistepPbject", this.multistepObject);

    // For User this.userDetails(page 1)

    // if(this.multistep.controls['multistep'].invalid && this.step==1){
    //   return;
    // }

    // // For Tax Details(page 2)
    // if(this.multistep.controls['multistep'].invalid && this.step==2){
    //   return;
    // }

    // // For Deduction Details(page 3)

    // if(this.multistep.controls['multistep'].invalid && this.step==3){
    //   return;
    // }
    

    this.service.saveNew(this.multistepObject).subscribe((data)=>{
      console.log("Successfuly stored data", data);
    })



  }

  onSubmit(){
    this.route.navigateByUrl('/recommendation')
  }
    
  previous(){
    this.step=this.step-1;
   }
  

}
