import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		float x = 10.4555666f;
		
		System.out.printf("%.3f%n", x);
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		System.out.println("Olá " + nome + "!");
		System.out.println("Digite um número inteiro: ");
		int num = sc.nextInt();
		System.out.println(num);
		System.out.println("Digite um número float: ");
		double num2 = sc.nextDouble();
		System.out.println(num2);
		
		
		
		sc.close();
	}

}
