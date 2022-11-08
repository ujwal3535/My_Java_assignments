package Seed_assignment;

public class Player {
    
	void player() {
		System.out.println("Player");
	}
	
	public static void main(String[] args) {
		Batsman bt=new Batsman();
		Bowler bl=new Bowler();
		
		bt.batsman();
		bt.cricketer();
		bt.player();
		System.out.println();
		bl.bowler();
		bl.cricketer();
		bl.player();

	}

}
class HockeyPlayer extends Player{
	void hp(){
		System.out.println("Hockey Player");
	}
}
class Criketer extends Player{
	void cricketer(){
		System.out.println("cricketer");
	}
}
class FootballPlayer extends Player{
	void Fp(){
		System.out.println("Football Player");
	}
}

class Batsman extends Criketer{
	void batsman() {
		System.out.println("Batsman");
	}
}
class Bowler extends Criketer{
	void bowler() {
		System.out.println("Bowler");
	}
}

