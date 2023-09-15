package corejava;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo 
{

	public static void main(String[] args) 
	{
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(2301, "Shreeya");
		hm.put(2302, "Priya");
		hm.put(2305, "Tejaswini");
		hm.put(2304, "Neha");
		hm.put(2303, "Harshitha");	//doesn't maintain insertion order
		System.out.println(hm);	
		
		hm.put(null, "Kavya");	//accepts only one null key
		System.out.println(hm);
		
		hm.put(null, "Bhavya");		//updates null key's value
		System.out.println(hm);
		
		hm.put(2303, "Durga Prakash");	//updates key value, doesn't accept duplicate keys
		System.out.println(hm);
		
		hm.put(null, null);	//accepts null values
		System.out.println(hm);
		
		hm.put(2307, null);	//accepts duplicate values
		System.out.println(hm);
		
		System.out.println(hm.keySet());
		System.out.println(hm.containsKey(2));
		System.out.println(hm.containsValue("Durga Prakash"));
		System.out.println(hm.remove(7));
		System.out.println(hm.remove(null, null));
		System.out.println(hm);

	}

}
