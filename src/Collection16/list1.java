package Collection16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class list1 {

	public static void main(String args[]) {
		
		System.out.println(); 
		System.out.println("ArrayList:");
		List<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(2, 8);
		for(int i:al) {
		  System.out.println(i);
		}
	    System.out.println(); 
	    System.out.println("Queue:");
	    Queue<Integer> q=new LinkedList<>();
	    q.offer(2);
	    q.add(2);
	    System.out.println(q.poll());
	    System.out.println(q.poll());
	    
	    System.out.println("============================================================"); 
	    System.out.println("Stack:");
	    Stack<Integer> s=new Stack<>();
	    s.push(1);
	    s.push(2);
	    s.push(3);
	    s.push(4);
	    for(int i:s) {
	    	System.out.println(i);
	    }
	    System.out.println(s.pop());
	    
	    System.out.println("============================================================"); 
	    System.out.println("PriorityQueue:");
	    Queue<String> q1=new PriorityQueue<>();
	    
	    q1.add("Sam");
	    q1.add("Ram");
	    q1.add("Jam");
	    System.out.println(q1.poll());
	    System.out.println(q1.poll());
	    System.out.println(q1.poll());
	    
	}
}
