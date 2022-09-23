<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "com.add.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  AddDto obj = new AddDto();
  if(request.getAttribute("msg")!=null){
	  obj=(AddDto) request.getAttribute("msg");
  }
%>
<form action="AddController" method="post">
   <p>Variable 1: <input type="number" name="var1" value="<%=obj.getNum1()%>"></p>
   <p>variable 2: <input type="number" name="var2" value="<%=obj.getNum2()%>"></p>
   <p>Result: <input type="number" name="var3" value="<%=obj.getNum3()%>"></p>
   <input type="submit" value="Submit"><input type="reset" value="Reset">
</form>

</body>
</html>