package edu.elton.basics;

public class TerminalArgs {
  public static void main(String[] args) {
    // O Java permite executar, pelo método main, Argumentos via linha de comando
    //passados como parâmetros da seguinte forma
    //**java NomeDaClasse argumento1 argumento2**
    //O comando deve ser digitado no terminal dentro pa pasta bin e sem digitar .class
    //Os tipos devem ser respeitados, caso contrário uma excessão será lançada
    //Caso a classe esteja dentro de pacotes, esses também devem ser passados. EX:
    //java edu.elton.basics.TerminalArgs arg0 arg1 arg2 arg3
    String nome = args [0];
    String sobrenome = args [1];
    int idade = Integer.valueOf(args[2]);
    double altura = Double.valueOf(args[3]);

    System.out.println("Olá! Meu nome é: " + nome + " " + sobrenome);
    System.out.println("Tenho " + idade + " anos");
    System.out.println(altura + " de altura");
  }
}
