import java.util.Scanner;
import model.Forma;

public class Exer2 {
  public static void main(String ...args){
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Informe x, y e z");
    float x = scan.nextFloat();
    float y = scan.nextFloat();
    float z = scan.nextFloat();
    scan.close();
    Forma f1 = new Forma(x, y, z);
    f1.verificaForma();
  }  
}
