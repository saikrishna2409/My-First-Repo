/* var str = new String( "This is string" ); 
 console.log("str.constructor is:" + str.constructor)
 */
/*var uname = new String("Hello World") ;
console.log(uname) ;
console.log("Length "+uname.length)  ;
*/
/*function employee(id, name) { 
    this.id = id; 
    this.name = name; 
 } 
 var emp = new employee(123, "Smith"); 
 employee.prototype.email = "smith@abc.com"; 
 
 console.log("Employee 's Id: " + emp.id); 
 console.log("Employee's name: " + emp.name);
 console.log("Employee's Email ID: " + emp.email);
 */
/*var arr_names = new Array(4)  
for(var i = 0;i<arr_names.length;i++) { 
   arr_names[i] = i * 7 
   console.log(arr_names[i]) 
}*/
// function isBigEnough(element, index, array) { 
//     return (element >= 10); 
//  } 
//  var passed = [12, 5, 8, 130, 44].every(isBigEnough); 
//  console.log("Test Value : " + passed ); 
// function add(a, b = 2) { 
//     return a + b; 
//  } 
//  console.log(add(b=5))

// for(var i = 0;i<arr_names.length;i++) { 
//    arr_names[i] = i * 2 
//    console.log(arr_names[i]) 
// }
var arr= new Array(10) ;
for(let i=0;i<10;i++)
{
    arr[i]=Math.floor(Math.random()*100);
}
 
let div =arr.filter((x)=>x%2==0 && x%5==0);
console.log(div)
let inc =arr.map((x)=>parseInt(x*1.1));
console.log(inc);
var filter =()=>{
    for(let i of arr)
    {
        if(i%2==0&&i%5==0)
        console.log(i);
    }
}
filter();
var map =()=>{
    for(let i in arr)
    {
        arr[i]=Math.floor(arr[i]*1.1);
        console.log(i);
    }
}
map();