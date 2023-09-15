package corejava;

import java.util.TreeSet;

public class TreeSetDemo 
{

	public static void main(String[] args) 
	{
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(126);
		ts.add(121);
		ts.add(125);
		ts.add(123);
		ts.add(124);
		ts.add(120);
		ts.add(122);
		ts.add(128);
		System.out.println(ts);
		
		ts.add(128);  		//doesn't accept duplicates
		//ts.add(null);  	//doesn't accept null values
		
		System.out.println(ts);
		System.out.println(ts.hashCode());
		System.out.println(ts.contains(130));
		System.out.println(ts.isEmpty());
		System.out.println(ts.remove(120));
		System.out.println(ts);
		System.out.println(ts.size());

	}

}
