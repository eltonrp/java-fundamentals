package dataInput;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		
		String name = sc.next(); 
		
		System.out.println("Seu nome é: " + name + "!");
		
		sc.close();

	}

}
