package corejava;

import java.util.TreeMap;

public class TreeMapDemo 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1, "Avy");
		tm.put(3, "Vienna");
		tm.put(2, "Katnis");
		tm.put(1, "Roxy");		//Updates the duplicate key value
		tm.put(4, "Diana");		//Accepts duplicate values
		//tm.put(null,"Casy");	//Doesn't accept null keys
		System.out.println(tm);
		
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.keySet());
		System.out.println(tm.descendingKeySet());
		System.out.println(tm.firstKey());
		System.out.println(tm.firstEntry());
		System.out.println(tm.lowerKey(4));
		
	}

}
