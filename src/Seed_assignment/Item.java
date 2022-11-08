package Seed_assignment;

public class Item {
	String title ="Eagles";
    String publisher="R.N.Scott";
    static int yearPublished=1976;
    int isbn;
    int price;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Book b=new Book();
		System.out.println(b.publisher+" "+Item.yearPublished);
	}

}

class Book extends Item{
	
	Book(){
		System.out.println("From Book");
	}
	
}
class MusicCD extends Item{
	MusicCD(){
		System.out.println("From music-cd");
	}
}
class Software extends Item{
	Software(){
		System.out.println("From software");
	}
}