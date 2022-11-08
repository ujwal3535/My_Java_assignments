package MultiThreading;

class Basic extends Thread{
    public void run() {
		   
	for(int i=0;i<400;i++) {
	     System.out.println("cookies");
	     try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
   }
}

class Basic1 extends Thread{
	   public void run1() {
		   
		  for(int i=0;i<400;i++) {
		     System.out.println("biscuts");
		     try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    
		  }
		   }
	   }
	

public class BasicThread implements Runnable {
   public static void main(String[] args) {
	Basic b1=new Basic();
	Basic1 b2=new Basic1();
	b1.start();
	b2.start();
	
	   
 }

@Override
public void run() {
	// TODO Auto-generated method stub
	
} 
}
