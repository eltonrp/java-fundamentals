package typesAndPrints;

import java.util.Locale; //Import needed for Locale module

public class PrimitiveTypesAndPrintStatements {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //US number default definition
		
		//Primitive variables
		int intVar = 22; //integer variable declaration
		float floatVar = 10.0f; //float variable declaration
		double doubleVar = 11.0; //double variable declaration
		String text = "This is a text!!"; //String variable declaration
		System.out.println(text);
		
		//Print Statements
		System.out.print("This is a regular print!! ");
		System.out.println("This is a break line print");
		System.out.printf("This is a formatted print out%n");
		
		//Variables print out
		System.out.println("intVar: " + intVar);
		System.out.printf("floatVar: %.2f%n", floatVar);
		System.out.printf("doubleVar: %.3f%n", doubleVar);
	}

}
