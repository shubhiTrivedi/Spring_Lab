<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="width:700px;height:600px;margin-left:89px;">

<form action="addProduct" method="post">

<label>Enter Product Id:</label>
<input type="text" name="productId" placeholder="Product Id"/>

<br>
<br>
<label>Enter Product Name:</label>
<input type="text" name="productName" placeholder="Product Name"/>
<br>
<br>
<label>Enter Product Price:</label>
<input type="text" name="productPrice" placeholder="Product Price"/>
<br>
<br>
<input type="submit" name="s" value="Add Product"/>

</form>
<p style="color:blue;background-color:yellow;">${msg }</p>
</div>


</body>
</html>