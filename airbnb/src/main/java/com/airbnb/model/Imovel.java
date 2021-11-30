package com.airbnb.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Imovel {
  private long id;
  private long idLocador;
  private String nome,tipo,cidade;
  private double preco;
  private boolean disponivel;
  
  
  
  
  
public long getIdLocador() {
	return idLocador;
}


public void setIdLocador(long idLocador) {
	this.idLocador = idLocador;
}


public Imovel(long id, String nome, String tipo, String cidade, double preco, boolean disponivel, long idLocador) {
	super();
	this.id = id;
	this.nome = nome;
	this.tipo = tipo;
	this.cidade = cidade;
	this.preco = preco;
	this.disponivel = disponivel;
	this.idLocador = idLocador;
}


public Imovel() {

}




public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public boolean isDisponivel() {
	return disponivel;
}
public void setDisponivel(boolean disponivel) {
	this.disponivel = disponivel;
}
  
  
}
