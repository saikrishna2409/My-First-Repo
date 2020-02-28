import { Component, OnInit } from '@angular/core';
import { FormControl,FormGroup, Validators, FormBuilder} from '@angular/forms';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-createaccount',
  templateUrl: './createaccount.component.html',
  styleUrls: ['./createaccount.component.css']
})
export class CreateaccountComponent implements OnInit {

  createAccount : FormGroup;
  constructor(private userService:UserService,private formBuilder : FormBuilder) { }
  addUser()
  {
    this.userService.saveUser(this.createAccount.value).subscribe(data =>{
     
        if(data.res==1){
          alert("Successfully inserted");
        }
        else if(data.res==0){
          alert("Email already exists");
        }
        else{
          alert("Fatal error");
        }
      });
  }
  ngOnInit(){
    this.createAccount =this.formBuilder.group({
      id:['',Validators.required],
      username:['',Validators.required],
      password:['',Validators.required],
      rpassword:['',Validators.required],
      email:['',[Validators.required,Validators.email]],
      mobile:['',Validators.required]
  });
}

    onSubmit() {
      //This is very simple, do not need to do anything
       console.log(this.createAccount);
       this.userService.reg().subscribe(dt =>{
        console.log("coming status::::" +dt.reg);
      })
      }


}
