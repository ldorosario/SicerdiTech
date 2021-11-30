package com.airbnb.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
 
	
	@Id
	 private long id;
	 private String user;
	 private String senha;
	 private String tipo;
	 private boolean logado;
	 
   
	public Usuario(long id, String user, String senha, String tipo, boolean logado) {
		this.id = id;
		this.user = user;
		this.senha = senha;
		this.tipo = tipo;
		this.logado = logado;
	}
	
	public Usuario() {
		
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public boolean getLogado() {
		return logado;
	}

	public void setLogado(boolean logado) {
		this.logado = logado;
	}

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


}
