package corejava;

public class ExceptionDemo
{

	public static void main(String[] args) 
	{
		try 
		{
			int a, b, c;
			a = 30;
			b = 0;
			c = a / b;
			System.out.println(c);

		} 
		
		catch (ArithmeticException e) 
		{
			System.out.println("Arithmetic Exception Raised");
			System.out.println(e);		}
		
		
		try 
		{
			int arr[] = { 1, 2, 3, 4, 5 };
			System.out.println(arr[5]);
		}

		catch (ArrayIndexOutOfBoundsException e)
		{

			System.out.println("Array Index out of bounds Exception raised");
			System.out.println(e);
		}
		System.out.println("Outside try block");

	}

}
