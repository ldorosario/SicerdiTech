package com.airbnb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airbnb.model.Imovel;
import com.airbnb.model.Usuario;
import com.airbnb.repository.RepositoryImovel;

@Component
public class ImovelService {


	@Autowired
	RepositoryImovel repoImovel;
    UsuarioService userService;
    
	
	public List<Imovel> getAllImovel()
	{
		return repoImovel.findAll();
	}
	
	
	public String createImovel(Imovel imovel, Long id)
	{
		
		List<Imovel> listImovel = getAllImovel();
		
		Usuario id_usuario;
	
		if(userService.usuLogado.stream().anyMatch(Usuario -> Usuario.getId() == id))
				{
			      id_usuario = userService.usuLogado.stream().filter(Usuario -> Usuario.getId() == id).findFirst().get();
				}
		if(id_usuario.getLogado() == true && id_usuario.getTipo().equals(id_usuario).get) {}
		
	}
	
	
	
	
}
