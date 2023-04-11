package model;

public class Produto {
  private int codigo;
  private int qnt;
  private Double valorUnitario;
  private int formaPagamento;

  //Constructor
  public Produto (int codigo, int qnt, Double valorUnitario, int formaPagamento) {
    this.codigo = codigo;
    this.qnt = qnt;
    this.valorUnitario = valorUnitario;
    this.formaPagamento = formaPagamento;
  }

  
  //Getters and setters
  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public int getQnt() {
    return qnt;
  }

  public void setQnt(int qnt) {
    this.qnt = qnt;
  }

  public Double getValorUnitario() {
    return valorUnitario;
  }

  public void setValorUnitario(Double valorUnitario) {
    this.valorUnitario = valorUnitario;
  }

  public int getFormaPagamento() {
    return formaPagamento;
  }

  public void setFormaPagamento(int formaPagamento) {
    this.formaPagamento = formaPagamento;
  }

  public void conta () {
    Double desconto = 0.0, total = 0.0;
    
    if(formaPagamento == 1) {
      desconto = (this.qnt * this.valorUnitario ) * 0.1;
      total = (this.qnt * this.valorUnitario) - desconto;
    }

    System.out.printf("Desconto: R$%.2f\nTotal a pagar: R$%.2f", desconto, total);
  }
}
