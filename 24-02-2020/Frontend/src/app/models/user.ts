export  class User{
    id:number;
    username:string;
    password:string;
    rpassword:string;
    email:string;
    mobile:number;
    constructor(id:number,username:string,password:string,rpassword:string,email:string,mobile:number){

    this.id=id;
    this.username=username;
    this.password=password;
    this.rpassword=rpassword;
    this.email=email;
    this.mobile=mobile;
    }
}