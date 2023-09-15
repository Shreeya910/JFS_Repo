package corejava;

import java.io.File;
import java.util.Scanner;

public class FileReader_Shreeya 
{

	public static void main(String[] args) 
	{
		try
		{
			File fr = new File("Shreeya.txt");
			Scanner sc = new Scanner(fr);
			while (sc.hasNextLine())
			{
				String str = sc.nextLine();
				System.out.println(str);
			}
			sc.close();
			
		}
		
		catch(Exception e)
		{
			System.out.println("Exception raised");
		}
		
		

	}

}
