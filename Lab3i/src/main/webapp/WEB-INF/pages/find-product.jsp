<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="width:700px;height:600px;margin-left:89px;">

 <form action="viewProduct" method="post">

<label>Enter Product Id:</label>
<input type="text" name="productId" placeholder="Product Id"/>

<br>
<br>
<input type="submit" name="s"  value="Show Product"/>
<br>
<br>


</form>
<p style="color:blue;background-color:yellow;">${msg }</p>
<form action="allProduct" method="post">
<input type="submit" name="s"  value="Show All Product"/>
</form>
</div>
</body>
</html>