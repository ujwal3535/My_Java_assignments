package Function;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner st=new Scanner(System.in);
      System.out.println("Enter a String:");
	  String n= st.next();
	  char m,o;
	  int a=n.length();
	  for(int i=0;i<a/2;i++){
		  m=n.charAt(i);
		  o=n.charAt(a-i-1);
		  if(m==o) {
			  System.out.println("Palindrome");
			  continue;
		  }
		  else {
			  break;
		  }
	     
	  
	  }
	  
	  
	  
		
	}

}
