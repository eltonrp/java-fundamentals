package entities;

public class Person {
	
	private String name;
	private double weight;
	
	public Person(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double basalEnergeticSpent() {
		
		return (11.472 * getWeight() + 873.1);
	}
	
	public double totalEnergeticSpent() {
		
		return (basalEnergeticSpent() * 1.4);
	}
	
}
