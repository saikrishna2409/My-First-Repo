import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { CreateaccountComponent } from './createaccount/createaccount.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { AdminloginComponent } from './admin/adminlogin/adminlogin.component';
import { AdminadddetailsComponent } from './admin/adminadddetails/adminadddetails.component';
import { AdmindocuploadComponent } from './admin/admindocupload/admindocupload.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { ViewusersComponent } from './admin/viewusers/viewusers.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { UpdateuserComponent } from './updateuser/updateuser.component';
import { IpolistComponent } from './admin/ipolist/ipolist.component';
import { AdminhomeComponent } from './admin/adminhome/adminhome.component';
import { ListcompanyComponent } from './admin/listcompany/listcompany.component';
import { UpdatecompanyComponent } from './admin/updatecompany/updatecompany.component';
import { UpdateipoComponent } from './admin/updateipo/updateipo.component';
import { AddstockComponent } from './admin/addstock/addstock.component';

import { StockexchangeComponent } from './admin/stockexchange/stockexchange.component';
import { ViewipoComponent } from './admin/viewipo/viewipo.component';
import { UpdatestockComponent } from './admin/updatestock/updatestock.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    CreateaccountComponent,
    UserloginComponent,
    AdminloginComponent,
    AdminadddetailsComponent,
    AdmindocuploadComponent,
    ViewusersComponent,
    UpdateuserComponent,
    IpolistComponent,
    AdminhomeComponent,
    UpdatecompanyComponent,
    UpdateipoComponent,
    AddstockComponent,
    ListcompanyComponent,
    StockexchangeComponent,
    ViewipoComponent,
    UpdatestockComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
