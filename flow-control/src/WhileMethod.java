import java.util.concurrent.ThreadLocalRandom;

public class WhileMethod {
  public static void main(String[] args) {
    double mesada = 50.0;
    while(mesada > 0){
      double lanche = valorAleatorio();
      if(lanche > mesada){
        lanche = mesada;
      }
      System.out.println("Lanche adicionado ao carrinho: " + lanche);
      mesada = mesada - lanche;
    }
    System.out.println("Mesada: " + mesada);
  }
  //método que retorna um valor aleatório entre 2 e 8
  public static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(2, 15);
  }
}
