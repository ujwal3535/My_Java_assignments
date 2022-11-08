package Function;

import java.util.*;
public class Majoritynumber {
	
	static int find_bruteforce() {
		int [] arr= {1,2,3,5,5,6,7,7,7};
        int max=0,maj = 0;
        
        for(int i=0;i<arr.length;i++) 
        {
          int count=1;
     	   for(int j=0;j<arr.length && j!=i;j++) {  
     	     if(arr[i]==arr[j]) 
     	     {
     		   count++;
                if(count>arr.length){
                    maj=arr[i];
                    return maj;
                }
     	     }
     	   }
     	   if(count>max) 
     	   {
     	       max=count; 
     		   maj=arr[i];
     	   }
     	  }
		return maj;
	}
    public static void main(String[] args) {
    	 Scanner st=new Scanner(System.in);
    	 System.out.println("Hello");
         
         
         System.out.println("Majority elemnet : "+ find_bruteforce());
     }
}


