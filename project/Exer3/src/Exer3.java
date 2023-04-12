import java.util.Scanner;
import model.Amostra;

public class Exer3 {
  public static void main(String ...args){
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Codigo, conteudo de carbono, dureza Rockwell e resistencia à tração: ");
    int codigo = scan.nextInt();
    int carbono = scan.nextInt();
    int dureza = scan.nextInt();
    int resistencia = scan.nextInt();
    scan.close();

    Amostra am1 = new Amostra(codigo, carbono, dureza, resistencia); 
    System.out.println(am1.informaGrau());
    
  }  
}
