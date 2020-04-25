<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Product Info</h1>
	
	<p>${product.productId } </p>
	<p>${product.productName }</p>
	<p>${product.productPrice}</p>

<div style="color:blue;background-color:yellow;">
<c:if test="${not empty products }">
<table style="border:2px;">
<tr><th>Product Id</th><th>Product Name</th><th>Product Price</th></tr>
<c:forEach items="${products}" var="product">
<tr><th>${product.productId }</th><th>${product.productName }</th><th>${product.productPrice }</th></tr>
</c:forEach>
</table>
</c:if>
</div>
</body>
</html>