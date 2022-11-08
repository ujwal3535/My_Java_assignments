package Inheritance;

public class Vehical {
   
	Vehical(){
		System.out.println("Vehical is called from constructor(MultiLvl)");
	}
	void vehical() {
		System.out.println("Vehical is called from normal method(MultiLvl)");
	}
	
}
class Car extends Vehical{
	Car(){
		System.out.println("car is called from constructor(MultiLvl)");
	}
	void car() {
		System.out.println("car is called from normal method(MultiLvl)");
	}
} 
class Twowheeler extends Vehical{
	Twowheeler(){
		System.out.println("Twoeheeler is called from constructor(MultiLvl)");
	}
	void twoeheeler() {
		System.out.println("Twoeheeler is called from normal method(MultiLvl)");
	}
}