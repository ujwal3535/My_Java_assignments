package Function;
import java.util.*;
public class Overload {
    
	static int mult(int a, int b){
		return a*b;
	}
	static int mult(int a,int b, int c) {
		return a*b*c;
	}
//	static int mult(int [] array) {
//		int mult=1;
//		for(int x:array) {
//			mult*=x;
//		}
//		return mult;
//	}
	static int mult(int...arr){
		int mult=1;
		for(int x:arr) {
			mult*=x;
		}
		return mult;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner st=new Scanner(System.in);
	   System.out.println("Enter size of array:");
	   int size= st.nextInt();
	   int []arr=new int[size]; 
       
	   for(int i=0;i<arr.length;i++) {
		   System.out.println("Enter elemnet "+i+" in array:");
		   arr[i]=st.nextInt();
	   }
	   int x=2,y=4;
       System.out.println("With defination:"+mult(x,y));
	   System.out.println("Without Varargs:"+mult(arr));	
	   System.out.println("VarArgs:"+mult(1,2,3,4,5,6));	
	}
}
