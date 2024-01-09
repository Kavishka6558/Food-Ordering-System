<%@page import="org.apache.catalina.connector.Response"%>
<%@page import="org.apache.catalina.startup.ClassLoaderFactory.Repository"%>
<%@page import="dao.foodItemDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int id=Integer.parseInt(request.getParameter("id"));
		boolean result=new foodItemDAO().delete(id);
		if(result){
			response.sendRedirect("newFood.jsp");
		}else{
			%>
			
			<script type="text/javascript">
				alert("Somthing went wrong!!!");
			</script>
			<%
			response.sendRedirect("newFood.jsp");
		}
	%>
</body>
</html>