
public class palindrome {

//	static void reverse(String str){
//	   char temp2;
//	   boolean flag=true;
//	   char [] arr=new char[str.length()+1];
//	   for(int i=0;i<str.length();i++) {
//		   temp2=str.charAt(str.length()-i-1);
//		   arr[i]=temp2;
//	   }
//	   for(int i=0;i<str.length();i++) {
//		   if(arr[i]==str.charAt(i)) {
//			   flag=true;
//		   }
//		   else {
//			   flag=false;
//			   break;
//		   }
//	   }
//	   if(flag==true){
//		   System.out.println("String is palindrome");
//	   }
//	   else {
//		   System.out.println("String is not a palindrome");
//	   }
//	}
	static void checkpalindrome(String str){
		char temp2;
		boolean flag=true;
		for(int i=0;i<str.length()/2;i++) {
		  if(str.charAt(i)==str.charAt(str.length()-i-1)) {
			  flag=true;
			  
		  }
		  else {
			  flag=false;
			  break;
		  }
		}
		if(flag) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		checkpalindrome("adam");
		
	}
}
