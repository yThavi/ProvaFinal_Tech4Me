package br.com.tech4me.pedidos.shared;

import jakarta.validation.constraints.Positive;

public class PedidoCompletoDto {
    private String id;
    private String nomeCliente;
    private String idHamburguer;
    @Positive
    private Double valor;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getIdHamburguer() {
        return idHamburguer;
    }
    public void setIdHamburguer(String idHamburguer) {
        this.idHamburguer = idHamburguer;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
}
