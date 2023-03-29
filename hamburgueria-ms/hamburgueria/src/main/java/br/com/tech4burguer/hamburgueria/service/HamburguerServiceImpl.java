package br.com.tech4burguer.hamburgueria.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4burguer.hamburgueria.model.Hamburguer;
import br.com.tech4burguer.hamburgueria.repository.HamburguerRepository;
import br.com.tech4burguer.hamburgueria.shared.HamburguerCompletoDto;
import br.com.tech4burguer.hamburgueria.shared.HamburguerDto;

@Service
public class HamburguerServiceImpl implements HamburguerService {
  @Autowired
  private HamburguerRepository repositorio;

  @Override
  public List<HamburguerCompletoDto> obterTodas() {
    List<Hamburguer> burguer = repositorio.findAll();
    
    return burguer.stream()
                .map(p -> new ModelMapper().map(p, HamburguerCompletoDto.class))
                .collect(Collectors.toList());
  }

  @Override
  public Optional<HamburguerDto> obterPorId(String id) {
    Optional<Hamburguer> burguer  = repositorio.findById(id);

    if (burguer.isPresent()) {
      return Optional.of(new ModelMapper().map(burguer.get(), HamburguerDto.class));
    }
    return Optional.empty();
  }

  @Override
  public void excluirPorId(String id) {
    repositorio.deleteById(id);
  }

  @Override
  public HamburguerCompletoDto cadastrar(HamburguerCompletoDto dto) {
    Hamburguer burguer = new ModelMapper().map(dto, Hamburguer.class);
    repositorio.save(burguer);
    return new ModelMapper().map(burguer, HamburguerCompletoDto.class);  
  }

  @Override
  public Optional<HamburguerCompletoDto> atualizarPorId(String id, HamburguerCompletoDto dto) { 
    Optional<Hamburguer> retorno = repositorio.findById(id);

    if (retorno.isPresent()) {
      Hamburguer burguer = new ModelMapper().map(dto, Hamburguer.class);
      burguer.setId(id);
      repositorio.save(burguer);
      return Optional.of(new ModelMapper().map(burguer, HamburguerCompletoDto.class));
    } else {
      return Optional.empty();
    }
    
   
  }
  
}
