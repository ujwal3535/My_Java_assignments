package Collection16;

import java.util.HashMap;
import java.util.Map;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Map<String, Integer> m=new HashMap<>();
		
		m.put("first",23);
		m.put("Second", 35);
		m.put("third", 45);
		
		System.out.println(m);
		
		for(Map.Entry<String,Integer> e: m.entrySet()) {
			
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
			
		}
		
		
		
		
		
	}

}
