package com.kaspper.tarefas.entity;

import java.util.Date;

public class Tarefa {
	
	String descricao;
	Date data;
	Boolean urgente;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Boolean getUrgente() {
		return urgente;
	}
	public void setUrgente(Boolean urgente) {
		this.urgente = urgente;
	}
	
	

}
