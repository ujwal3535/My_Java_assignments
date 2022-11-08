package Seed_assignment;

class ED{
   
	void electronicDevices(){
		System.out.println(" This is root class: ElectronicDevices ");
	}
	
}
class Computer extends ED{
	void computer(){
		System.out.println("this is computer class");
	}
}
class TV extends ED{
	void tv(){
		System.out.println("This is Tv class");
	}
}
class MobilePhone extends ED{
	void mobilePhone(){
		System.out.println("This is Mobilephone class");
	}
}
public class LCDTV extends TV{
    
	void lcdtv(){
		System.out.println(" This is Lcd Tv");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCDTV t2=new LCDTV();
		t2.electronicDevices();
		t2.tv();
		t2.lcdtv();
	}

}
