package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // US float default format
		Scanner sc = new Scanner(System.in); // Input data object
		
		System.out.println("Insert your name: ");
		String name = sc.next();
		
		System.out.println("Insert your weight: ");
		double weight = sc.nextDouble();
		
		Person person = new Person(name, weight);
		
		System.out.println("Name: " + person.getName());
		System.out.printf("Weight: %.2f%n", person.getWeight());
		System.out.printf("BES: %.2f%n", person.basalEnergeticSpent(weight));
		System.out.printf("TES: %.2f%n", person.totalEnergeticSpent(weight));
		
		sc.close();
	}

}
