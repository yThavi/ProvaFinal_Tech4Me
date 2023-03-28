package br.com.tech4burguer.hamburgueria.shared;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;


public class HamburguerCompletoDto {
  private String id;
  @NotEmpty(message="Campo sabor deve ser informado")
  @NotBlank(message="Tem que informar os caracteres")
  private String sabor;
  private List<String> ingredientes;
  @Positive(message="Valor deve ser informado")
  private Double valor;
  
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
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
 
}
