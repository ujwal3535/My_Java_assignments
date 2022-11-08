package Function;
import java.util.*;
public class CalcFunction {

	static float add(float a, float b) {
		return a+b;
	}
	static float sub(float a, float b) {
		return a-b;
	}
	static float mult(float a ,float b) {
		return a*b;
	}
	static float div(float a, float b){
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Welcome to Java Calculator");
        System.out.println("=============================================");
        System.out.println("OPERATIONS:");
        System.out.println("1.Addition(+)");
        System.out.println("2.Substration(-)");
        System.out.println("3.Multiplication(*)");
        System.out.println("4.Division(/)");
        System.out.println("=============================================");
        System.out.println("Enetr sysmbol of Operation to be performed:");
        String symbol=sc.next();
        System.out.println("=============================================");
        System.out.println("Enter first number:");
        float a =sc.nextFloat();
        System.out.println("Enter second Number: ");
        float b=sc.nextFloat();
        System.out.println("========Ans is:==============================");
        switch(symbol)
        {
        case "+":
        	System.out.println("Addition of "+a+" and "+b+" is "+add(a,b));
        	System.out.println("=============================================");
        	System.out.println("Thank you for using Java Calulator");
            break;
        case "-":
        	System.out.println("Substration of "+a+" and "+b+" is "+sub(a,b));
        	System.out.println("=============================================");
        	System.out.println("Thank you for using Java Calulator");
            break;
        case "*":
        	System.out.println("Multiplication of "+a+" and "+b+" is "+mult(a,b));
        	System.out.println("=============================================");
        	System.out.println("Thank you for using Java Calulator");
            break;
        case "/":
        	System.out.println("Division of "+a+" and "+b+" is "+div(a,b)); 
        	System.out.println("=============================================");
        	System.out.println("Thank you for using Java Calulator");
            break;
        default:
        	System.out.println("Entered symbol is incorrect.Please enter specified operation symbols only");
        }
        
        
        
		
		
	}

}
