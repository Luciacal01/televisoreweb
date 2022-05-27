package it.prova.televisoreweb.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.televisoreweb.model.Televisore;
import it.prova.televisoreweb.service.MyServiceFactory;

@WebServlet("/ExecuteInsertTelevisoreServlet")
public class ExecuteInsertTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String marcaInput= request.getParameter("marcaInput");
		String modelloInput= request.getParameter("modelloInput");
		Integer prezzo=  Integer.parseInt(request.getParameter("prezzoInput"));
		Integer pollici= Integer.parseInt(request.getParameter("polliciInput"));
		String codice= request.getParameter("codiceInput");
		
		Televisore risultato= new Televisore(marcaInput, modelloInput);
		risultato.setPrezzo(prezzo);
		risultato.setNumeroPollici(pollici);
		risultato.setCodice(codice);
		
		try {
			MyServiceFactory.getTelevisoreServiceInstance().inserisciNuovo(risultato);
			request.setAttribute("listTelevisoriAttributeMarca", MyServiceFactory.getTelevisoreServiceInstance().listaDiTuttiITelevisori());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher rd= request.getRequestDispatcher("results.jsp");
		rd.forward(request, response);
	}

}
