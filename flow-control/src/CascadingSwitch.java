public class CascadingSwitch {
  public static void main(String[] args) {
    String plan = "A";
    //This scheme of switch/case allows to choose a plan where all the benefits below will be selected
    switch (plan) {
      case "A":
        System.out.println("5 GB + Youtube");
      case "B":
        System.out.println("Whatsapp + Instagram");
      case "C":
        System.out.println("100 minutes call");
    }
  }
}
