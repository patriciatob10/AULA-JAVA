package com.tarefas.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.tarefas.entity.Tarefa;

public class TarefasRepository {
	
	
	//Criando lista de tarefas	
	static public List<Tarefa> tarefas = new ArrayList<Tarefa>();

	
	static public void adicionarTarefa(Tarefa tarefa) {
		tarefas.add(tarefa);
	}
	
	static public void excluirTarefa(String descricao) {
		for(Tarefa tarefa: tarefas) {
			if(tarefa.descricao.equals(descricao)) {
				tarefas.remove(tarefa);
				
			}
		}
				
	}
				
}
