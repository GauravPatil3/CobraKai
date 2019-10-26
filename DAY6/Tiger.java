package DAY6;

public class Tiger extends Animal{
	int lott;
	int loc;
	
	public void roar() {
		System.out.println("Tiger Roars");
	}
	
	public void climb() {
		System.out.println("Tiger climbs tree");
	}
	
	public void mauls() {
		System.out.println("Tiger mauls its prey");
	}

	public Tiger(int lott, int loc) {
		// TODO Auto-generated constructor stub
		this.lott=lott;  
		this.loc=loc;
	}


	public void display() {
		System.out.println(" No of legs: " +this.nol + " Skin color: "+ this.color + " Food: " + this.food + " Name: "+this.name 
							+ " Gender: " + this.gender + " Age: " + this.age );
		
		System.out.println(" Length of teeth : "+ this.lott + " Length of claws : " + this.loc);
	}

}
