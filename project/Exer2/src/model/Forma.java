package model;

public class Forma {
  private float x;
  private float y;
  private float z;

  public Forma(float x, float y, float z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  public void verificaForma() {
    //o comprimento de cada lado é  menor que a soma dos comprimentos dos outros dois lados
    if(x < (y + z) || y < (z + x) || z < (x + y)){
      System.out.println("É um Triângulo!");

      if(x == z && x == y && y == z){
        System.out.println("É um Triângulo Equilátero");
      }else if((x == y && y != z) || (y == z && z != x) || (x == z && x != y)){
        System.out.println("É um Triângulo Isósceles");
      }else if(x != y && x != z && y != z){
        System.out.println("É um Triângulo escaleno");
      }
    }else{
      System.out.println("Não é um triângulo.");
    }
  }
}
