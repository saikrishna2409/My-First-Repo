import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators, FormBuilder } from '@angular/forms';
import { UserService } from '../services/user.service';
import { User } from '../models/user';

@Component({
  selector: 'app-createaccount',
  templateUrl: './createaccount.component.html',
  styleUrls: ['./createaccount.component.css']
})
export class CreateaccountComponent implements OnInit {
  user:User=new User();
  createAccount: FormGroup;
  constructor(private userService: UserService, private formBuilder: FormBuilder) { }
  addUser() {
    this.userService.saveUser(this.createAccount.value).subscribe(data => {

      if (data.res == 1) {
        alert("Successfully inserted");
      }
      else if (data.res == 0) {
        alert("Email already exists");
      }
      else {
        alert("Fatal error");
      }
    });
  }
  ngOnInit() {
    this.createAccount = this.formBuilder.group({
      id: ['', Validators.required],
      username: ['', Validators.required],
      password: ['', Validators.required],
      rpassword: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      mobile: ['', Validators.required]
    });
  }

  onSubmit(abcd) {
    //This is very simple, do not need to do anything
    console.log(this.createAccount);
    //  this.userService.reg().subscribe(dt =>{
    //   console.log("coming status::::" +dt.reg);
    // })
    this.user = new User();



    this.user.id = this.id.value;



    this.user.username = this.Username.value;



    this.user.email = this.Email.value;



    this.user.password = this.Password.value;
    this.user.rpassword = this.rPassword.value;


    this.user.mobile = this.Mobile.value;


    this.save();
  }

  get id() {



    return this.createAccount.get('id');



  }



  get Username() {



    return this.createAccount.get('username');



  }







  get Email() {



    return this.createAccount.get('email');



  }



  get Password() {
    return this.createAccount.get('password');
  }

  get rPassword() {
    return this.createAccount.get('rpassword');
  }

  get Mobile() {



    return this.createAccount.get('mobile');



  }

  save() {



    this.userService.saveUser1(this.user)
  
  
  
     .subscribe(data => console.log(data), error => console.log(error));
  
  
  
    this.user = new User();
  
  
  
    window.localStorage.removeItem("edit-username");
  
  
  
   }

  

}
