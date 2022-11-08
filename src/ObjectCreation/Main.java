package ObjectCreation;

public class Main {
     public static void main(String[] args) {
    	 
    	 Bird.Eat();
    	 System.out.println(Bird.wings);
    	 
    	 Bird b1= new Bird();
    	 
    	 System.out.println(b1.beaklength+" "+b1.name+" "+b1.wings);
    	 b1.fly();
    	 
    	 
     }
}
