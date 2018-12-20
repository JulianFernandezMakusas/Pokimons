<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pokimons</title>
</head>
<body>

<h1>Ingrese su Pokemon</h1>

<form action="ingresoPokemon.do" method="post">
	
	<label>Nombre: </label>
	<input type="text" nombre="nombre" placeholder="Nombre">
	<br><br>
	
	<label>Energia: </label>
	<input type="text" nombre="energia" placeholder="Energia">
	<br><br>

	<label>Tipo: </label>
	<input type="text" nombre="tipo" placeholder="Tipo">
	<br><br>
	
	<label>Ataque: </label>
	<input type="text" nombre="ataque" placeholder="Ataque">
	<br><br>

	<label>Defensa: </label>
	<input type="text" nombre = "defensa" placeholder = "defensa">	
	<br><br>
	
	<input type = "submit" value = "ENVIAR FORMULARIO">
	
</form>


</body>
</html>