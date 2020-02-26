import { Component, OnInit } from '@angular/core';
import { Validators, FormGroup, FormBuilder } from '@angular/forms';
import { IpoService } from 'src/app/services/ipo.service';
import { Router } from '@angular/router';
import { Ipo } from 'src/app/models/ipo';

@Component({
  selector: 'app-updateipo',
  templateUrl: './updateipo.component.html',
  styleUrls: ['./updateipo.component.css']
})
export class UpdateipoComponent implements OnInit {
  updateIpo:FormGroup;
  constructor(private formBuilder:FormBuilder,private ipoService:IpoService,private router:Router) { }

  ngOnInit() {
    this.updateIpo =this.formBuilder.group({
      id:['',Validators.required],
      company:['',Validators.required],
      stockexchange:['',Validators.required],
      priceshare:['',Validators.required],
      noofshares:['',[Validators.required]],
      address:['',Validators.required],
      city:['',Validators.required],
      state:['',Validators.required],
      pincode:['',Validators.required],
      date:['',Validators.required]
    });
    const id =localStorage.getItem('userId');
    if(+id>0)
    {
      this.ipoService.getIpoById(+id).subscribe(user =>
      {
        this.updateIpo.patchValue(user);
      });
    }
  }
  updateTheIpo(ipo:Ipo)
  {
    this.ipoService.updateIpoInfo(this.updateIpo.value).subscribe(u=>{
      this.router.navigate(['viewipo']);
    });
  }
}
