package ObjectCreation;

public class Bird {
    
	int beaklength;
	static int beak=1;
	String name;
	static int wings=2;
    boolean Swim;
	
	static void Eat() {
		System.out.println("All birds can eat");
	}
	void fly() {
		System.out.println("All birds can fly except Ostrich");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Bird b1=new Bird();
		b1.name="Flamingo";
		b1.Swim=false;
		b1.beaklength=20;
		
		System.out.println(b1.beaklength+" "+b1.name+" "+b1.Swim+" "+beak+" "+wings);
	}

}
