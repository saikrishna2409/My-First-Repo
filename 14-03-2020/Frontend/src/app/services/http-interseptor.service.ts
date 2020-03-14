import { Injectable } from '@angular/core';
import { AuthService } from './auth.service';
import { HttpResponse, HttpHandler, HttpInterceptor, HttpRequest } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HttpinterceptorserviceService implements HttpInterceptor {
  constructor(public auth : AuthService) { }
  intercept(request : HttpRequest<any> , next: HttpHandler){
    console.log("Inside interceptor");
    if(this.auth.getAuthenticationToken()){
      let authenticationToken = this.auth.getAuthenticationToken();
      request= request.clone({
        setHeaders : {
          Authorization : authenticationToken
        }
      });
    }
    return next.handle(request);
  }
}

