package ObjectCreation;

import java.util.Scanner;

public class Evenodd {
	
   static void evenodd(int a) {
	   if(a%2==0) {
		   System.out.println("Number is even");
	   }
	   else {
		   System.out.println("Number is Odd");
	   }
   }	
   	
   public static void main(String[] args) {
	Scanner st=new Scanner(System.in);
   	System.out.println("Enter  a number:");
   	int b=st.nextInt();
	   
	  evenodd(b);
	   
   }
}
