package corejava;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo 
{

	public static void main(String[] args)
	{
		Map<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		lhm.put("January", 31);
		lhm.put("May", 31);
		lhm.put("February", 28);
		lhm.put("March", 31);
		lhm.put("June", 30);	//Maintains insertion order
		lhm.put("March", 31);	//Updates value for the key
		lhm.put("March", null);	//Updates value to null
		lhm.put(null, null);	//Accepts one null key
		lhm.put(null, 30);
		System.out.println(lhm);
		System.out.println(lhm.keySet());
		System.out.println(lhm.containsKey("January"));
		System.out.println(lhm.remove(null));
		System.out.println(lhm);
		System.out.println(lhm.size());
		lhm.putIfAbsent("April", 30); 	 
		System.out.println(lhm);

	}

}
