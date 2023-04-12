package model;


public class Amostra {
  private int codigoAmostra;
  private int conteudoCarbono;
  private int durezaRockwell;
  private int resistenciaTracao;
  

  public Amostra(int codigoAmostra, int conteudoCarbono, int durezaRockwell, int resistenciaTracao) {
    this.codigoAmostra = codigoAmostra;
    this.conteudoCarbono = conteudoCarbono;
    this.durezaRockwell = durezaRockwell;
    this.resistenciaTracao = resistenciaTracao;
  }

  public int informaGrau() {
    int grau = 0;
    boolean teste1 = false;
    boolean teste2 = false;
    boolean teste3 = false;

    if(conteudoCarbono < 7){
      teste1 = true;
    }
    if(durezaRockwell > 50){
      teste2 = true;
    }
    if(resistenciaTracao > 80000){
      teste3 = true;
    }

    if(teste1 && teste2 && teste3) {
      grau = 10;
    }else if(teste1 && teste2){
      grau = 9;
    }else if(teste1){
      grau = 8;
    }else{
      grau = 7;
    }
    return grau;
  }

}
