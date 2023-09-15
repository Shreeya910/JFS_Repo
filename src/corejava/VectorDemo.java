package corejava;

import java.util.List;
import java.util.Vector;

public class VectorDemo
{

	public static void main(String[] args)
	{
		List<String> vlist = new Vector<String>();
		vlist.add("Mon");
		vlist.add("Tue");
		vlist.add("Mon");
		vlist.add("Fri");
		vlist.add(2, "Wed");
		vlist.add(3, "Thu");
		vlist.add("Mon");
		vlist.add("Sat");
		
		System.out.println(vlist);
		System.out.println(vlist.remove(7));
		System.out.println(vlist);
		System.out.println(vlist.set(3, "Sun"));
		System.out.println(vlist);
		System.out.println(vlist.isEmpty());
		System.out.println(vlist.indexOf("Tue"));
		System.out.println(vlist.lastIndexOf("Mon"));
		 
	}

}
