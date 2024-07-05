package edu.elton.basics;

public class TernaryOperator {
  public static void main(String[] args) {
    int a, b;
    a = 5;
    b = 5;
    // Primitive type
    boolean result = a == b ? true : false; // Ternary Operator (compare ? if true : else)
    // Object type
    Boolean result2 = a != b ? true : false; // Ternary Operator (compare ? if true : else)
    System.out.println(result);
    System.out.println(result2);
  }
}
