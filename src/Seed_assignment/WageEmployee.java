package Seed_assignment;

class Employee {
    static int emp_id=1; 
	String name;
	
	Employee(){
		emp_id++;
	}
	
	Employee(String name){
		emp_id++;
		this.name=name;
	}
	
	double calculateSalary() {	
	   double sal=0;	
	   System.out.println("Salary from Employee:"+sal);
	   return sal; 
	}
}
public class WageEmployee extends Employee{
	int hours;
	float rate;
	WageEmployee(String name){
		super(name);
	}
	WageEmployee(int hours,float rate,String name){
		this(name);
		
		
		this.hours=hours;
		this.rate=rate;
	}
	
	double calculateSalary() {
		double sal;
		sal=(hours*rate)*30;
		return sal;
	}
	
}
class SalesPerson extends WageEmployee{
	float sales;
	float commision;
	
	SalesPerson(float sales,float commision,String name,int hours, int rate){
		this(name,hours,rate);
		this.commision=commision;
		this.sales=sales;
	}
	SalesPerson(String name,int hours, int rate){
		super(hours,rate,name);
	}
	double calculateSalary(){
		double sal=(commision/100)*sales;
		System.out.println("Salary from funct:"+sal);
		return sal;
	}
}










