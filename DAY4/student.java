package DAY4;

public class student {

	public int m1,m2;

	public int rollno;

	public String name;
	public float avg;
	public student() {
		
	}
	public student(int rollno,int m1,int m2,String name) {
		this.m1=m1;
		this.rollno=rollno;
		this.m2=m2;
		this.name=name;
	}
	public float average() {
		
		avg=(float)(m1+m2)/2;
		return avg;
	}
	public static void display(student a) {
		System.out.println("Name: "+a.name+"\n"+"Roll No: "+a.rollno+"\n"+"marks1: "+a.m1+"\n"+"marks2: "+a.m2+"\n"+"Average is:"+a.avg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student(90,101,80,"Ramesh");
		student s2=new student(90,101,80,"Ramesh");
		student s3=new student(90,101,80,"Ramesh");
		s1.avg=s1.average();
		s2.avg=s2.average();
		s3.avg=s3.average();
		System.out.println("Details of Students are:");
		System.out.println();
		display(s1);
		System.out.println();
		display(s2);
		System.out.println();
		display(s3);
		

	}

}
