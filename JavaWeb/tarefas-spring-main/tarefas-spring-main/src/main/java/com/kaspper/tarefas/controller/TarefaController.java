package com.kaspper.tarefas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kaspper.tarefas.entity.Tarefa;
import com.kaspper.tarefas.repository.TarefaRepository;

@Controller
public class TarefaController {
	
	//injeção de dependência
	@Autowired
	TarefaRepository tarefaRepository;

	@GetMapping("formulario")
	public String formulario() {
		
		return "form-tarefa";
	}
	
	@PostMapping("processa-nova-tarefa")
	public String processaNovaTarefa(Tarefa tarefa) {
		tarefaRepository.save(tarefa);
		
		return "lista-tarefas";
	}
	
	@GetMapping("tarefas")
	public String lista() {
		
		return "lista-tarefas";
	}
	
}
