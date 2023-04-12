package model;

public class Produto {

  private Double pontoX1;
  private Double pontoY1;
  private Double pontoX2;
  private Double pontoY2;

  public Produto(Double pontoX1, Double pontoY1, Double pontoX2, Double pontoY2) {
    this.pontoX1 = pontoX1;
    this.pontoY1 = pontoY1;
    this.pontoX2 = pontoX2;
    this.pontoY2 = pontoY2;
  }

  public Double calcDistancia() {
    Double d = 0.0;

    d = Math.sqrt(((pontoX2 - pontoX1) * (pontoX2 - pontoX1)) + ((pontoY2 - pontoY1) * (pontoY2 - pontoY1)));
    return d;
  }
}
