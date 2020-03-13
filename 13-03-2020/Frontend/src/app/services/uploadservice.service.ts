import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UploadserviceService {
httpUrl = environment.host + "stock-price-service/stockprice/"
  constructor(private httpClient:HttpClient) { }
  uploadStocksSheet(formData:FormData):Observable<Object>{
    return this.httpClient.post<Object>(this.httpUrl+"uploadStockSheet/",formData)
  }
  getCompanyStockPricesBetween(companyCode: string, stockExchange: string, startDate: Date, endDate: Date): Observable<any[]> {
    let url = "companyStockPriceBetween/"+companyCode+"/"+stockExchange+"/"+startDate+"/"+endDate;
    return this.httpClient.get<any[]>(this.httpUrl+url);
  }
}
