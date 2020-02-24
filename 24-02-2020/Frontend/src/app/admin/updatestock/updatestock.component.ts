import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { StockService } from 'src/app/services/stock.service';
import { Router } from '@angular/router';
import { Stock } from 'src/app/models/Stock';

@Component({
  selector: 'app-updatestock',
  templateUrl: './updatestock.component.html',
  styleUrls: ['./updatestock.component.css']
})
export class UpdatestockComponent implements OnInit {

  updateStock:FormGroup;
  constructor(private formBuilder:FormBuilder,private stockService:StockService,private router:Router) { }

  ngOnInit() {
    this.updateStock =this.formBuilder.group({
      id:['',Validators.required],
      stockname:['',Validators.required],
      remarks:['',Validators.required]
    });
    const id =localStorage.getItem('stockId');
    if(+id>0)
    {
      this.stockService.getStockById(+id).subscribe(user =>
      {
        this.updateStock.patchValue(user);
      });
    }
  }
  updateTheStock()
  {
    this.stockService.updateStockInfo(this.updateStock.value).subscribe(u=>{
      this.router.navigate(['/stockexchange']);
    });
  }
  onsubmit(){
    console.log(this.updateStock.value);
  }

}
