import { Component, OnInit } from '@angular/core';
import { BlogService } from '../blog.service';
import { Blog } from '../blog';
import { Router } from '@angular/router';

@Component({
  selector: 'app-blogprofile',
  templateUrl: './blogprofile.component.html',
  styleUrls: ['./blogprofile.component.css']
})
export class BlogprofileComponent implements OnInit {
  blogdata:any
  blogid:any
  blog:any={}

  constructor(private blogservice:BlogService ,private route:Router) { }

  ngOnInit(): void {
    this.blogid=this.blogservice.getid()
    setInterval(()=>{this.blogservice.getblogdata().subscribe(data=>{
      // console.log(data)
      this.blogdata=data
    })
   this.blogservice.getblogbyid(this.blogid).subscribe(data=>
    // {console.log(data)
   { this.blog=data})
    },1000)
  }

}
