package Polymorphism;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount s1=new SavingAccount();
		s1.print();
		FixedDeposit f1=new FixedDeposit();
		f1.print();	
		
		Account a= new SavingAccount() ;
		
		a.print();
		
	}
}
