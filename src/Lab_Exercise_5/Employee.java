package Lab_Exercise_5;

class Date{
    int day;
    int month;
    int year;
	
	Date(int d,int m,int y){
		this.day=d;
		this.month=m;
		this.year=y;
	}
	

}

public class Employee extends Date{
	String name;
	Employee(int d,int m,int y){
		super(d,m,y);
	}
	Employee(int day,int month,int year, String name){
		this(day,month,year);
		this.name=name;
		
	}
	void print() {
		System.out.println("Joining date of Employee "+this.name+" is "+day+"/"+month+"/"+super.year);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Employee e=new Employee(01,02,2022,"Ujwal Deshpande");
		e.print();
		
	}
}