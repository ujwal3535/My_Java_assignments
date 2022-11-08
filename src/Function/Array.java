package Function;
import java.util.*;
public class Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner st=new Scanner(System.in);
       int [] arr=new int[5];
       int count=0;
       for(int i=0;i<5;i++) {
    	   int n=st.nextInt();
    	   arr[i]=n;
       }
//       for(int i=0;i<5;i++) {
//    	 for(int j=0;j<5 && j!=i;j++) {  
//    	   if(arr[i]==arr[j]) {
//    		   count++;
//    		   if(count>arr.length/2) {
//    			  System.out.println("Majority element"+arr[i]);
//    			  break;
//    		   }
//    		   else {
//    			   continue;
//    		   }
//    	   }
//    	   
//    	 }	    
//       }
	}
}
