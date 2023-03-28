package br.com.tech4me.pedidos.shared;

import br.com.tech4me.pedidos.model.Hamburguer;

    public class PedidoDto{

    private String nomeCliente;
    private String idHamburguer;
    private Double valor;
    private Hamburguer dadosHamburguer;

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
    public Hamburguer getDadosHamburguer() {
        return dadosHamburguer;
    }
    public void setDadosHamburguer(Hamburguer dadosHamburguer) {
        this.dadosHamburguer = dadosHamburguer;
    }
}
    
   