import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Blog } from '../blog';
import { BlogService } from '../blog.service';

@Component({
  selector: 'app-blog',
  templateUrl: './blog.component.html',
  styleUrls: ['./blog.component.css']
})
export class BlogComponent implements OnInit {
   blog=new Blog()
  constructor(private bservice:BlogService,private router:Router) { }

  ngOnInit(): void {
  }
addBlog(){
  this.bservice.addBlogFromRemote(this.blog).subscribe(
    data=>{console.log("Login Success");
  
  },
    error=>{console.log("FAILED");
    
  }
  );
  this.router.navigateByUrl("showblogs")

}
}