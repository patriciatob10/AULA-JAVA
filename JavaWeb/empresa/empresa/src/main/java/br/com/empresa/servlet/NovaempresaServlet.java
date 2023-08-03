package br.com.empresa.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet{
 
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nomeEmpresa = req.getParameter("empresa");
        String cnpjEmpresa = req.getParameter("cnpj");
        String emailEmpresa = req.getParameter("email");
        

        PrintWriter saida = resp.getWriter();
        saida.println("<html><body>");
        saida.println("<br>Empresa: " + nomeEmpresa);
        saida.println("<br>CNPJ: " + cnpjEmpresa);
        saida.println("<br>E-mail: " + emailEmpresa);
        
        saida.println("Empresa Cadastrada");
        saida.println("</html></body>");
        
        System.out.println("Cadastrado com Sucesso");
    }
}