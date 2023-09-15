package corejava;
//Program on implementing interface
public class FourWheeler implements Vehicle
{

	public void speed() 
	{
		System.out.println("The minimum speed of four wheeler is : 40kmph");
	}

	
	public void mileage() 
	{
		System.out.println("The minimum mileage of four wheeler is : 20kmpl");

	}

	public static void main(String[] args)
	{
		FourWheeler bus = new FourWheeler();
		bus.speed();
		bus.mileage();            
	}

}
