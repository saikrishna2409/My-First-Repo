class Hello{
    constructor(fname,lname,age)
    {
        this.fn=fname;
        this.ln=lname;
        this.a=age;
    }
    full_name()
    {
        return this.fn + ' '+this.ln;
    }
}

let hello =new Hello('Abin','Joshy',23);
console.log('Full Name : '+hello.full_name());