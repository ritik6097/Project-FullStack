import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RegisterUserComponent } from './register-user/register-user.component';
import { ProfileUserComponent } from './profile-user/profile-user.component';
import { RecommendationComponent } from './recommendation/recommendation.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { SecurityComponent } from './security/security.component';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GetprofileComponent } from './getprofile/getprofile.component';
import { ProfsectionComponent } from './profsection/profsection.component';
import { BlogComponent } from './blog/blog.component';
import { ShowblogsComponent } from './showblogs/showblogs.component';
import { BlogprofileComponent } from './blogprofile/blogprofile.component';




@NgModule({
  declarations: [
    AppComponent,
    RegisterUserComponent,
    ProfileUserComponent,
    RecommendationComponent,
    NavbarComponent,
    FooterComponent,
    HomeComponent,
    AboutComponent,
    SecurityComponent,
    GetprofileComponent,
    ProfsectionComponent,
    BlogComponent,
    ShowblogsComponent,
    BlogprofileComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
  ],
  providers: [HttpClient,HttpClientModule],
  bootstrap: [AppComponent]
})
export class AppModule { }
