<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

<div class="container" style="margin-top:50px;">
<h2 class="text-center mb-12"> Enter the Student Information</h2><br>
<f:form method="POST" modelAttribute="student">
<table class="table table-striped table-bordered">
  <tbody>
    <tr>
      <td><label id="fullname">Full Name</label></td>
      <td><f:input path="name" class="form-control"  /></td>
    </tr>
 	<tr>
      <td><label id="dateofbirth">Date of Birth</label></td>
      <td><f:input path="date" class="form-control" type="date"/></td>
    </tr>
     <tr>
       <td><label id="gender">Gender</label></td>
       <td>
      	  <label id="male">Male</label>
         <f:radiobutton path="gender"  value="male" /> <br>
      	<label id="female">Female</label>
      	<f:radiobutton path="gender"  value="female"/></td>
    </tr>
     <tr>
      <td><label id="hobbies">Hobbies</label></td>
      <td>
      <div class="form-check">
      	  <f:checkbox  class="form-check-input ml-2"  path="hobbies" value="cricket" for="cricket" />
      	  <label id="cricket">Cricket</label> <br>
      </div>
      <div class="form-check">
          <f:checkbox class="form-check-input ml-2" path="hobbies" value="basketball"/> 
          <label id="basketball">Basketball</label><br>
       </div>
       <div class="form-check">
        <f:checkbox class="form-check-input ml-2"  path="hobbies" value="volleyball"/><label id="volleyball">Volleyball</label><br>
       </div>
       <div class="form-check">
        <f:checkbox class="form-check-input ml-2"  path="hobbies" value="hockey"/> 
        <label id="hockey">Hockey</label>
       </div>
      	 
      	</td>
    </tr>
     <tr>
      <td><label id="fullname">City</label></td>
      <td>
      	<f:select class="form-control" path="city">
      		<f:option value="Kathmandu">Kathmandu</f:option>
      		<f:option value="Pokhara">Pokhara</f:option>
      		<f:option value="Bhaktapur">Bhaktapur</f:option>
      	</f:select>
      </td>
    </tr>
  </tbody>
</table>
<input type="submit" class="btn btn-primary" value="Submit">
</f:form>
</div>
</body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</html>