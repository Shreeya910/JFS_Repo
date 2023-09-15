package corejava;

import java.util.List;
import java.util.LinkedList;

public class LinkedListDemo
{

	public static void main(String[] args)
	{
		List<Integer> llist = new LinkedList<Integer>();
		llist.add(1);
		llist.add(10);
		llist.add(null);
		llist.add(1, 5);
		
		System.out.println(llist);
		
		llist.remove(2);
		
		System.out.println(llist);
		System.out.println(llist.set(0, 10));
		System.out.println(llist);
		System.out.println(llist.size());
		System.out.println(llist.indexOf(20));

	}

}
