package LabExercise7;

public class Employee {
    int emp_id;
    String name;
    int basic_salary;
    
    Employee(int emp_id,String name, int basic_salary){
    	this.emp_id=emp_id;
    	this.name=name;
    	this.basic_salary=basic_salary;
    }
    public String toString() 
    {
		return emp_id+""+name+""+basic_salary;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee  e1= new Employee(1,"Ram",50000);
        Employee  e2= new Employee(1,"Shyam",50000);
        
        System.out.println(e1);
        System.out.println(e2);
        
		
		
	}

}
