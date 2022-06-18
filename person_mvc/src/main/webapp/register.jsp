<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <form:form action="register" modelAttribute="p">
     <form:label path="name">name</form:label>
     <form:input path="name"/>
     <form:label path="age">Age</form:label>
     <form:input path="age"/>
     <form:label path="phone">Phone</form:label>
     <form:input path="phone"/>
     <form:button>Register</form:button>
     </form:form>
</body>
</html>