package application;

import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		
		BusinessAccount account = new BusinessAccount(001, "John Deer", 0.0, 3000.0);
		
		System.out.println(account.getHolder());

	}

}
