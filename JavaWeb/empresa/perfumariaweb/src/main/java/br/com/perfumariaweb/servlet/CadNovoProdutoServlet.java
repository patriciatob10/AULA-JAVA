package br.com.perfumariaweb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadNovoProdutoServlet
 */
@WebServlet("/cadNovoProduto")
public class CadNovoProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeProduto = request.getParameter("produto");
		String tipoProduto = request.getParameter("tipo");
		String marcaProduto = request.getParameter("marca");
		
		PrintWriter saida = response.getWriter();
		
		saida.println("<html>");
		saida.println("<body>");
		saida.println("<h1>Cadastrado com Sucesso</h1>");
		saida.println("<hr>");
		saida.println("Produto: " + nomeProduto );
		saida.println("Tipo: " + tipoProduto );
		saida.println("Marca: " + marcaProduto );
		
		saida.println("</body>");
	}

}
