package com.tarefas.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tarefas.repository.TarefasRepository;


@WebServlet("/processa-excluir-tarefa")
public class ProcessaExcluirTarefa extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	   //Recebe a descricao da tarefa que iremos excluir
		String descricaoAExcluir = req.getParameter("tarefa-excluir");
		
		//Executa a exsclusao da lista de tarefas
		TarefasRepository.excluirTarefa(descricaoAExcluir);
		
		//Redirecionar para a lista
		resp.sendRedirect("lista-tarefas.jsp");
		
	}
	
	
	
	
	
}
