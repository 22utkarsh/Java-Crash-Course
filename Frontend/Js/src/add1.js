
document.getElementById("b1").addEventListener("click",()=>{
    let a =parseInt(document.getElementById("num1").value);
    let b =parseInt(document.getElementById("num2").value);
    document.getElementById("result").innerHTML = (a+b);
})