package br.com.tech4burguer.hamburgueria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4burguer.hamburgueria.service.HamburguerService;
import br.com.tech4burguer.hamburgueria.shared.HamburguerCompletoDto;
import br.com.tech4burguer.hamburgueria.shared.HamburguerDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/cardapio")
public class HamburguerController {
  @Autowired
  private HamburguerService servico;
  

  @PostMapping
  public ResponseEntity<HamburguerCompletoDto> cadastrarHamburguer(@RequestBody @Valid HamburguerCompletoDto burguer){
    return new ResponseEntity<>(servico.cadastrar(burguer), HttpStatus.CREATED); 
  }

  @GetMapping
  public ResponseEntity<List<HamburguerCompletoDto>> obterCardapio() {
    return new ResponseEntity<>(servico.obterTodas(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<HamburguerDto> obterHamburguer(@PathVariable String id) {
    Optional<HamburguerDto> retorno = servico.obterPorId(id);

    if (retorno.isPresent()) {
      return new ResponseEntity<>(retorno.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> excluirHamburguer(@PathVariable String id){
    servico.excluirPorId(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @PutMapping("/{id}")
  public ResponseEntity<HamburguerCompletoDto> atualizarHamburguer(@PathVariable String id, @RequestBody HamburguerCompletoDto burguer){
    Optional<HamburguerCompletoDto> retorno = servico.atualizarPorId(id, burguer); 

    if (retorno.isPresent()) {
      return new ResponseEntity<>(retorno.get(), HttpStatus.ACCEPTED);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }
   
  }

  @GetMapping("/porta")
  public String obterPorta(@Value("${local.server.port}") String porta){
    return "A instância que respondeu a requisição está rodando na porta" + porta;
  }
  
}
