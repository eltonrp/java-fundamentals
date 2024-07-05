import java.text.NumberFormat;
import java.text.ParseException;

public class ExceptionExemple {
  public static void main(String[] args) {
    Number valor = Double.valueOf("5.2");
    Number valor2;
    System.out.println(valor);
    try {
      valor2 = NumberFormat.getInstance().parse("a1.75");
      System.out.println(valor2);
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}
