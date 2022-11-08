package ExceptionHandling_21Sep;
import java.util.*;
import java.lang.*;

public class trycatch {
	 static void func1() throws ArrayIndexOutOfBoundsException{
		boolean danger=true;
		if(danger==true) {
			
			throw new ArrayIndexOutOfBoundsException("Winter is comming");
			
		}
		else {
			System.out.println("Summer is comming");
		}
		 
	}
    static void function2() {
    	
    	func1();
    	System.out.println("Crash");
    } 
	public static void main(String[] args) {
	
		func1();
	   
	   
 }
}
