package Function;
import java.util.*;
public class Fibonacci {
    
   public void fibonacci(int a) {
		int sum,x=0,y=1;
		System.out.println("Fibonacii Series");
		for(int i=0;i<a;i++) {
		    
			System.out.print(" "+x);
			sum=x+y;
			x=y;
		    y=sum;
		}	
	}
//	static int[] fibonacci(int a,int x,int y,int[] arr) {
//		    int sum;
//		    int index= arr.length-a;
//		    arr[index]=x;
////			System.out.print(" "+x);
//			sum=x+y;
//			x=y;
//		    y=sum;
//		    if(a>0) {
//		    	fibonacci(a-1,x,y,arr);
//		    } 
////		    else{
////		    	return arr;
////		    }
//			return arr;
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//      Scanner st=new Scanner(System.in);
//      System.out.println("Enter length of fibonacci series:");
//      int len=st.nextInt();
//      int [] arr=new int[len];
//      
//      
////      fibonacci(len);
//      System.out.println();
//      for(int x:fibonacci(len,0,1,arr)) {
//    	  System.out.println(x);
//      }
//	}
}
