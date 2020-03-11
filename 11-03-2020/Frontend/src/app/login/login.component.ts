import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms'
import { UserService } from 'src/app/services/user.service';
import { User } from 'src/app/models/user';
import { Router } from '@angular/router';
declare var $:any;
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  users: User[];
  currentUser: User;
  message:String;
  //users : USERS;
  constructor(private service:UserService, private formBuilder: FormBuilder, private router:Router) { }
  ngOnInit() {
    this.loginForm = this.formBuilder.group({
      //id:['',Validators.required],
      username:['',Validators.required],
      password:['',Validators.required]
    });
    this.service.getAllUsers().subscribe(u => {
      this.users = u;
    });
  }
  isValid(){
    $('#myModal').modal('show');
    let admin_userName="admin";
    let admin_password="admin";
    let userName = this.loginForm.controls.username.value;
    let password = this.loginForm.controls.password.value;
    if((userName == admin_userName) && (password == admin_password)){
      this.router.navigate(['adminhome']);
    }else{
      if( this.login(userName, password)){
        if(this.service.isActivated(this.currentUser)){
          localStorage.removeItem('userId');
          localStorage.setItem('userId',this.currentUser.id.toString());
          this.router.navigate(['userhome']);
        }else{
          this.message="Please activate your account to login"
    
        } 
        }else{
          this.message="Invalid Username/password"
          this.loginForm.reset();
        }
      }
    }
    login(userName:string, password: string){
      for(let user of this.users ){
        if((userName == user.username) && (password == user.password)){
          this.currentUser= user;
          return true;
        }
      }
      return false;
    }
  onSubmit(){
    console.log(this.loginForm.value);
  }
 }
  