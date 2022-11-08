package Collection16;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
    
	public static void main(String[] args) {
		
		//No duplicate value is taken for set
		Set<Integer> hs=new HashSet<>();
		hs.add(2);
		hs.add(4);
		hs.add(6);
		
		System.out.println(hs.contains(4));
		System.out.println(hs);
		
		Set<Integer> lhs=new LinkedHashSet<>();
		
		lhs.add(5);
		lhs.add(4);
		lhs.add(6);
		
		System.out.println(lhs);
		
		Set<Integer> t=new TreeSet<>();
		t.add(25);
		t.add(65);
		t.add(14);
		
		System.out.println(t);
		
		
		
		
	}
	
}
