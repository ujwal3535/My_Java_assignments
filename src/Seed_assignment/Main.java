package Seed_assignment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyDate d1=new MyDate();
        d1.setDay("Monday");
        d1.setMonth(20);
        MyDate.setYear(1985);
        System.out.println(d1.getYear());
        System.out.println(d1.getMonth());
        System.out.println(d1.getDay());
        MyDate d2=new MyDate();
        System.out.println(MyDate.getYear());
        
	}
}
