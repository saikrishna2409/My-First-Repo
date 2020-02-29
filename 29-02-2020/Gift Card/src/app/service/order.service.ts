import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Order } from '../models/order';
import{ HttpClient} from '@angular/common/http'


@Injectable({
  providedIn: 'root'
})
export class OrderService {

  httpUrl="http://localhost:3000/orders/";
  constructor(private httpClient:HttpClient) { }
  getAllOrders(): Observable<Order[]>{
    return this.httpClient.get<Order[]>(this.httpUrl);
  }
  saveOrder(order:Order):Observable<Order>{
    return this.httpClient.post<Order>(this.httpUrl,order);
  }
}
