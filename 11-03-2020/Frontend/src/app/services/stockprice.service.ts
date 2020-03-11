import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { StockPrice } from 'src/app/models/stockprice';

@Injectable({
  providedIn: 'root'
})
export class StockpriceService {
  httpUrl = 'http://localhost:8005/stockprice/';

  constructor(private httpClient : HttpClient,@Inject(HttpClient) private ht) { }
  getAllStockPrices() : Observable<StockPrice[]>{
    return this.httpClient.get<StockPrice[]>(this.httpUrl);
 
  }

  saveStockPrice(stockprice : StockPrice):Observable<StockPrice>{
    return this.httpClient.post<StockPrice>(this.httpUrl,stockprice);
  }
  deleteStockPrice(id : number):Observable<StockPrice> {
    return this.httpClient.delete<StockPrice>(this.httpUrl+id)
      }
      update(stockprice : StockPrice) :Observable<StockPrice>{
        return this.ht.put("http://localhost:9999/ipo/",stockprice);
      }
      getStockPriceById(id:number) : Observable<StockPrice>{
        return this.ht.get(`http://localhost:9999/ipo/${id}`);
      }
      isAdmin() : boolean{
        return true;
      }
}
