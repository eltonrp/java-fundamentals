public class Grades {
  public static void main(String[] args) {
    int grade = 15;
    if(grade > 10 || grade < 0) {
      System.out.println("Invalid grade!");
    } else {
      if(grade >= 7)
        System.out.println("Approved!!");
      else if(grade < 7 && grade >= 5)
        System.out.println("Exam");
      else
        System.out.println("Failed, try again :(");
    }
    //Using Ternary Conditions
    String result = grade > 10 || grade < 0 ? "Result: Invalid grade!" : grade >= 7 ? "Result: Approved!!" : grade >=5 && grade < 7 ? "Result: Exam, thats ok!" : "Result: Failed, try again";
    System.out.println(result);
  }
}
