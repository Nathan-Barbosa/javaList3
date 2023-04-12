import java.util.Scanner;
import model.Produto;

public class Exer6 {
  public static void main(String ...args){
    Scanner scan = new Scanner(System.in);

    Double x1 = scan.nextDouble();
    Double x2 = scan.nextDouble();
    Double y1 = scan.nextDouble();
    Double y2 = scan.nextDouble();
    scan.close();

    Produto p1 = new Produto(x1, x2, y1, y2);
    System.out.println(p1.calcDistancia());
  }  
}
