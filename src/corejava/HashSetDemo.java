package corejava;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{

	@SuppressWarnings("rawtypes")
	public static void main(String[] args)
	{
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(8);
		hs.add(7);
		hs.add(4);
		System.out.println(hs);
		System.out.println(hs.size());
		
		hs.add(null);
		hs.add(5);
		hs.add(1);
		hs.add(6);
		hs.add(9);
		hs.add(8);
		hs.add(3);
		System.out.println(hs);
		System.out.println(hs.size());
		
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.size());
		
		hs.remove(null);
		System.out.println(hs);
		System.out.println(hs.size());
		
		Iterator itr = hs.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		
	}

}
