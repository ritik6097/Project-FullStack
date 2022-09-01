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

import { ChatComponent } from './chat/chat.component';

import { TaxCalculatorComponent } from './tax-calculator/tax-calculator.component';
import { TaxServiceService } from './tax-calculator/tax-service.service';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatSnackBar, MatSnackBarModule} from '@angular/material/snack-bar';





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
    BlogprofileComponent,
    TaxCalculatorComponent,
    ChatComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatSnackBarModule
  ],
  providers: [TaxServiceService,HttpClient,HttpClientModule,MatSnackBar],
  bootstrap: [AppComponent]
})
export class AppModule { }
