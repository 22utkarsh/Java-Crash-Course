import  {array1 ,Addition}  from "./test2.js";

let a = 10;
var b = 20;
console.log(a);
console.log(b);
for(a =0 ; a<5 ; a++ ){
    console.log(a);
}
console.log(a);

function add(x,y){
    return x+y;
}
console.log("Add :"+add(2,3));

let add1 = function (x,y){
    return x+y;
}
console.log("Add1 = "+add1(4,5));


let add2 =(x,y)=>(x+y);
let add3 =(x,y)=>{
    let z = x+y;
    return z;
};

console.log("Add2 = "+add2(4,5));

console.log("Add3 = "+add3(4,5));



a="Hello World!";
console.log(a);
console.log(array1);

let obj = new Addition();

console.log(obj.add());
console.log(obj.add1(11,45));
obj.setData(200,300);
console.log(obj.add());