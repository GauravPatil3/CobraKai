package DAY7;

import java.util.ArrayList;

import DAY4.student;

public class pgm5_main {

	public static void main(String[] args) {
	
		pgm4_R_W ex=new pgm4_R_W();
		
		 	ArrayList<student> arr=ex.read_excel();
			
			ex.write_excel(arr);
		
		
		
	}

}
