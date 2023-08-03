package br.com.perfumariaweb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadNovoClienteServlet
 */
@WebServlet("/cadNovoCliente")
public class CadNovoClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeCliente = request.getParameter("nome");
		String telefoneCliente = request.getParameter("telefone");
		String emailCliente = request.getParameter("email");
		
		PrintWriter saida = response.getWriter();
		
		saida.println("<html>");
		saida.println("<body>");
		saida.println("<h1>Cadastrado com Sucesso</h1>");
		saida.println("<hr>");
		saida.println("Cliente: " + nomeCliente );
		saida.println("Telefone: " + telefoneCliente );
		saida.println("Email: " + emailCliente );
		
		saida.println("</body>");
	}

}
