package corejava;

public class Lecturer extends Emp2 
 
{
	void duty()
	{
		System.out.println("Lecturers teach to students");
	}
	
	public static void main(String args[])
	{
		Lecturer l = new Lecturer();
		l.duty();
		Emp2 e = new Emp2();
		e.duty();
	}

}