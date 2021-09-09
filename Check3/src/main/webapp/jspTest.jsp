<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css">
</head>
<body>
<%@include file = "header.jsp" %>
<div class = "jsp">
<table>
<tr>
<th>name</th>
<td><label><input type="text" name="username"></label></td>
</tr>
<tr>
<th>id</th>
<td><label><input type="text" name="userid"></label></td>
</tr>
</table>
</div>
<%@include file = "footer.jsp" %>
</body>
</html>
