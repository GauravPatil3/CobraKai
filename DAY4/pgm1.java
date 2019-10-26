package DAY4;

public class pgm1 {

	public static void main(String[] args) {
		
		int num=5;
		for(int i=1;i<=5;i++) {
			for(int j=num;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("1");
				System.out.print(" ");
				
			}
			System.out.println();
		}
	}

}
