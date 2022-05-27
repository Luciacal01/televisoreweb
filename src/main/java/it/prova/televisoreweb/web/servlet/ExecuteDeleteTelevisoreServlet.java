package it.prova.televisoreweb.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.televisoreweb.service.MyServiceFactory;

/**
 * Servlet implementation class ExecuteDeleteTelevisoreServlet
 */
@WebServlet("/ExecuteDeleteTelevisoreServlet")
public class ExecuteDeleteTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idTelevisore= request.getParameter("idTelevisore");
		try {
			MyServiceFactory.getTelevisoreServiceInstance().rimuoviTelevisore(Long.parseLong(idTelevisore));
			request.setAttribute("listTelevisoriAttributeMarca", MyServiceFactory.getTelevisoreServiceInstance().listaDiTuttiITelevisori());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher rd= request.getRequestDispatcher("results.jsp");
		rd.forward(request, response);
		
	}

}
