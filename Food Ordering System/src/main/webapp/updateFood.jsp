<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="dao.foodItemDAO"%>
<%@page import="entities.foodItems"%>
<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<title>Food Information Form</title>
</head>
<body>
<%
	int id=Integer.parseInt(request.getParameter("id"));
	foodItems obj=new foodItemDAO().getFoodItem(id);
%>
	<h1>Food Information Form</h1>
	<form action="updateFood" method="post">
	
		<label for="food_name">Food Name:</label>
		<input type="text" name="fname" id="fname" value="<%=obj.getFname() %>" required><br>

		<label for="food_price">Price:</label>
		<input type="number" name="fprice" id="fprice"value="<%=obj.getFprice() %>"  required><br>

		<label for="food_qty">Quantity:</label>
		<input type="number" name="fquantity" id="fquantity" value="<%=obj.getFquantity() %>" required><br>

		<label for="food_description">Description:</label>
		<textarea name="description" id="description" required><%=obj.getDescription() %></textarea>
		
		<label for="food_imagepath">Image Path</label>
		<input type="text" name="imgpath" id="imgpath" value="<%=obj.getImgpath() %>" class="form-control" required>
		
		
		<label for="dropdown">Select a Category:</label>
 						 <select id="category" name="category">
   						 <option value="Burger" <%= obj.getCategory().equals("Burger") ? "selected" : "" %>>Burger </option>
    					 <option value="Pizza" <%= obj.getCategory().equals("Pizza") ? "selected" : "" %>>Pizza</option>
   						 <option value="Pasta" <%= obj.getCategory().equals("Pasta") ? "selected" : "" %>>Pasta</option>
   						 <option value="Fries" <%= obj.getCategory().equals("Fries") ? "selected" : "" %>>Fries</option>
   						 
 						 </select>

		<input type="hidden" name="id"  value="<%=obj.getId()%>"/>
		<input type="submit" value="Submit">
		 <button type="button" onclick="window.location.href='newFood.jsp'">Cancel</button>
		
	</form>
</body>
</html>
