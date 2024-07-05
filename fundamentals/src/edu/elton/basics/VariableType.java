package edu.elton.basics;

public class VariableType {
  public static void main(String[] args) {
    int a, b;
    a = 5;
    b = 5;
    // Primitive type
    boolean result = a == b ? true : false; // Ternary Operator (compare ? if true : else)
    // Object type
    Boolean result2 = a == b ? true : false; // Ternary Operator (compare ? if true : else)
    // Converts to object and returns the type
    System.out.println(((Object) result).getClass().getSimpleName());
    // returns the type of the object
    System.out.println(result2.getClass().getSimpleName());
    // Converts to object and checks if it is the desired type
    System.out.println(((Object) a) instanceof Integer);
    System.out.println(((Object) b) instanceof String);
  }
}
