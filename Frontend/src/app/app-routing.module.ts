import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FindByNameComponent } from './find-by-name/find-by-name.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  { path: '', redirectTo:'home', pathMatch:'full' },
  { path: 'home', component: HomeComponent },
  { path: 'findByName', component: FindByNameComponent } 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
