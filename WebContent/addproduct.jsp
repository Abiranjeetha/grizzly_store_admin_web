<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
#column1
{
float:left;
width:20%;
 border-style="solid";
 border-width: 5px;
}
#column2
{
float:left;
width:60%;
 border-style="solid";
 border-width: 5px;
}
#column3
{
float:left;
width:20%;
 border-style="solid";
 border-width: 5px;
}
#col2col1
{
float:left;
width:50%;
}
#col2col2
{
float:left;
width:50%;
padding-left:40px;
}
.tab
{
background-color: #f1f1f1;
border: none;
float: left;
color: black;
width: 33.33%;
height: 50px;
font-size: 25px;
text-align: left;
font-weight: 550;
}
.tab:hover
{
background-color: #777D7D;
}
</style>
</head>
<body>
<div style="background-color:#EAEDED;height:70px;">
<%@ include file="header.jsp" %>
</div>
<br/>
<br/>
<br/>
<div id="column1">
<form style="background-color:#EAEDED;">
<br/>
<center>
<h2>PROFILE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="editadmin.jsp"><input type="submit" value="EDIT" id="sub"></a></form></h2>
<br/>
</center>
<div align="center">
<br/>
<br/>
<img alt="not available" src="/grizzly-store-admin-web/add1.png" width=200>
<br/>
<br/>
<br/>
<br/>
<%=session.getAttribute("username") %>
<br/>
<br/>
<br/>
<h3>ID</h3>
<%=session.getAttribute("userid") %>
<br/>
<br/>
<br/>
<h3>Designation</h3>
<%=session.getAttribute("designation") %>
<br/>
<br/>
<br/>
<h3>Office</h3>
<%=session.getAttribute("office") %>
<br/>
<br/>
<br/>
</div>
</form>
</div>
<div id="column2" style="padding-left:50px;">
<div>
  <a href="/grizzly-store-admin-web/ListproductController"><input type="button" value="PRODUCT" class="tab"></a>
  <a href="#home"><input type="button" value="VENDOR" class="tab"></a>
  <a href="#home"><input type="button" value=" " class="tab"></a>
</div>
<br><br><br><br>
<br/>
<br/>
<div style="float:left;"><img alt="not available" src="/grizzly-store-admin-web/photo.png" width="550" height="550"></div>
<div style="float:center;">
<form align="left" action="/grizzly-store-admin-web/AddproductController" method="post">
<input type="text" placeholder="Enter Product ID" name="pid">
<br/>
<br/>
<select name="pcategory">
<option>Category</option>
<option value="Personal care">Personal care</option>
<option value="Laptops">Laptops</option>
<option value="Air suppliers">Air suppliers</option>
</select>
<br/>
<br/>
<input type="text" placeholder="Name" name="pname"><br/><br/>
<input type="text" placeholder="Description" name="pdescription"><br/><br/>
<input type="text" placeholder="Price" name="pprice"><br/><br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<input style="float:right" type="submit" value="Add" id="btn">
</form>
<br/>
<br/>
<form action="/grizzly-store-admin-web/ListproductController">
<input style="float:right"type="submit" value="Cancel" id="btn">
</form>
</div>
</body>
</html>