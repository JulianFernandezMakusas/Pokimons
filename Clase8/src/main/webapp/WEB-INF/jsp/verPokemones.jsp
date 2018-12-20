<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>		
	
	<c:if test="${not empty listaPokemones}"></c:if>
	<div class = "container">
	<c:forEach var = "pokemon" items = "${listaPokemones}">
		<div class ="row">
			<h3>Nombre : ${pokemon.nombre}</h3>
			<p>Energia: ${pokemon.energia}</p>
			<p>Tipo: ${pokemon.tipo}</p>
			<p>Ataque: ${pokemon.ataque}</p>
			<p>Defensa: ${pokemon.defensa}</p>
			<p></p>
		</div>
	</c:forEach>
	</div>	
	<a href = "inicio">Volver al inicio</a>
</body>
</html>