import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class UsingTryCatch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    try {
      System.out.println("Insira o primeiro nome: ");
      String nome = sc.next();
      System.out.println("Insira o sobrenome: ");
      String sobrenome = sc.next();
      System.out.println("Insira sua idade: ");
      int idade = sc.nextInt();
      System.out.println("Insira sua altura: ");
      double altura = sc.nextDouble();
      sc.close();
  
      System.out.println("Nome: " + nome);
      System.out.println("Sobrenome: " + sobrenome);
      System.out.println("Idade: " + idade);
      System.out.println("Altura: " + altura);
    } catch(InputMismatchException e) {
      System.out.println("Erro do tipo: " + e.getClass().getSimpleName());
      System.out.println("Os parâmetros idade e altura precisam ser numéricos");
    }
  }
}
