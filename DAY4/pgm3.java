package DAY4;

public class pgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0,a=0,c=0,p=0;
		String word="I am Working in Global Logic Noida";
		while(p!=-1) {
			p=word.indexOf(" ",p+1);
			c++;
		}
		
		String[] str=new String[c];
		
			   int index = 0;
		
			while ((index = word.indexOf(' ', index + 1)) > 0) {
			    str[i]=word.substring(a, index);
			    a=index+1;
			    i++;
			}
		str[i]=word.substring(a ,word.length());
		for(String output:str)
		System.out.println(output);
	}

}
