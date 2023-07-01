package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // US float default format
		Scanner sc = new Scanner(System.in); // Input data object
		boolean keepRunning = false;
		String read = "";
		
		do {
			
			System.out.println("Insert your name: ");
			String name = sc.next();
			
			System.out.println("Insert your weight: ");
			double weight = sc.nextDouble();
			
			Person person = new Person(name, weight);
			
			System.out.println("Name: " + person.getName());
			System.out.printf("Weight: %.2f%n", person.getWeight());
			System.out.printf("Basal Energetic Spent: %.2f%n", person.basalEnergeticSpent());
			System.out.printf("Total Energetic Spent: %.2f%n", person.totalEnergeticSpent());
			System.out.println("Insert new person? (Y/N): ");
						
			while(!read.equals("Y") || !read.equals("N")) {
				read = sc.next().toUpperCase();
				if(read.equals("Y")) {
					keepRunning = true;
					break;
				} else if(read.equals("N")) {
					keepRunning = false;
					break;
				} else {
					System.out.println("Invalid input, try againg (Y/N)");
				}
	
			}
									
		} while(keepRunning);
		
		sc.close();
	}

}
