package DAY4;

public class pgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(int i=1;i<=3;i++) {
			
			int y=(4%i==0?4/i:4/i-1);
			for(int j=1;j<=y;j++) {
				System.out.print(" ");
			}
			for(int d=1;d<=i;d++) {
				System.out.print("1");
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
