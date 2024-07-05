public class CepFormating {
  public static void main(String[] args) {
    try {
      String formatCep = formatCep("2376506");
      System.out.println(formatCep);
    } catch (InvalidCepException e) {
      //e.printStackTrace();
      System.out.println("Cep não corresponde ao formato padrão de 8 dígitos");
    } finally {
      System.out.println("Fim do programa");
    }
  }
  static String formatCep(String cep) throws InvalidCepException {
    if(cep.length() != 8)
      throw new InvalidCepException();
    return "23.765-064"; //For ilustrations porposes only
  }
}
