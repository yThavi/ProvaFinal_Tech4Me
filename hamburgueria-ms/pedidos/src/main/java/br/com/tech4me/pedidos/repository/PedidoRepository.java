package br.com.tech4me.pedidos.repository;

import br.com.tech4me.pedidos.model.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PedidoRepository extends MongoRepository<Pedido,String>{
    
}
