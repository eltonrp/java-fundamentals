package edu.elton.debugging;

public class Main {
  public static void main(String[] args) {
    System.out.println("Iniciou método main");
    a();
    System.out.println("Finalizou método main");
  }
  static void a() {
    System.out.println("Iniciou método a");
    b();
    System.out.println("Finalizou método a");
  }
  static void b() {
    System.out.println("Iniciou método b");
    for(int i = 0; i <= 4; i++) System.out.println(i);
    c();
    System.out.println("Finalizou método b");
  }
  static void c() {
    System.out.println("Iniciou método c");
    Thread.dumpStack();
    System.out.println("finalizou método c");
  }
}
