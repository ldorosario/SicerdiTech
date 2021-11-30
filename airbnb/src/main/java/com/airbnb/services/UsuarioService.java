package com.airbnb.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airbnb.model.Usuario;
import com.airbnb.repository.RepositoryUsuario;


@Component
public class UsuarioService {
  
  @Autowired
  RepositoryUsuario repoUsuario;
  
  static ArrayList<Usuario> usuLogado = new ArrayList<>(); 
  
  public List<Usuario> getAllusers()
  {
	  return repoUsuario.findAll();
  }

  
  public String createUser(Usuario user)
  {
	List<Usuario> listUsuarios = getAllusers();   
	
	if(listUsuarios.stream().allMatch(Usuario -> Usuario.getId() == user.getId()))
	{ 
		return "Usuario ja cadastrado.";	
	}
	else
	{
		 repoUsuario.save(user);
		 
		return "Usuario cadastrado com sucesso.";		
	}
	
  }
	
	  public String LoginUser(String user, String pass)
	  {
		List<Usuario> listUsuarios = getAllusers();   
		 // achou usuario, senha e logado false
		if(listUsuarios.stream().allMatch(Usuario -> Usuario.getSenha().equals(pass) && Usuario.getUser().equals(user) && Usuario.getLogado() == false))
		{
		   listUsuarios.stream().filter(Usuario -> Usuario.getSenha().equals(pass) && Usuario.getUser().equals(user)).findFirst().get().setLogado(true);
		   
		   usuLogado.add(listUsuarios.stream().filter(Usuario -> Usuario.getSenha().equals(pass) && Usuario.getUser().equals(user)).findFirst().get());
		   return "Usuario autenticado.";	
		   
		   
		}
		else
		{
			return "Não foi possivel realizar a autenticacao";		
		}
	
	
  }
	
	  public String LogoffUser(String user, String pass)
	  {
		List<Usuario> listUsuarios = getAllusers();   
		 // achou usuario, senha e logado true
		if(listUsuarios.stream().allMatch(Usuario -> Usuario.getSenha().equals(pass) && Usuario.getUser().equals(user) && Usuario.getLogado() == true))
		{
		   listUsuarios.stream().filter(Usuario -> Usuario.getSenha().equals(pass) && Usuario.getUser().equals(user)).findFirst().get().setLogado(false);
		   
		   usuLogado.remove(listUsuarios.stream().filter(Usuario -> Usuario.getSenha().equals(pass) && Usuario.getUser().equals(user)).findFirst().get());
		   
		   return "Desconectado com sucesso.";	
		}
		else
		{
			return "Não foi possivel desconectar";		
		}
	
		
		  }
	
}
