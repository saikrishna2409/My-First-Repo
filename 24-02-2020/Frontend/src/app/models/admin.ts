export  class Admin{
    id: number;
    sector:string;
    companyname:string;
    ceo:string;
    bod:string;
    stockList:string;
    turnover: number;
    constructor(id: number, sector:string, companyname:string, ceo:string, bod:string, stockList:string, turnover: number){
        this.id=id;
        this.sector=sector;
        this.ceo=ceo;
        this.bod=bod;
        this.stockList=stockList;
        this.turnover=turnover;
        
    }
}