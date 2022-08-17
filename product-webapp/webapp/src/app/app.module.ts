import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { HttpClient, HttpClientModule } from '@angular/common/http';
<<<<<<< HEAD
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
=======


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';






>>>>>>> 9d332aa44fc427bb32ebea4127b906e2cb21891d
import { RegisterUserComponent } from './register-user/register-user.component';
import { ProfileUserComponent } from './profile-user/profile-user.component';



import { RecommendationComponent } from './recommendation/recommendation.component';
<<<<<<< HEAD
=======


>>>>>>> 9d332aa44fc427bb32ebea4127b906e2cb21891d
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
<<<<<<< HEAD
import { SecurityComponent } from './security/security.component';

=======
>>>>>>> 9d332aa44fc427bb32ebea4127b906e2cb21891d


@NgModule({
  declarations: [
    AppComponent,
    RegisterUserComponent,
    ProfileUserComponent,
<<<<<<< HEAD
    RecommendationComponent,
    NavbarComponent,
    FooterComponent,
    HomeComponent,
    AboutComponent,
    SecurityComponent
=======


    RecommendationComponent,


    NavbarComponent,
    FooterComponent,
    HomeComponent,
    AboutComponent
  
>>>>>>> 9d332aa44fc427bb32ebea4127b906e2cb21891d

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,

    ReactiveFormsModule,
    HttpClientModule,

HttpClientModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
