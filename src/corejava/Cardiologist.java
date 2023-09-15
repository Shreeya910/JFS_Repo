package corejava;

//Hierarchial Inheritance
public class Cardiologist extends Doctor
{
	void specialty()
	{
		System.out.println("Cardiologist treats heart problems");
	}
	public static void main(String args[])
	{
		Cardiologist cd = new Cardiologist();
		cd.does();
		cd.specialty();
	}
}
