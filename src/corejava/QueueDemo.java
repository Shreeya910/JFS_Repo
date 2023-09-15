package corejava;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo 
{

	public static void main(String[] args)
	{
		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(110);
		pq.add(120);
		pq.add(130);
		
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		
		

	}

}