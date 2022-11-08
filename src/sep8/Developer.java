package sep8;



class Employee{
	static int emp_id=1;
	String name;
	
	Employee(String name){
		this.name=name;
		System.out.println("Parent cons ");
	}
}

public class Developer extends Employee {
    String lang;
    String framework;
    
	Developer(String lang,String name){
	   super(name);
	   super.emp_id++;
	   this.lang=lang;
	   System.out.println("Const2");
	}
	Developer(String lang,String name,String framework){
		   this(lang,name);
		   System.out.println("Const1");
		   this.framework=framework;
		}
	public static void main(String[] args) {
    	 Developer d=new Developer("Java","Ram","Spring");
    	 System.out.println("Emp_id"+d.emp_id+"\nName:"+d.name+"\nLang:"+d.lang+" Framework:"+d.framework);
     }
}
