import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { StockService } from 'src/app/services/stock.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addstock',
  templateUrl: './addstock.component.html',
  styleUrls: ['./addstock.component.css']
})
export class AddstockComponent implements OnInit {

  addStockForm : FormGroup;
  constructor(private stockService:StockService,private formBuilder : FormBuilder,private router:Router) { }
  
  ngOnInit(){
    this.addStockForm =this.formBuilder.group({
      id:['',Validators.required],
      stockname:['',Validators.required],
      remarks:['',Validators.required]
  });
}
addStock()
  {
    this.stockService.saveStock(this.addStockForm.value).subscribe(data =>{
      console.log("stock Inserted Successfully"+data); });
      this.router.navigate(['/stockexchange']);
  }

}
