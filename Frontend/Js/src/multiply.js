document.getElementById("b1").addEventListener("click",()=>{
    let a =parseInt(document.getElementById("num1").value);
    let b ="<table border='1'>";
    for(let i = 1; i<=10; i++){
        b=b+"<tr><td>"+a+"</td><td> *</td><td>"+i+"</td><td> =</td><td>"+(i*a)+"</td></tr>";
    }
    b=b+"</table>";
    
    document.getElementById("result").innerHTML = b;
})