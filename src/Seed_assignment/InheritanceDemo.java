package Seed_assignment;

public class InheritanceDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// Method Overridderm: WageEmployee method will execute  
		WageEmployee w1=new WageEmployee(9,500,"Ujwal");
		System.out.println(w1.calculateSalary());
		
		// Employye method will Execute
		Employee e1 =new Employee("Ram");
		System.out.println("Employee class funct: "+e1.calculateSalary());
		
		// Runtime Polymorphism or method overriding exception
		Employee e2=new WageEmployee(9,500,"Shyam");
		System.out.println("Id:"+e2.emp_id+" Salary is "+e2.calculateSalary());
		
		// Method Overridderm: SalesPerson method will execute  
		SalesPerson s1=new SalesPerson(200000, 30, "Gayatri", 9, 400);
		
		System.out.println("Salary of SalesPerson:"+s1.calculateSalary()+" and emp id:"+ s1.emp_id);
		
		// Method Overridderm: WageEmployee method will execute  
		WageEmployee w2=new SalesPerson(200000, 30, "Gayatri", 9, 400);
		System.out.println("Salary of SalesPerson:"+w2.calculateSalary()+" and emp id:"+ w2.emp_id);
		
		// Method Overridderm: SalesPerson method will execute  
		Employee e3=new SalesPerson(200000, 30, "Gayatri", 9, 400);
		System.out.println("Salary of SalesPerson:"+e3.calculateSalary()+" and emp id:"+ e3.emp_id);
		
	}
}
