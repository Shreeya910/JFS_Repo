package corejava;

//Hierarchial Inheritance
public class Mahindra extends Car 
{
	Mahindra()
	{
		System.out.println("Mahindra created");
		System.out.println();
	}
	void cc()
	{
		System.out.println("10000 cc");
	}

	public static void main(String[] args)
	{
		Mahindra m1 = new Mahindra();
		m1.engine();
		m1.cc();
	}

}
