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
	<%Televisore televisore=(Televisore) request.getAttribute("televisoreDaInviareAPaginaDettaglio"); %>
	<p>la marca del televisore �: <%=televisore.getMarca() %></p>
	<p> ed il modello �: <%=televisore.getModello() %></p>
	<p>, ha pezzo: <%=televisore.getPrezzo() %> </p>
	<p> e <%= televisore.getNumeroPollici() %> pollici</p>
	<p> <%=televisore.getCodice() %> questo � il suo codice.</p>
	<br>
	<a href="searchForm.jsp"> HOME</a>

</body>
</html>