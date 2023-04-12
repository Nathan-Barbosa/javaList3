package model;

public class Massa {
  private float mInicial;
  private float mFinal;
  private int tempo;



  public Massa(float mInicial) {
    this.mInicial = mInicial;
  }

  public void calcTempo(){
    int cont = 0, tempoCalculado = 0;
    float massaAtual = mInicial;
    while(massaAtual > 0.5){
      massaAtual /= 2;
      cont++;
    }    
    tempoCalculado = cont * 50;
    this.mFinal = massaAtual;
    this.tempo = tempoCalculado;
  }  

  public float getmInicial() {
    return mInicial;
  }

  public float getmFinal() {
    return mFinal;
  }

  public int getTempo() {
    return tempo;
  }
  
  public void setmFinal(float mFinal) {
    this.mFinal = mFinal;
  }

  public void setTempo(int tempo) {
    this.tempo = tempo;
  }

}
