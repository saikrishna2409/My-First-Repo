import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from 'src/app/services/user.service';
import { User } from 'src/app/models/user';

@Component({
  selector: 'app-updateuser',
  templateUrl: './updateuser.component.html',
  styleUrls: ['./updateuser.component.css']
})
export class UpdateuserComponent implements OnInit {
  updateUser:FormGroup;
  constructor(private formBuilder:FormBuilder,private userService:UserService,private router:Router) { }

  ngOnInit() {
    this.updateUser =this.formBuilder.group({
      id:['',Validators.required],
      username:['',Validators.required],
      password:['',Validators.required],
      rpassword:['',Validators.required],
      email:['',[Validators.required,Validators.email]],
      mobile:['',Validators.required]
    });
    const id =localStorage.getItem('userId');
    if(+id>0)
    {
      this.userService.getUserById(+id).subscribe(user =>
      {
        this.updateUser.patchValue(user);
      });
    }
  }
  updateTheUser(user:User)
  {
    this.userService.updateUserInfo(this.updateUser.value).subscribe(u=>{
      this.router.navigate(['viewusers']);
    });
  }
}
