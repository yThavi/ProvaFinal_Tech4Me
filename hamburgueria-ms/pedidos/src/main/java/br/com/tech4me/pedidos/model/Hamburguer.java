package br.com.tech4me.pedidos.model;

import java.util.List;

public class Hamburguer {
  private String sabor;
  private List<String> ingredientes;

  public String getSabor() {
    return sabor;
  }
  public void setSabor(String sabor) {
    this.sabor = sabor;
  }
  public List<String> getIngredientes() {
    return ingredientes;
  }
  public void setIngredientes(List<String> ingredientes) {
    this.ingredientes = ingredientes;
  }

  
}
