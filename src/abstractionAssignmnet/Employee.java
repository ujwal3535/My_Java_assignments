package abstractionAssignmnet;

abstract public class Employee {
    String Status="Employee";
	static int emp_id=0;
	Employee(){
		System.out.println("This is employee");
		this.emp_id++;
	}
	
	abstract void work();
	
}
