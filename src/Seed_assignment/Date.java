package Seed_assignment;

public class Date {
	String format1="11/03/2022";
	String format2="12.09.2023";
	
	Date(){
		
		System.out.println("Format 1:"+format1+" Format 2:"+format2);
	}
	Date(String f1, String f2){
		System.out.println("Format 1:"+f1+" Format 2:"+f2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Date d1=new Date("21,03,23","2022/07/23");
		Date d2=new Date();
	}

}
