export class Employe
{

    id:number;
    name:string;
    dob:Date;
    address:string;
    constructor(id:number,name:string,dob:Date,address:string)
    {
        this.id=id;
        this.name=name;
        this.dob=dob;
        this.address=address;
    }
}
let employe =new Employe(101,"Rohit",new Date(),"kerala");
console.log("Date of Birth :"+employe.dob);
console.log(employe);