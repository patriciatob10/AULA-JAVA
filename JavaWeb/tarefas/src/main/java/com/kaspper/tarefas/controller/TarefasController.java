package com.kaspper.tarefas.controller;

import org.springframework.stereotype.Controller; abstract
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kaspper.tarefas.entity.Tarefa;

@Controller
public class TarefasController {
	
	@GetMapping("formulario")
	public String formulario() {
		
		return "form-tarefa";
	}
	
	@PostMapping("processa-nova-tarefa")
	public void processaNovaTarefa(Tarefa tarefa) {
		System.out.println(tarefa.getDescricao());
	}
	
	@GetMapping("tarefas")
	public String lista() {
		
		return "lista-tarefas";
	}

}
