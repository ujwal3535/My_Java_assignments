package abstractionAssignmnet;

public class Fresher extends JrDeveloper{
    
	
    Fresher(){
    	System.out.println("This is a Fresher");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Fresher f=new Fresher();
		f.work();
		f.coding();
		f.learn();
	    System.out.println("Employee no:"+emp_id);
	}

	@Override
	void learn() {
		// TODO Auto-generated method stub
		System.out.println("Overideen Employee abstract method");
	}

	@Override
	void coding() {
		// TODO Auto-generated method stub
		System.out.println("Overideen Developer abstract method");
	}

	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("Overideen Jr.Developer abstract method");
	}

}
