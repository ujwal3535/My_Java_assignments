package Interface;

public class InterfaceMain {
   
	public static void main(String[] args) {
		
		Ball b=new Ball();
		b.bounce();
		b.move();
		
		Car c=new Car();
		c.move();
		
		movable m=new Car();
		m.move();
		
	}
	
	
}
