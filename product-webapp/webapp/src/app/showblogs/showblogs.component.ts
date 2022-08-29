import { Component, OnInit } from '@angular/core';
import { BlogService } from '../blog.service';
import { Router } from '@angular/router';
import { state } from '@angular/animations';



@Component({
  selector: 'app-showblogs',
  templateUrl: './showblogs.component.html',
  styleUrls: ['./showblogs.component.css']
})
export class ShowblogsComponent implements OnInit {
  blogdata:any

  constructor( private blogservice:BlogService,private route: Router) { }

  ngOnInit(): void {
    setInterval(()=>{this.blogservice.getblogdata().subscribe(data=>{
      // console.log(data)
      this.blogdata=data
    })

    },1000)
  }
  delete(value:any){
    console.log(value)
    this.blogservice.deletebyid(value).subscribe(data=>{
      console.log(data)
    })
  }
  onsubmit(value:any){
    this.blogservice.setid(value)
    this.route.navigateByUrl("/blogprofile")
  }
}
  
