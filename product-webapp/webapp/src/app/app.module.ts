import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
<<<<<<< HEAD
import { RegisterUserComponent } from './register-user/register-user.component';
import { ProfileUserComponent } from './profile-user/profile-user.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
=======
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
>>>>>>> ed66a76d4579e4074b2245460107282960625c0d

@NgModule({
  declarations: [
    AppComponent,
<<<<<<< HEAD
    RegisterUserComponent,
    ProfileUserComponent
=======
    NavbarComponent,
    FooterComponent,
    HomeComponent,
    AboutComponent
>>>>>>> ed66a76d4579e4074b2245460107282960625c0d
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
