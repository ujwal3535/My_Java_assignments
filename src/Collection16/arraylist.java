package Collection16;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    
	public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		
		al.add(2);
		al.add(4);
		al.add(3);
		al.add(89);
//		System.out.println(al.get(0).equals(al.get(1)));
//		System.out.println(al.get(0).hashCode());
		Collections.sort(al);
		System.out.println(al);
		
	}
	
}
