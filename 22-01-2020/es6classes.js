// 'use strict' 
// class Polygon { 
//    constructor(height, width) { 
//       this.h = height; 
//       this.w = width;
//    } 
//    test() { 
//       console.log("The height of the polygon: ", this.h) 
//       console.log("The width of the polygon: ",this. w) 
//    } 
// } 

// //creating an instance  
// var polyObj = new Polygon(10,20); 
// polyObj.test();     

// 'use strict' 
// class Shape { 
//    constructor(a) { 
//       this.Area = a
//    } 
// } 
// class Circle extends Shape { 
//    disp() { 
//       console.log("Area of the circle:  "+this.Area) 
//    } 
// } 
// var obj = new Circle(223); 
// obj.disp() 

// 'use strict' 
// class Root { 
//    test() { 
//       console.log("call from parent class") 
//    } 
// } 
// class Child extends Root {
    
// } 
// class Leaf extends Child{}   

// //indirectly inherits from Root by virtue of inheritance 
// var  obj = new Leaf();
// obj.test() 