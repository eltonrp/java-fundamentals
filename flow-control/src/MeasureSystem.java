public class MeasureSystem {
  public static void main(String[] args) {
    String shortening = "M";
    switch (shortening.toUpperCase()) {
      case "S":
        System.out.println("Small");
        break;
      case "M":
        System.out.println("Medium");
        break;
      case "L":
        System.out.println("Large");
        break;
      default:
        System.out.println("Undefined");
        break;
    }
  }
}
