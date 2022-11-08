package Sep22;

public class innermethodclass {
    
	innermethodclass(){
		
		class B{
			B(){
				System.out.println("Inner method class");
			}
			
		}
		B b=new B();
		
		
	}
	
	
	public static void main(String[] args) {
		
		innermethodclass in=new innermethodclass();
		
	}
}
