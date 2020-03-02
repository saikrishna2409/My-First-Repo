import { Component, OnInit } from '@angular/core';
import { IpoService } from 'src/app/services/ipo.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-ipolist',
  templateUrl: './ipolist.component.html',
  styleUrls: ['./ipolist.component.css']
})

export class IpolistComponent implements OnInit {
  registerIpo: FormGroup;
  constructor(private ipoService:IpoService,private formBuilder : FormBuilder,private router:Router) { }
  addIpo()
  {
    this.ipoService.saveIpo(this.registerIpo.value).subscribe(data =>{
      console.log("User Inserted Successfully"+data);
    this.router.navigate(['viewipo']) });

  }
  ngOnInit() {
    this.registerIpo =this.formBuilder.group({
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

}
}
