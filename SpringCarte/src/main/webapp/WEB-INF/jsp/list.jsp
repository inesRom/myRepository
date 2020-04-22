<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="stag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>test - Carte List</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 60%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
</style>
</head>
<body style="background-color: #FFFFE0;">

<div style="margin-top:50px; margin-left:200px; height:50px;"><h2>Carte List</h2></div>
   <table style="margin-top: 0px;margin-left: 100px; ">
       <tr>
           <th>Valeur</th>
           <th>Couleur</th>
           <th></th>
           <th></th>
       </tr>
       <c:forEach items="${carList}" var="car">
       <tr>
           <td>${car.valeur}</td>
           <td>${car.couleur}</td>
         
       </tr>
       </c:forEach>
 </table>
</body>
</html>