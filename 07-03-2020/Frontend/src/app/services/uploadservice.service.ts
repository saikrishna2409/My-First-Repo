import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UploadserviceService {
httpUrl ="http://localhost:8005/stockPrices/"
  constructor(private httpClient:HttpClient) { }
  uploadStocksSheet(formData:FormData):Observable<Object>{
    return this.httpClient.post<Object>(this.httpUrl+"uploadStockSheet/",formData)
  }
}
