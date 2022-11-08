package InnerAbstraction;

abstract public class Fruit{
	static void call() {
		
	}
	public static class Mango extends Fruit{
		Mango(){
			System.out.println("Mango");
		}
		static void call() {
			
		}
		static void call(int a) {
			
		}
		
	}
	class Banana{
		Banana(){
			System.out.println("Banana");
		}
	}
	
	
	public static void main(String[] args) {
		
		Mango st =new Mango(); 
		
	}
}
