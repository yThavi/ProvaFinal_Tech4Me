package br.com.tech4burguer.hamburgueria.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4burguer.hamburgueria.model.Hamburguer;

public interface HamburguerRepository extends MongoRepository<Hamburguer, String> {
  
}
