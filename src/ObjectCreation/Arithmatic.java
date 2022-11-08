package ObjectCreation;

public class Arithmatic {
     
	static int res;
	int multiply(int a ,int b) {
		return a*b;
		
	}
	static int multiply(int a ,int b,int c) {
		res=a*b*c;
		return res;
		
	}
	int multiply(int a ,int b,int c,int d) {
		return a*b*c*d;
		
	}
	int multiply(int a ,int b, int c,int d, int e ) {
		return a*b*c*d*e;
		
	}
//	{
//		System.out.println("Hello from init block");
//	}
	static {
		System.out.println("Hello from static block");
	}
	
	
}
