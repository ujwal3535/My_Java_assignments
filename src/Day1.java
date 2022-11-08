import java.util.*;
public class Day1 {
	
	
   public static void main(String[] args)
   {
	   String n= "Abc";
		int num = 340;
		float z=20.4f;
		boolean val=true;
		
	    int ageofram=10;
		int ageofshyam =15; 
		boolean isindian= true;
		String name1="Ram";
		String name2="Shyam";
		
		System.out.println("My name is:"+n);
		System.out.println("My age is:"+num);
		System.out.println("My percentage is:"+z);
		System.out.println("I am a boy:"+val);
        
		if(ageofram > ageofshyam){
			if(isindian=true) {
				System.out.println(name1+"is older than"+name2+". And is also indian");
			}else{
				System.out.println(name1+"is older than"+name2+".But is non-indain ");
			}
		}	
		else {
			if(isindian=true) {
				System.out.println(name2+"is older than"+name1+". And is also indian");
			}
			else {
				System.out.println(name1+"is older than"+name1+"But is non-indian");
			}
		}	
			 
	 }
   }

