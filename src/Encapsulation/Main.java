package Encapsulation;

public class Main {

	static void init(Beach b1) {
		System.out.println("Beach attributes/properties:  i)"+ b1.getName()+"  ii)"+b1.getPeople()+"  iii)"+b1.getLength());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beach b1=new Beach("goa",20,30);
		init(b1);	
	}
}
