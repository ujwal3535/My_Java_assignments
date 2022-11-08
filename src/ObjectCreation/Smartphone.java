package ObjectCreation;
import java.util.*; 
public class Smartphone {
    int price;
    String ModelName;
    int ram;
    int rom;
    String OS;
    int Mobileno;
    Smartphone(){
    	System.out.println("Constructor Overloading");
    }
    Smartphone(int price,String ModelName,int ram,int rom,String OS,int Mobileno){
    	this.price=price;
    	this.ModelName=ModelName;
    	this.ram=ram;
    	this.rom=rom;
    	this.OS=OS;
    	this.Mobileno=Mobileno;
    }
    void SwitchOn() {
    	System.out.println("Mobile is On");
    }
    void SwitchOff() {
    	System.out.println("Mobile is Off");
    }
    void Calling() {
    	System.out.println("Number is :"+this.Mobileno);
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner st=new Scanner(System.in);
        int i=1;
        Smartphone s1=new Smartphone(15000,"Oneplus",4,64,"Android",987654321);
        s1.SwitchOn();
        s1.SwitchOff();
        s1.Calling();
        System.out.println("Values: "+s1.Mobileno+" "+s1.ModelName+" "+s1.OS+" "+s1.price+" "+s1.ram+" "+s1.ram);
        Smartphone s2=new Smartphone();
        System.out.println("Values: "+s2.Mobileno+" "+s2.ModelName+" "+s2.OS+" "+s2.price+" "+s2.ram+" "+s2.ram);
		s2.Calling();
	}
}
