import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProfileUserComponent } from './profile-user/profile-user.component';
import { RegisterUserComponent } from './register-user/register-user.component';
import { AboutComponent } from './about/about.component';
import { HomeComponent } from './home/home.component';
import { SecurityComponent } from './security/security.component';
import { RecommendationComponent } from './recommendation/recommendation.component';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'about',component:AboutComponent},
  {path:'profile-user',component:ProfileUserComponent},
  {path:'register-user',component:RegisterUserComponent},
  {path:'login', component:SecurityComponent},
  {path:'recommendation',component:RecommendationComponent}
];





@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule{}

