let a:any;
let b:number=10;
let c:string="typescript";
let d:boolean=true;
console.log(typeof(a));
console.log(typeof(b));
console.log(typeof(c));
console.log(typeof(d));

console.log(c.length);
a="hello";
console.log((<string>a).toUpperCase());

// let orderplaced:number=1;

enum orderstatus{orderplaced , orderprocess , orderdeliver};
console.log(orderstatus.orderplaced);
console.log(typeof(orderstatus));

let arr:number[] = [10,20,30];
let student = {

}
console.log(typeof(arr));
console.log(typeof(student));