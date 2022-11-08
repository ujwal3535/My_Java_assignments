package ObjectCreation;

public class OuterClass {
   
	OuterClass(){
		System.out.println("Outer");
	}
	
	static public class A{
		A(){
			System.out.println("A class imported");
		}
		
	}  
	public class B{
		B(){
			System.out.println("B class is imported");
		}
	}
	public static void main(String[] args) {
		
	}
	
}
