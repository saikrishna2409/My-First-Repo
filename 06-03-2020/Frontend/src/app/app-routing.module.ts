import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { CreateaccountComponent } from './createaccount/createaccount.component';
import { UserloginComponent } from 'src/app/user/userlogin/userlogin.component';
import { AdminloginComponent } from './admin/adminlogin/adminlogin.component';
import { AdminadddetailsComponent } from './admin/adminadddetails/adminadddetails.component';
import { AdmindocuploadComponent } from './admin/admindocupload/admindocupload.component';
import { ViewusersComponent } from './admin/viewusers/viewusers.component';
import { UpdateuserComponent } from 'src/app/admin/updateuser/updateuser.component';
import { IpolistComponent } from './admin/ipolist/ipolist.component';
import { AdminhomeComponent } from './admin/adminhome/adminhome.component';
import { AddstockComponent } from './admin/addstock/addstock.component';
import { ListcompanyComponent } from './admin/listcompany/listcompany.component';
import { UpdatecompanyComponent } from './admin/updatecompany/updatecompany.component';
import { UpdateipoComponent } from './admin/updateipo/updateipo.component';
import { ViewipoComponent } from './admin/viewipo/viewipo.component';
import { UpdatestockComponent } from './admin/updatestock/updatestock.component';
import { StockexchangeComponent } from './admin/stockexchange/stockexchange.component';
import { UserhomeComponent } from './user/userhome/userhome.component';
import { ComparecompanyComponent } from './user/comparecompany/comparecompany.component';
import { ComparesectorComponent } from './user/comparesector/comparesector.component';
import { SectorComponent } from './admin/sector/sector.component';
import { SectorlistComponent } from './admin/sectorlist/sectorlist.component';
import { UpdatesectorComponent } from './admin/updatesector/updatesector.component';
import { ActivateComponent } from './activate/activate.component';
import { StockpriceComponent } from './admin/stockprice/stockprice.component';
import { StockpricelistComponent } from './admin/stockpricelist/stockpricelist.component';
import { UpdatestockpriceComponent } from './admin/updatestockprice/updatestockprice.component';


const routes: Routes = [
  
    { path:"", component:HomeComponent},
    { path:"login", component:LoginComponent},
    { path:"createaccount",component:CreateaccountComponent},
    { path:"userlogin",component:UserloginComponent},
    { path:"adminlogin",component:AdminloginComponent},
    { path:"adminadddetails",component:AdminadddetailsComponent},
    { path:"admindocupload",component:AdmindocuploadComponent},
    { path:"viewusers",component:ViewusersComponent},
    { path:"updateuser",component:UpdateuserComponent},
    { path:"ipolist",component:IpolistComponent},
    { path:"adminhome",component:AdminhomeComponent},
    { path:"addstock",component:AddstockComponent},
    { path:"listcompany",component:ListcompanyComponent},
    { path:"updatecompany",component:UpdatecompanyComponent},
    { path:"updateipo",component:UpdateipoComponent},
    { path:"updatestock",component:UpdatestockComponent},
    { path:"stockexchange",component:StockexchangeComponent},
    { path:"viewipo",component:ViewipoComponent},
    { path:"userhome",component:UserhomeComponent},
    {path:"comparecompany",component:ComparecompanyComponent},
    {path:"comparesector",component:ComparesectorComponent},
    {path:"sector",component:SectorComponent},
    {path:"sectorlist",component:SectorlistComponent},
    {path:"updatesector",component:UpdatesectorComponent},
    {path:"activate",component:ActivateComponent},
    {path:"stockprice",component:StockpriceComponent},
    {path:"stockpricelist",component:StockpricelistComponent},
    {path:"updatestockprice",component:UpdatestockpriceComponent},
    { path:"**", component:HomeComponent}
  
] ;

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
