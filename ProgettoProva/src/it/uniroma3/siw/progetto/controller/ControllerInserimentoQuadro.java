package it.uniroma3.siw.progetto.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerInserimentoProdotto
 */
@WebServlet("/admin/inserimentoProdotto.do")
public class ControllerInserimentoQuadro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerInserimentoQuadro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AzioneInserimentoQuadro azione = new AzioneInserimentoQuadro(request);
		String risultato = azione.esegui();
		String prossimaPagina = "/admin/inserimento.jsp";
		if(risultato.equals("Success")){
			prossimaPagina = "/admin/confermaInserimento.jsp";
		}
		ServletContext s = request.getServletContext();
		RequestDispatcher r = s.getRequestDispatcher(prossimaPagina);
		r.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}