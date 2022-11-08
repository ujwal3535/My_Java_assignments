package Sep22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Account {
    int id;
    
    Account(int id){
    	this.id=id;
    }
	
	
	public static void main(String[] args) {
	    
		Account a1=new Account(1);
		Account a2=new Account(2);
		Account a3=new Account(3);
		Account a4=new Account(4);
		Account a5=new Account(5);
		
		List<Account> l= new ArrayList<>();
		
		l.add(a1);
		l.add(a2);
		l.add(a3);
		l.add(a4);
		l.add(a5);
		Iterator<Account> it= l.iterator();
		
		while(it.hasNext()) {
			System.out.println("Object"+it.next().id);
		}
 }
}
