package br.com.empresa.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovoColaboradorServlet
 */
@WebServlet("/novoColaborador")
public class NovoColaboradorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nomeFuncionario = request.getParameter("func");
        String funcaoFuncionario = request.getParameter("funcao");
        String salarioFuncionario = request.getParameter("salario");
        
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("NOme: " + nomeFuncionario+ " - Funcão: "+funcaoFuncionario+ "- Salário: "+salarioFuncionario);
        out.println("</body>");
        out.println("</html>");
	}

}
