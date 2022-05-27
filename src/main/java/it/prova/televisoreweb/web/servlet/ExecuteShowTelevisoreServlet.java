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
import it.prova.televisoreweb.service.televisore.TelevisoreService;

@WebServlet("/ExecuteShowTelevisoreServlet")
public class ExecuteShowTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ExecuteShowTelevisoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parametroIdDelTelevisoreDiCuiVoglioIlDettaglio = request.getParameter("idDaInviareComeParametro");

		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();

		Televisore result = null;

		try {
			result = televisoreServiceInstance.cercaTelevisorePerId((long) Integer.parseInt(parametroIdDelTelevisoreDiCuiVoglioIlDettaglio));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.setAttribute("televisoreDaInviareAPaginaDettaglio", result);

		RequestDispatcher rd = request.getRequestDispatcher("dettaglio.jsp");
		rd.forward(request, response);
	}

}
