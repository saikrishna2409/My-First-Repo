"use strict";
exports.__esModule = true;
var Employe = /** @class */ (function () {
    function Employe(id, name, dob, address) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
    }
    return Employe;
}());
exports.Employe = Employe;
var employe = new Employe(101, "Rohit", new Date(), "kerala");
console.log("Date of Birth :" + employe.dob);
console.log(employe);
