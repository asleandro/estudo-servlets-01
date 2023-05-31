<%@ page import="java.util.ArrayList"%>
<%@ page import="br.com.java.estudos.administrador.servlet.Empresa"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Empresas cadastradas nessa joça:
<ul>
	<c:forEach items="${empresas }" var="empresa">
		<li>
		${empresa.nome } - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
		<a href="/administrador/mostrarEmpresa?id=${empresa.id}">Editar</a>
		-
		<a href="/administrador/removeEmpresa?id=${empresa.id}">Remover</a>
		</li>
	</c:forEach>
</ul>
</body>
</html> 