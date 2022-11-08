package abstractionAssignmnet;

abstract public class Developer extends Employee {
    
	String Dept="Developer";
	
	
	
	Developer(){
		System.out.println("This is Developer");
	}
	
	abstract void coding();
}
