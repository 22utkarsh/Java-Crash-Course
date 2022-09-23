<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  int num1=0;
  if(request.getParameter("var1")!=null){
	  num1=Integer.parseInt(request.getParameter("var1"));
  }
%>
<h1>Mathematical Table that you need :</h1>

<form action="MathsTable.jsp">
   <p>Enter number: <input type="number" name="var1" value="<%=num1%>"></p>
 
   <input type="submit" value="Submit"><input type="reset" value="Reset">
</form>
<table border="2">

<%
 if(num1>0){
	 for(int i=1;i<11;i++){
			 
	 
%>
<tr><td><%=num1 %></td><td>*</td><td><%=i %></td><td>=</td><td><%=(num1*i)%></td></tr>
<%
	}
}
%>
</table>
</body>
</html>