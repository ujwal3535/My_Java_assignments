package ExceptionHandling_21Sep;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.*;

public class exceptiontrycatch {

	static int print() {
		System.out.println("Hello");
		return (Integer) null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st=new Scanner(System.in);
		int x=8;
		int y=0;
		try {
		System.out.println(x/y);
		}catch(ArithmeticException ar) {
			System.out.println(ar);
		}
		try {
		  System.out.println(x/2);
		  int [] arr=new int[5];
		  System.out.println("Enter index number:");
		  int a= st.nextInt();
		  arr[a]=2;
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(InputMismatchException e) {
			
		}
		try{
			print();
		}catch(NullPointerException n) {
			System.out.println(n);
		}
		
	}

}
