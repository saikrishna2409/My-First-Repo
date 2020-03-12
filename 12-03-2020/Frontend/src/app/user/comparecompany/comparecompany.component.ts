import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';
import { debounceTime } from 'rxjs/operators';
import { Router } from '@angular/router';
import {Observable} from 'rxjs';
import {map, startWith} from 'rxjs/operators';
import { CompareserviceService } from 'src/app/services/compareservice.service';
import { Admin } from 'src/app/models/admin';
@Component({
  selector: 'app-comparecompany',
  templateUrl: './comparecompany.component.html',
  styleUrls: ['./comparecompany.component.css']
})
export class ComparechartsComponent implements OnInit {
  compare:FormGroup;
  constructor(private service:CompareserviceService, private formBuilder:FormBuilder, private router:Router) { }
  company : Admin[];
  options: string[];
  i:number;
  myControl = new FormControl();
  filteredOptions: Observable<string[]>;
  compareCompany(){
    localStorage.removeItem("c1");
    localStorage.removeItem("c2");
    localStorage.setItem("c1",this.compare.value['c1']);
    localStorage.setItem("c2",this.compare.value['c2']);
    this.router.navigate(['/charts'])
  }
  ngOnInit() {
    this.service.getAllCompany().subscribe(data =>{
      this.company=data;
    });
    this.compare = this.formBuilder.group({
      c1:[''],
      c2:['']
    });
    // this.filteredOptions = this.myControl.valueChanges
    //   .pipe(
    //     startWith(''),
    //     map(value => this._filter(value))
    //   );
      
    this.compare.valueChanges.subscribe(result=>console.log(result));
    // this.company = this.compare
    // .get('c1')
    // .valueChanges
    // .pipe(
    //   debounceTime(300),
    //   switch(value => this.service.getAllCompany()({companyName:value},1))
    // );
  }
  onSubmit(){
    this.router.navigate(['/charts'],{
      queryParams:{
        formData : JSON.stringify(this.compare.value)
      }
    });
  }
  // private _filter(value: string): string[] {
  //   const filterValue = value.toLowerCase();
  //   for(this.i=0;this.i<this.company.length;this.i++){
  //     this.options[this.i]=this.company[this.i].companyName;
  //   }
  //   return this.options.filter(option => option.toLowerCase().includes(filterValue));
  // }
}