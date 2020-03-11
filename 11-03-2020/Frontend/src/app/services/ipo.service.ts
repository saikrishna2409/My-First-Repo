import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Ipo } from '../models/ipo';

@Injectable({
  providedIn: 'root'
})
export class IpoService {

  httpUrl="http://localhost:8002/ipos/";
  httpUrl1="http://localhost:8002/ipo-by-company/";
  constructor(private httpClient:HttpClient,@Inject(HttpClient) private ht){}
  getAllIpo(): Observable<Ipo[]>{
    return this.httpClient.get<Ipo[]>(this.httpUrl);
  }
  saveIpo(ipo:Ipo):Observable<Ipo>{
    return this.httpClient.post<Ipo>(this.httpUrl,ipo);

  }
  deleteIpo(id:number):Observable<Ipo>{
    return this.ht.delete(this.httpUrl + id);
  }
  updateIpoInfo(ipo:Ipo):Observable<Ipo>{
    return this.ht.put(this.httpUrl,ipo);
  }
  getIpoById(id:number):Observable<Ipo>{
    return this.ht.get(this.httpUrl + id);
  }
  getCompany(id :number){
    return this.ht.get(this.httpUrl1 + id);
  }
}
