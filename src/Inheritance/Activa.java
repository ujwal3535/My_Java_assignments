package Inheritance;

class Scooty extends Vehical{
	void scooty() {
		System.out.println(" No Scooty! Only Audi!!");
	}
}




public class Activa extends Scooty{
	void activa() {
		System.out.println(" No Activa! Only Audi!!");
	}
	
	public static void main(String[] args) {
		System.out.println();
    	Activa a=new Activa();
    	a.vehical();
 
    	a.activa();
    	a.scooty();
    }
}
