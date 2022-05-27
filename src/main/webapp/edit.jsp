<%@page import="it.prova.televisoreweb.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%Televisore televisore=(Televisore) request.getAttribute("televisoreDaInviareAPaginaUpdate");%>
	<form action="ExecuteUpdateTelevisoreServlet" method="post">
	
		<input type="hidden" name="idTelevisore" value="<%=televisore.getIdTelevisore()%>">
		
		<label for="marcaInputId">MARCA:</label><br>
		<input type="text" name="marcaInput" id="marcaInputId" value="<%= televisore.getMarca() %>">
		<br>
		<label for="modelloInputId">MODELLO:</label><br>
		<input type="text" name="modelloInput" id="modelloInputId" value="<%= televisore.getModello() %>">
		<br>
		<label for="prezzoInputId">PREZZO:</label><br>
		<input type="text" name="prezzoInput" id="prezzoInputId" value="<%= televisore.getPrezzo() %>">
		<br>
		<label for="polliciInputId">POLLICI:</label><br>
		<input type="text" name="polliciInput" id="polliciInputId" value="<%= televisore.getNumeroPollici() %>">
		<br>
		<label for="codiceInputId">CODICE:</label><br>
		<input type="text" name="codiceInput" id="codiceInputId" value="<%= televisore.getCodice() %>">
		<br>
		<input type="submit" value="CONFERMA">
	</form>

</body>
</html>