package br.com.tech4burguer.hamburgueria.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("hamburgueria")
public class Hamburguer {
  @Id
  private String id;
  private String sabor;
  private List<String> ingredientes;
  private Double valor;

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
  public Double getValor() {
    return valor;
  }
  public void setValor(Double valor) {
    this.valor = valor;
  }
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  } 
}
