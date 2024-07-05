package edu.elton.basics;

public class FirstClasses {
  public static void main(String[] args) {
    String primeiroNome = "Jon";
    String segundoNome = "Snow";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
    int numero1 = 1;
    String numero2 = "2";
    System.out.println(numero1+numero2); 
  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
  }
}
