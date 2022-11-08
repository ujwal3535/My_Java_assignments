package Function;
import java.util.Scanner;
public class Functionparam {

	static int add(float p,float q) {
		return (int) (p+q);
		
	}
	static int mult(int p, int q) {
		return p*q;
	}
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first number:");
		int a =sc.nextInt();
		System.out.print("Enter second number:");
		int b= sc.nextInt();
		
		System.out.println();
		
		System.out.println("Addition ="+add(a,b));
		
        System.out.println();
		
		System.out.println("Multiplication ="+mult(a,b));
		
	}
}
