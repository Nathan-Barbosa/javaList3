import java.util.Scanner;
import model.Massa;

public class Exer5 {
  public static void main(String ...args){
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Informe Massa inicial");
    
    float mInicial = scan.nextFloat();
    scan.close();

    Massa m1 = new Massa(mInicial); 
    m1.calcTempo();
    System.out.println("Massa inicial: " + m1.getmInicial() + "\nMassa final: " + m1.getmFinal() + "\nTempo necessário: " + m1.getTempo());
  }  
}
