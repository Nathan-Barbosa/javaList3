import java.util.Scanner;
import model.Paralelepipedo;

public class Exer4 {
  public static void main(String ...args){
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Informe A, B e C de um paralelepipedo: ");
    
    Double a = scan.nextDouble();
    Double b = scan.nextDouble();
    Double c = scan.nextDouble();
    scan.close();

    Paralelepipedo p1 = new Paralelepipedo(a,b,c);
    System.out.println(p1.calcDiagonal());
  }  
}
