package corejava;

import java.util.List;
import java.util.Vector;

public class StudentDetailsVector 
{

	public static void main(String[] args) 
	{
		List<StudentDetails> sdlist = new Vector<StudentDetails>();
		sdlist.add(new StudentDetails(1, "Shreeya", "CSE", 100));
		sdlist.add(new StudentDetails(2, "Casendra", "CSE", 100));
		sdlist.add(new StudentDetails(3, "Caramel", "IT", 100));
		sdlist.add(new StudentDetails(4, "Vyshnavi", "CSE", 100));
		
		System.out.println(sdlist);
		System.out.println(sdlist.isEmpty());
		System.out.println(sdlist.hashCode());

	}

}
