//Asgedom
//08/10/2018
//Java Excercise on Fibonacci

public class Fibonacci {

	public static void main(String[] args) {
		int a=0, b=1;
		int c=a+b;
		 System.out.println(a);
		 System.out.println(b);
		 	
		for(int i=0; i<=12; i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
				
	}
	}

}
