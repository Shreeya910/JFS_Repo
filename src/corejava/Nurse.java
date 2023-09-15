package corejava;

//Multilevel Inheritance
public class Nurse extends Surgeon 
{
	void task()
	{
		System.out.println("Nurse assists surgeon during surgery");
	}

	public static void main(String[] args)
	{	
		Nurse n = new Nurse();
		n.does();
		n.perform();
		n.task();
	}

}
