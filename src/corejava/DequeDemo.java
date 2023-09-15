package corejava;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo 
{

	public static void main(String[] args) 
	{
		Deque<Integer> dq = new ArrayDeque<Integer>();
		dq.add(11);
		dq.add(12);
		dq.add(13);
		
		//dq.add(null);		
		//doesn't accept null values
		//throws null pointer exception
		
		dq.add(11);			
		//accepts duplicate values
		
		dq.addFirst(14);	//insertion from one end
		dq.addLast(15);		//insertion from another end
		
		System.out.println(dq.contains(12));
		System.out.println(dq.isEmpty());
		System.out.println("The first element is : " + dq.peek());	//fetches the first element of the container
		System.out.println(dq);
		System.out.println("The element removed from first position is : " + dq.poll());	//removes first element from front end
		System.out.println(dq);
		System.out.println("The element removed from first position is : " + dq.removeFirst());	//deletion from one end
		System.out.println(dq);
		System.out.println("The element removed from last position is : " + dq.removeLast());	//deletion from other end
		System.out.println(dq);
		
		
		

	}

}
