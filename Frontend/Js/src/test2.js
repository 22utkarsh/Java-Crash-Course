let array1 = [10,20,30];

class Addition{
    a =10;
    b=20;
    add=()=>(this.a+this.b);

    add1=(x,y)=>(x+y);

    setData =(a,b)=>{
        this.a=a;
        this.b=b;
    }
}
export {array1,Addition}