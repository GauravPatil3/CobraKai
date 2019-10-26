package DAY5;

public class pgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		int n=10,m=0;
		int p=n/m;
		System.out.println(p);
	}
catch(ArithmeticException e) {
	System.out.println(e);
}
try {
int arr[]= {1,2,3};
System.out.println(arr[3]);
}
	
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
System.out.println("Out of catch");
}}
