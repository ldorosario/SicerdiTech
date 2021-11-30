package com.airbnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.airbnb.model.Imovel;

public interface RepositoryImovel extends JpaRepository<Imovel, Long>{

}
