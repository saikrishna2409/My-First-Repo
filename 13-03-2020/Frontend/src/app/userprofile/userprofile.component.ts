import { Component, OnInit } from '@angular/core';
import { User } from '../models/user';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';
import { AuthService } from '../services/auth.service';

@Component({
  selector: 'app-userprofile',
  templateUrl: './userprofile.component.html',
  styleUrls: ['./userprofile.component.css']
})
export class UserprofileComponent implements OnInit {
  user:User;
  constructor(private router: Router, private service:UserService,authService:AuthService) { }
    ngOnInit() {
      const id = sessionStorage.getItem('userId');
      if(+id >0 ){
      this.service.getUserById(+id).subscribe(data =>{
        this.user=data;
      });
    }
    }
    updateUser(){
      this.router.navigate(['/updateprofile']);
    }
    updatePassword(){
      this.router.navigate(['/changepassword']);
    }
}
