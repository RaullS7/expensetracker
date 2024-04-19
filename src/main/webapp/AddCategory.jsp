<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Add Category</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <link rel="stylesheet" href="css/addcategory.css">
  <%@include file="SideBar.jsp" %>
</head>
<body>

<h1>Add Category</h1><br>
  <form action="categoryController" method="post">
    <label for="transaction">Type</label>
    <select id="transaction" name="type" required>
      <option value="Income">Income</option>
      <option value="Expense">Expense</option>
    </select>
    <input type="text" id="amount" name="name" min="0" required>
    <button type="submit">Submit</button>
  </form>
  <br><br>
  <div class="table-container">
  
  <table class="table table-striped ">
  <thead class="thead-dark">
  <h3>Income Category</h3>
    <tr>
      <th scope="col">#</th>
       <th><span class="hidden">id</span></th>
      <th scope="col">Name</th>
      <th scope="col">Actions</th>
     
    </tr>
  </thead>
  <tbody>
	<c:if test="${!empty categoryList}">
    <c:forEach items="${categoryList}" var="list" varStatus="loop">
      <tr>
      <td>${loop.index + 1}</td>
      <td><span class="hidden">${list.id}</span></td>
      <td><c:out value="${list.categoryName}"></c:out></td>
      <td>
      <a type="button" href="Controllers?actions=delete&id=${list.id}" class="btn btn-outline-danger" >Delete</a>
      </td>
      
    </tr>
   </c:forEach>
   </c:if>
  </tbody>
</table><br><br>

<h3>Expense Category</h3>
<table class="table table-striped ">
  <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th><span class="hidden">id</span></th>
      <th scope="col">Name</th>
      <th scope="col">Actions</th>

    </tr>
  </thead>
  <tbody>
  <c:if test="${!empty expenseList}">
    <c:forEach items="${expenseList}" var="exp" varStatus="loop">
    <tr>
     <td>${loop.index +1}</td>
     <td><span class="hidden">${list.id}</span></td>
     <td> <c:out value="${exp.categoryName}"></c:out> </td>
     <td>
      <a type="button" href="Controllers?actions=delete&id=${exp.id}" class="btn btn-outline-danger" >Delete</a>
     </td> 
    </tr>
    </c:forEach>
   </c:if>
  </tbody>
</table>
</div>
</body>
</html>
