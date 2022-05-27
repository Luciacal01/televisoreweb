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

@WebServlet("/ExecuteUpdateTelevisoreServlet")
public class ExecuteUpdateTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String marcaInput= request.getParameter("marcaInput");
		String modelloInput= request.getParameter("modelloInput");
		Integer prezzo=  Integer.parseInt(request.getParameter("prezzoInput"));
		Integer pollici= Integer.parseInt(request.getParameter("polliciInput"));
		String codice= request.getParameter("codiceInput");
		
		try {
			Televisore televisoreRecuperatoDaDb= MyServiceFactory.getTelevisoreServiceInstance().cercaTelevisorePerId(Long.parseLong(request.getParameter("idTelevisore")));
			televisoreRecuperatoDaDb.setMarca(marcaInput);
			televisoreRecuperatoDaDb.setModello(modelloInput);
			televisoreRecuperatoDaDb.setPrezzo(prezzo);
			televisoreRecuperatoDaDb.setNumeroPollici(pollici);
			televisoreRecuperatoDaDb.setCodice(codice);
			
			MyServiceFactory.getTelevisoreServiceInstance().aggiornaTelevisore(televisoreRecuperatoDaDb.getIdTelevisore());
			
			request.setAttribute("listTelevisoriAttributeMarca", MyServiceFactory.getTelevisoreServiceInstance().listaDiTuttiITelevisori());
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher rd= request.getRequestDispatcher("edit.jsp");
		rd.forward(request, response);
	}

}
