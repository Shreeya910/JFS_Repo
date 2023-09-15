package corejava;

import java.util.Scanner;

class CustomException extends Exception 
{
	CustomException(String e)
	{
		super(e);
	}
}

public class CustomExceptionDemo
{

	static void validate(int totalincome) throws CustomException 
	{
		if (totalincome <= 10000)
			System.out.println("Application accepted");
		else
			throw new CustomException("Application rejected");

	}
	
	public static void main(String[] args)
	{
		try 
		{

			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter the number of income sources: ");
			int numSources = scanner.nextInt();

			int TotalIncome = 0;
			int incomes[] = new int[numSources];
			for (int i=0; i < numSources; i++) 
			{
				System.out.print("Enter income for source " + (i+1) + ": ");
				incomes[i] = scanner.nextInt();
			}
			
			for(int i=0; i < incomes.length; i++ )
			{
				TotalIncome = TotalIncome + incomes[i];
			}
				
			System.out.println("your family total income is:"+TotalIncome);
			validate(TotalIncome);
			
			scanner.close();

		} 
		
		catch (CustomException e) 
		{
			System.out.println("Exception" + e);

		}

	}

}
