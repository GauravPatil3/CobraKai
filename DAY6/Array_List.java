package DAY6;
import java.util.ArrayList;

import DAY4.student;
public class Array_List {
ArrayList<student>str=new ArrayList<student>();
	public void create() {
		student s1=new student(90,101,80,"Ramesh");
		student s2=new student(91,105,87,"Priya");
		
		s1.average();
		s2.average();
		str.add(s1);
		str.add(s2);
		
	}
	
	public void display() {
		for(student s:str) {
			
			System.out.println("Name:"+s.name+"\nRoll Number:"+s.rollno+"\nMark1:"+s.m1+"\nMark2:"+s.m2+"\nAverage:"+s.avg);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Array_List al=new Array_List();
		al.create();
		al.display();
	}

}
