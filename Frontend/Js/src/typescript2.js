var a;
var b = 10;
var c = "typescript";
var d = true;
console.log(typeof (a));
console.log(typeof (b));
console.log(typeof (c));
console.log(typeof (d));
console.log(c.length);
a = "hello";
console.log(a.toUpperCase());
// let orderplaced:number=1;
var orderstatus;
(function (orderstatus) {
    orderstatus[orderstatus["orderplaced"] = 0] = "orderplaced";
    orderstatus[orderstatus["orderprocess"] = 1] = "orderprocess";
    orderstatus[orderstatus["orderdeliver"] = 2] = "orderdeliver";
})(orderstatus || (orderstatus = {}));
;
console.log(orderstatus.orderplaced);
console.log(typeof (orderstatus));
var arr = [10, 20, 30];
var student = {};
console.log(typeof (arr));
console.log(typeof (student));