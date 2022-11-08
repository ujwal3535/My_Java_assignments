package Function;
import java.util.*;
public class Factorial {
 
//    static int factorial(int a){
//    	int fact=1;
//    	for(int i=a;i>0;i--) {
//    		fact=fact*i;
//    		System.out.println( fact+"and"+i);
//    	}
//    	return fact;
//    	
//    } 	
    static int factorial(int a,int fact){
		fact=fact*a;
		System.out.println( fact+"and"+a);
		a--;
    	if(a>0)
    	{
    		factorial(a,fact);
    	}
    	return fact;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner st=new Scanner(System.in); 
	   System.out.println("Enter a number:");
	   int x =st.nextInt();
	   System.out.println("Factorial of "+x+" = "+factorial(x,1));
	}

}
