import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { AdminService } from 'src/app/services/admin.service';
import { Router } from '@angular/router';
import { Admin } from 'src/app/models/admin';

@Component({
  selector: 'app-updatecompany',
  templateUrl: './updatecompany.component.html',
  styleUrls: ['./updatecompany.component.css']
})
export class UpdatecompanyComponent implements OnInit {
  updateAdmin:FormGroup;
  constructor(private formBuilder:FormBuilder,private adminService:AdminService,private router:Router) { }

  ngOnInit() {
    this.updateAdmin =this.formBuilder.group({
      id:['',Validators.required],
      sector:['',Validators.required],
      companyname:['',Validators.required],
      ceo:['',Validators.required],
      bod:['',Validators.required],
      stockList:['',Validators.required],
      turnover:['',Validators.required]
    });
    const id =localStorage.getItem('companyid');
    if(+id>0)
    {
      this.adminService.getAdminById(+id).subscribe(admin =>
      {
        this.updateAdmin.patchValue(admin);
      });
    }
  }

  updateTheUser(admin:Admin)
  {
    this.adminService.updateAdminInfo(this.updateAdmin.value).subscribe(u=>{
      this.router.navigate(['/listcompany']);
    });
  }
}
