package br.com.perfumariaweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.perfumariaweb.servlet.PrintWriter;

/**
 * Servlet implementation class CadNovoPrecoServlet
 */
@WebServlet("/CadnovoPrecoServlet")
public class CadNovoPrecoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeProduto = request.getParameter("produto");
		String              = request.getParameter("telefone");
		String              = request.getParameter("email");
		
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
