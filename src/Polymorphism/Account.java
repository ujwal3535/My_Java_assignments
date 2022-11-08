package Polymorphism;

public class Account {
    int accno=4221302;
    String name="Ram";
	void print() {
		System.out.println("Acc no:"+accno+" Name:"+name);
	}
	
}
class SavingAccount extends Account{
	double Balance=2000000;
	
	void print() {
		System.out.println("Balance:"+Balance);
	}
}
class FixedDeposit extends Account{
	double Amount= 20000;
	float duration= 20;
	
	void print() {
		System.out.println(" Amount:"+Amount+" Duration:"+duration);
	}
}