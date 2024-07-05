package edu.elton.dataInput;

import java.util.Locale; //Needed import for Locale module
import java.util.Scanner; //module import for data input

public class ScannerInput {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //US number default definition

		Scanner sc = new Scanner(System.in); //instantiate object for data input

		//Outra forma de instanciar o Scanner e Locale
		//Scanner scanner = new Scanner(System.in).useLocale(Locale.US)
		
		System.out.print("What is your name: ");
		
		String name = sc.next(); //string data input method
		
		System.out.println("Your name is: " + name + "!");
		
		System.out.println("Give me a integer number: ");
		
		int numInt = sc.nextInt(); //integer number input method
		
		System.out.println("The int number is: " + numInt);
		
		System.out.println("Give me a double number: ");
		
		double numDouble = sc.nextDouble(); //double number input method, same about float
		
		System.out.printf("The double number is: %.2f%n", numDouble);
		
		sc.close();
		
		System.out.printf("%nThis is the end!!!");

	}

}