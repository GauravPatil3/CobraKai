package DAY6;

public class Elephant extends Animal{
		int lot;
		int lotusks;
		
		public void swim() {
			System.out.println("Elephant swims");
		}
		

		public void spraying() {
			System.out.println("Elephant sprays using trunks");
		}
	
			
		public Elephant(int lot, int lotusks) {
			// TODO Auto-generated constructor stub
			this.lot=lot;
			this.lotusks=lotusks;
		}


		public void display() {
			System.out.println(" Name: "+this.name +" No of legs: " +this.nol + " Skin color: "+ this.color + " Food: " + this.food 
								+ " Gender: " + this.gender + " Age: " + this.age );
			
			System.out.println(" Length of trunk : "+ this.lot + " Length of tusks: " + this.lotusks);
		}
}
