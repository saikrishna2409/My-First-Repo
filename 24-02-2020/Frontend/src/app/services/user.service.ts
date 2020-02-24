import { Injectable, Inject } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { from, Observable } from 'rxjs';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  httpUrl="http://localhost:8080/users/";
  constructor(private httpClient:HttpClient,@Inject(HttpClient) private ht) {
    
  }
  getAllUsers(): Observable<User[]>{
    return this.httpClient.get<User[]>(this.httpUrl);
  }
  saveUser(user:User):Observable<User>{
    return this.ht.post(this.httpUrl,user);

  }
  deleteUser(id:number):Observable<User>{
    return this.ht.delete(this.httpUrl + id);
  }
  updateUserInfo(user:User):Observable<User>{
    return this.ht.put(this.httpUrl,user);
  }
  getUserById(id:number):Observable<User>{
    return this.ht.get(this.httpUrl + id);
  }
}
