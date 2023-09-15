package corejava;
//Multi level inheritance
public class Superb extends Skoda //Superb is sub-class of Skoda
{
	Superb()
	{
		System.out.println("Superb initialized");
		System.out.println();
	}
	void speed()
	{
		System.out.println("200 kmph is the speed ");
	}
	
	public static void main(String args[])
	{
		Superb s1 = new Superb();
		s1.engine();
		s1.cc();
		s1.speed();
	}

}
