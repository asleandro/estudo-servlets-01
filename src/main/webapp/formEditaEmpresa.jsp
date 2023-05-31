<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/editarEmpresa" var="linkServletEditarEmpresa"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
	<form action="${linkServletEditarEmpresa}" method="post">
	
	<input type="hidden" name="id" value="${empresa.id }"/>
	Nome: <input type="text" name="nome" value="${empresa.getNome() }"/>
	Data: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>" size="10"/>
	<input type="submit">
	
	</form>
</body>
</html>