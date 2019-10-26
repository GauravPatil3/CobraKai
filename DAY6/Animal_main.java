package DAY6;

public class Animal_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elephant e1 = new Elephant(7,6);
		Elephant e2 = new Elephant(6,5);
		Tiger t1 = new Tiger(6,7);
		Tiger t2 = new Tiger(7,9);
		
		e1.age=28;
		e1.color="Black";
		e1.food="Tree bark";
		e1.gender="male";
		e1.name=" Gajanan";
		e1.nol=4;
		e1.display();
		e1.eats();
		e1.swim();
		
		
		e2.age=33;
		e2.color="Black";
		e2.food="twigs";
		e2.gender="male";
		e2.name="Gajanan2";
		e2.nol=4;
		e2.display();
		e2.eats();
		e2.swim();
		e2.runs();
		
		
		t1.age=24;
		t1.color="Red-Orange";
		t1.food="Deers";
		t1.gender="male";
		t1.name="Sher khan";
		t1.climb();
		t1.eats();
		t1.mauls();
		t1.roar();
		
		t1.age=24;
		t1.color="White";
		t1.food="Fishes";
		t1.gender="male";
		t1.name="Richard ";
		t1.climb();
		t1.eats();
		t1.mauls();
		t1.roar();
		t1.runs();
		

	}

}
