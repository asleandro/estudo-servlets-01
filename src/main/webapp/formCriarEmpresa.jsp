<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/empresaCriada" var="linkServletEmpresaCriada"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="${linkServletEmpresaCriada }" method="post">
	
	Nome: <input type="text" name="nome"/>
	Data: <input type="text" name="data"/>	
	<input type="submit">
	
	</form>

</body>
</html>