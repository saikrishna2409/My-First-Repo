import { Injectable, Inject } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { from, Observable } from 'rxjs';
import { User } from '../models/user';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  httpUrl=environment.host + "user-service/users/";
  constructor(private httpClient:HttpClient,@Inject(HttpClient) private ht) {
    
  }
  getAllUsers(): Observable<User[]>{
    return this.httpClient.get<User[]>(this.httpUrl);
  }
  saveUser(user:User){
    return this.ht.post(this.httpUrl,user);

  }
  saveUser1(user:User){
    return this.ht.post(this.httpUrl,user);

  }
  deleteUser(id:number):Observable<User>{
    return this.ht.delete(this.httpUrl + id);
  }
  updateUserInfo(user:User):Observable<User>{
    return this.ht.put(this.httpUrl,user);
  }
 
  // regi(){
  //   return this.ht.get(`http://localhost:8080/regi`);
  // }
  
  getUserById(id:number):Observable<User>{
    return this.ht.get(this.httpUrl + id);
  }
  serviceActivation(obj){
    return this.ht.put(`http://localhost:8765/user-service/activate`,obj)
  }
  findByUsernameAndPassword(username: String,password: String): Observable<any> {
    return this.ht.get(this.httpUrl+'/findByUsernameAndPassword/'+username+'/'+password);
  }
  LoggedIn(){
    let user_id = localStorage.getItem('userId');
    if(user_id==null){
      return false;
    }else{
      return true;
    }
  }
  isActivated(user:User)
  {
    if(user.active == true){
      return true;
    }
  }
}
