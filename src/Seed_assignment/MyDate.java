package Seed_assignment;

public class MyDate {
      
	private String day;
	private int month;
	private static int year;
	public static int getYear() {
		return year;
	}
	public static void setYear(int year) {
		MyDate.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
	
}
