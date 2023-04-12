package model;
import java.lang.Math;

public class Paralelepipedo {
  private Double ladoA;
  private Double ladoB;
  private Double ladoC;

  public Paralelepipedo(Double ladoA, Double ladoB, Double ladoC) {
    this.ladoA = ladoA;
    this.ladoB = ladoB;
    this.ladoC = ladoC;
  }


  public Double calcDiagonal(){
    Double l = 0.0, d = 0.0;
    
    l = Math.sqrt((ladoA * ladoA) + (ladoB * ladoB));
    d = Math.sqrt((l * l) + (ladoC * ladoC));
    return d;
  }
}
