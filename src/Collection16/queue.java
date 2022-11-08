package Collection16;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Deque<Integer> q1=new LinkedList<>();
		
		q1.offerFirst(2);
		q1.offerFirst(1);
		q1.offerLast(3);
		q1.poll();		
		
		System.out.println(q1.poll());
		System.out.println(q1.pollLast());
		
		
	}

}
