package Inheritance;

public class Audi extends Car {
    
	void audi() {
		System.out.println("Will get Audi one day!!");
	}
	
	public static void main(String[] args) {
    	
    	Audi a=new Audi();
    	a.car();
    	a.vehical();
    	a.audi();
    }
}
