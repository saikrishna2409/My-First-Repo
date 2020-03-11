export class Ipo{
            id:number
            company:string;
            stockexchange:string;
            priceshare :number;
            noofshares :number;
            address :string;
            city :string;
            state :string;
            pincode :number;
            date :string;
            constructor(id:number,company:string,stockexchange:string,priceshare :number,noofshares :number,address :string,city :string,state :string,pincode :number,date :string)
            {
                this.id=id;
                this.company=company;
               this.stockexchange=stockexchange;
                this.priceshare =priceshare;
                this.noofshares =noofshares;
                this.address =address;
                this.city =city;
                this.state =state;
                this.pincode =pincode;
                this.date =date;
            }
}