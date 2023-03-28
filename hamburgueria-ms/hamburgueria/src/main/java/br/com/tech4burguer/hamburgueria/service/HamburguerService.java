package br.com.tech4burguer.hamburgueria.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4burguer.hamburgueria.shared.HamburguerCompletoDto;
import br.com.tech4burguer.hamburgueria.shared.HamburguerDto;


public interface HamburguerService {
  List<HamburguerCompletoDto> obterTodas();
  Optional<HamburguerDto> obterPorId(String id);
  void excluirPorId(String id);
  HamburguerCompletoDto cadastrar(HamburguerCompletoDto dto);
  Optional<HamburguerCompletoDto> atualizarPorId(String id, HamburguerCompletoDto dto);
}
