package DAY5;

import DAY4.student;

public class pgm5_main {

	public static void main(String[] args) {
		
	/*	int r1=1;
		
		we want array of student object
		student s1=ex.read_excel(r1);
		s1.average(s1.m1,s1.m2);
		ex.write_excel(s1,r1);
		r1++;
		student s2=ex.read_excel(r1);
		s2.average(s2.m1,s2.m2);
		ex.write_excel( s2,r1);
		*/
		pgm4_R_W ex=new pgm4_R_W();
		for(int i=1;i<=2;i++) {
			
			student s1=ex.read_excel(i);
			s1.average();
			ex.write_excel(s1,i);
		}
		
		
	}

}
