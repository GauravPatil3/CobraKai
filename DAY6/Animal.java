package DAY6;

public class Animal {
	
	int nol;
	String color;
	String food;
	String name;
	String gender;
	int age;
	
	
	public void walks() {
		System.out.println("the animal walks\n");
	}
	
	public void eats() {
		System.out.println("the animal eats\n");
	}
	
	public void runs() {
		System.out.println("the animal runs\n");
	}
	public void display() {
		System.out.println(" No of legs: " +this.nol + " Skin color: "+ this.color + " Food: " + this.food + " Name: "+this.name 
							+ " Gender: " + this.gender + " Age: " + this.age );
	}
	
}
