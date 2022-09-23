
document.getElementById("btn").addEventListener("click",()=>{
    let req = new XMLHttpRequest();
    req.onload = function(){
        document.getElementById("id1").innerHTML=this.responseText;
    }
    req.open('GET',"ajax2.html");
    req.send();
})