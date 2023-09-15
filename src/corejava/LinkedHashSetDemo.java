package corejava;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set; 

public class LinkedHashSetDemo 
{
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		Set<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(3);
		lhs.add(2);
		lhs.add(5);
		lhs.add(1);
		lhs.add(4);
		System.out.println(lhs);
		
		lhs.add(null);
		lhs.add(8);
		lhs.add(7);
		System.out.println(lhs);  //accepts null values
		
		lhs.add(null);
		lhs.add(7);
		System.out.println(lhs); //doesn't accept duplicates
		
		System.out.println(lhs.size());
		System.out.println(lhs.contains(2));
		System.out.println(lhs.isEmpty()); 
		System.out.println();
		
		Iterator itr = lhs.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		

	}

}
