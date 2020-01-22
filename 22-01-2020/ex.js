// // "use strict";  
// // var y = 89;       // It will not cause an error.  
// // example();  
// // function example() {  
  
// //     x = 89;   // It will cause an error  
// // }  
// var obj = [1,2,3];  
// for (let prop of obj) { 
//    console.log(prop); 
// }
// var disp = ()=>console.log("Hello World") 
// disp();
// var disp = x=>console.log("Hello World") 
// disp();
//hoist_function(); // TypeError: hoist_function() is not a function  
// var hoist_function() = function() { 
//    console.log("bar"); 
// };
// void function iife_void() { 
//     var msg = function () {console.log("hello world")}; 
//     msg(); 
//  }();
// void function iife_void() { 
//     var msg = function () {console.log("hello world")}; 
//     msg(); 
//  }();
// var person = { 
//     firstname:"Tom", 
//     lastname:"Hanks", 
//     func:function(){return "Hello!!"},    
//  }; 
 
//  console.log(person.firstname)   
//  console.log(person.lastname) 
//  console.log(person.func())
// var foo = 'bar' 
// var baz = { foo } 
// console.log(baz.foo)
// function Car() { 
//     this.make = "Ford" 
//     this.model = "F123" 
//  }  
//  var obj = new Car() 
//  console.log(obj.make) 
//  console.log(obj.model)
// var roles = { 
//     type: "Admin", 
//     displayType : function() {  
       
//        console.log(this.type); 
//     } 
//  }  

//  var super_role = Object.create(roles); 
//  super_role.displayType();  
//  var guest_role = Object.create(roles); 
//  guest_role.type = "Guest"; 
//  guest_role.displayType(); 
"use strict" 
var det = { name:"Tom", ID:"E1001" }; 
var copy = Object.assign({}, det); 
console.log(copy);  
for (let val in copy) { 
   console.log(copy[val]) 
}
var interval = Number.EPSILON 
console.log(interval)
var interval = Number.MAX_SAFE_INTEGER 
console.log(interval)
var interval = Number.MAX_VALUE; 
console.log(interval)
var val = Number.MIN_SAFE_INTEGER; 
console.log("Value of Number. MIN_SAFE_INTEGER: " + val ); 
var res = Number.isNaN(10); 
console.log(res);  
console.log(Number.parseInt("10")); 
console.log(Number.parseInt("10.23"));
var num1 = 1225.30 
var val = num1.toExponential(); 
console.log(val)
var num = new Number(10); 
console.log(num.toString()); 
console.log(num.toString(2)); 
console.log(num.toString(16));
