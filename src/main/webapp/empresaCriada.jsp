<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nova empresa criada</title>
</head>
<body>
	<c:if test="${not empty empresa }">
		Empresa ${ empresa } criada, que delicia!
	</c:if>
	
	<c:if test="${empty empresa }">
		Nenhuma empresa cadastrada
		${empresa }
	</c:if>
	
</body>
</html>