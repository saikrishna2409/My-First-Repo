import { Component, OnInit } from '@angular/core';
import { Order } from '../models/order';
import { Router } from '@angular/router';
import { OrderService } from '../service/order.service';

@Component({
  selector: 'app-vieworder',
  templateUrl: './vieworder.component.html',
  styleUrls: ['./vieworder.component.css']
})
export class VieworderComponent implements OnInit {

  order:Order[];
  constructor(private orderService:OrderService,private router:Router) { }
  ngOnInit() {
  
  this.orderService.getAllOrders().subscribe(data=>{
    this.order=data;
  });
}

}
