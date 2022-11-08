package Encapsulation;

public class Employee {
    
	static private int emp_id=0;
	static private String emp_name;
	static private double basic_sal;
	static private double hra =basic_sal*0.5;
	static private double medical;
	static private double pf=0.12 * basic_sal;
	static private double pt=200;
	static private double net_sal;
	static private double gross_sal;
	
	Employee(String emp_name,int basic_sal,double medical){
		this.emp_id++;
		this.emp_name=emp_name;
		this.basic_sal=basic_sal;
		this.medical=medical;
		this.hra =basic_sal*0.5;
	}
	
	Employee(int emp_id,String emp_name,int basic_sal,double medical){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.basic_sal=basic_sal;
		this.medical=medical;
		this.hra =basic_sal*0.5;
		this.pf=0.12 * basic_sal;
	}
	float gross_sal() {
		gross_sal=basic_sal+hra+medical;
		
		return (float) gross_sal;
	}
	void net_sal() {
		System.out.println("Gross_sal :"+gross_sal());
		gross_sal=gross_sal()-(pf+pt);
		System.out.println("Net_sal :"+gross_sal);
	}
	void display() {
		System.out.println("Hra:"+hra+" PF:"+pf+" EmpID:"+emp_id+" "+emp_name+" Basic Sal:"+basic_sal);
	}
	int employee_count() {
		return emp_id;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Ujwal", 120000,30000);
		System.out.println("Hra:"+e1.hra+" PF:"+e1.pf);
		System.out.println();
		e1.display();
		e1.net_sal();
		System.out.println("Number of employees:"+e1.employee_count());
		Employee e2=new Employee("Ram", 120000,30000);
		System.out.println("Number of employees:"+e2.employee_count());
		Employee e3=new Employee("Shyam", 120000,30000);
		System.out.println("Number of employees:"+e3.employee_count());
		
	}

}
