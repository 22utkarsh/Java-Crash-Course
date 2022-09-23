var array = [];
var emp = {
    "name":"",
    "age":"",
    "city":""
};
document.getElementById("add").addEventListener("click",()=>{
    emp.name=document.getElementById("name").value;
    emp.age=document.getElementById("age").value;
    emp.city=document.getElementById("city").value;
    array.push(emp);
    alert("Data added Successfully");
    document.getElementById("name").value="";
    document.getElementById("age").value ="";
    document.getElementById("city").value="";
})
document.getElementById("disp").addEventListener("click",()=>{
    let s1 = "<table border='1'>";
    for(let i =0;i<array.length;i++){
        s1=s1+"<tr><td>"+array[i].name+"</td><td>"+array[i].age+"</td><td>"+array[i].city+"</td></tr>";
    }
    s1=s1+"</table>";
    document.getElementById("result").innerHTML=s1;
})