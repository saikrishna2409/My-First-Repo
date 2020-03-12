import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Admin } from '../models/admin';
@Injectable({
  providedIn: 'root'
})
export class CompareserviceService {
private httpUrl = environment.host + 'company-service/company/';
  constructor(private httpClient : HttpClient) { }
  getAllCompany():Observable<Admin[]>{
    return this.httpClient.get<Admin[]>(this.httpUrl);
  }
}