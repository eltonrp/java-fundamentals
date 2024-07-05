public class ForArray {
  public static void main(String[] args) {
    String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
    for(int x=0; x < alunos.length; x ++) {
      System.out.println("aluno no índice " + x + " é " + alunos[x]);
    }
    //foreach
    for(String aluno : alunos) {
      System.out.println("Aluno: " + aluno);
    }
  }
}
