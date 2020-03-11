import { Component, OnInit } from '@angular/core';
import { Stock } from 'src/app/models/Stock';
import { StockService } from 'src/app/services/stock.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-stockexchange',
  templateUrl: './stockexchange.component.html',
  styleUrls: ['./stockexchange.component.css']
})
export class StockexchangeComponent implements OnInit {

  stock:Stock[];

  constructor(private stockService:StockService,private router:Router) { }

  ngOnInit() {
  
  this.stockService.getAllStock().subscribe(data=>{
    this.stock=data;
  });
}
  deleteStock(stock:Stock) {
    this.stockService.deleteStock(stock.id).subscribe();
    this.stock=this.stock.filter(u => u !== stock);

    }
    updateStock(stock:Stock){
      localStorage.removeItem('');
      localStorage.setItem('stockId',stock.id.toString());
      this.router.navigate(['updatestock']);
  }


}
