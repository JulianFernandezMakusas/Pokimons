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
${nombre}
<form action="ingresoPokemon.do" method="post">
	
	<label>Nombre: </label>
	<input type="text" name="nombre" placeholder="nombre">
	<br><br>
	
	<label>Energia: </label>
	<input type="text" name="energia" placeholder="energia">
	<br><br>

	<label>Tipo: </label>
	<input type="text" name="tipo" placeholder="tipo">
	<br><br>
	
	<label>Ataque: </label>
	<input type="text" name="ataque" placeholder="ataque">
	<br><br>

	<label>Defensa: </label>
	<input type="text" name = "defensa" placeholder = "defensa">	
	<br><br>
	
	<button action = "submit">Enviar</button>
	
</form>

</body>
</html>