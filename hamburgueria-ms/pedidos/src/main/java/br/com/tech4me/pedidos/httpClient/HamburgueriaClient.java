package br.com.tech4me.pedidos.httpClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.tech4me.pedidos.model.Hamburguer;

@FeignClient(name = "hamburgeria", fallback = HamburgueriaClientFallback.class)
public interface HamburgueriaClient{

    @RequestMapping(value="/cardapio/{id}", method=RequestMethod.GET)
    Hamburguer obterHamburguer ( @PathVariable String id);

 }

@Component
class HamburgueriaClientFallback implements HamburgueriaClient {
@Override
public Hamburguer obterHamburguer(String id) {
    return new Hamburguer();
}

}