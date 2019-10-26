package DAY6;

import java.util.ArrayList;

public class pgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> str=new ArrayList<String>();
		
		str.add("Gaurav");
		str.add("Global");
		str.add("Logic");
		System.out.println("Befor Insertion: "+ str);
		
		str.remove("Logic");
		System.out.println("After Deletion: "+str);
		
		
	}

}
