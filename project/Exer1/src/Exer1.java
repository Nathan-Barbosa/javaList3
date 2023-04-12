import java.util.Scanner;
import model.Produto;

public class Exer1 {
  public static void main(String ...args){
    //Exercicio 1
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Informe o codigo, a quantidade o valor unitario e a forma de pagamento: ");
      int codigo = scan.nextInt();
      int qnt = scan.nextInt();
      Double valorUnitario = scan.nextDouble();
      int formaPagamento = scan.nextInt();
      
      Produto p1 = new Produto(codigo, qnt, valorUnitario, formaPagamento);
      p1.conta();
    }
  }  
}
