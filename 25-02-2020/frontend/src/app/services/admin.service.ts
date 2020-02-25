import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Admin } from '../models/admin';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  httpUrl="http://localhost:8080/company/";
  constructor(private httpClient:HttpClient,@Inject(HttpClient) private ht) { }
  getAllAdmin(): Observable<Admin[]>{
    return this.httpClient.get<Admin[]>(this.httpUrl);
  }
  saveAdmin(admin:Admin):Observable<Admin>{
    return this.ht.post(this.httpUrl,admin);

  }
  deleteAdmin(id:number):Observable<Admin>{
    return this.ht.delete(this.httpUrl + id);
  }
  updateAdminInfo(admin:Admin):Observable<Admin>{
    return this.ht.put(this.httpUrl,admin);
  }
  getAdminById(id:number):Observable<Admin>{
    return this.ht.get(this.httpUrl + id);
  }
}
