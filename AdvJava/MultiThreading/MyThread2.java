package MultiThreading;

class Basic3 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<400;i++) {
		     System.out.println("cookies");
		    
		   }
	}
	
}
class Basic4 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<400;i++) {
		     System.out.println("Biscuts & Tea");
		   }
	}
}


public class MyThread2 {
   public static void main(String[] args) {
	   Basic b1=new Basic();
	   Basic1 b2=new Basic1();
	   Thread gun1=new Thread(b1);
	   Thread gun2=new Thread(b2);
	   gun1.start();
	   gun2.start();
  }
}
