import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { CreateaccountComponent } from './createaccount/createaccount.component';
import { AdminloginComponent } from './admin/adminlogin/adminlogin.component';
import { AdminadddetailsComponent } from './admin/adminadddetails/adminadddetails.component';
import { AdmindocuploadComponent } from './admin/admindocupload/admindocupload.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { ViewusersComponent } from './admin/viewusers/viewusers.component';
import { HttpClient, HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { IpolistComponent } from './admin/ipolist/ipolist.component';
import { AdminhomeComponent } from './admin/adminhome/adminhome.component';
import { ListcompanyComponent } from './admin/listcompany/listcompany.component';
import { UpdatecompanyComponent } from './admin/updatecompany/updatecompany.component';
import { UpdateipoComponent } from './admin/updateipo/updateipo.component';
import { AddstockComponent } from './admin/addstock/addstock.component';
import { StockexchangeComponent } from './admin/stockexchange/stockexchange.component';
import { ViewipoComponent } from './admin/viewipo/viewipo.component';
import { UpdatestockComponent } from './admin/updatestock/updatestock.component';
import { UpdateuserComponent } from './admin/updateuser/updateuser.component';
import { UserloginComponent } from './user/userlogin/userlogin.component';
import { UserhomeComponent } from './user/userhome/userhome.component';
import { ComparesectorComponent } from './user/comparesector/comparesector.component';

import { SectorlistComponent } from './admin/sectorlist/sectorlist.component';
import { UpdatesectorComponent } from './admin/updatesector/updatesector.component';
import { SectorComponent } from './admin/sector/sector.component';
import { ActivateComponent } from './activate/activate.component';
import { StockpricelistComponent } from './admin/stockpricelist/stockpricelist.component';
import { StockpriceComponent } from './admin/stockprice/stockprice.component';
import { UpdatestockpriceComponent } from './admin/updatestockprice/updatestockprice.component';
 import { HighchartsChartComponent } from 'highcharts-angular';
import { ChartsComponent } from './charts/charts.component';
import { HttpinterceptorserviceService } from './services/http-interseptor.service';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { UserprofileComponent } from './userprofile/userprofile.component';
import { ComparechartsComponent } from './user/comparecompany/comparecompany.component';
import { UpdateprofileComponent } from './updateprofile/updateprofile.component';
import { ChangepasswordComponent } from './changepassword/changepassword.component';
import { CompareResultComponent } from './compare-result/compare-result.component';

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
    UpdatestockComponent,
    UserhomeComponent,
    ComparesectorComponent,
      SectorlistComponent,
      ComparechartsComponent,
    SectorComponent,
    UpdatesectorComponent,
    ActivateComponent,
    StockpricelistComponent,
    StockpriceComponent,
    UpdatestockpriceComponent,
  
     HighchartsChartComponent,
  
     ChartsComponent,
  
     LogoutComponent,
  
     UserprofileComponent,
  
     UpdateprofileComponent,
  
     ChangepasswordComponent,
  
     CompareResultComponent
    

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [{
    provide:HTTP_INTERCEPTORS,
    useClass:HttpinterceptorserviceService,
    multi : true
  }],
  bootstrap: [AppComponent]
})
export class AppModule { }
