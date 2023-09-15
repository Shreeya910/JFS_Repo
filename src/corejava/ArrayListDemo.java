package corejava;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		
		System.out.println(arr);
		
		Iterator<Integer> itr = arr.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
		@SuppressWarnings("rawtypes")
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(23.5);
		a.add("Shreeya");
		a.add('@');
		a.add(null);
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains(1));
		System.out.println(a.remove(1));
		System.out.println(a);
		System.out.println(a.get(2));
		
	}

}
