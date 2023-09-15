package corejava;

import java.io.File;
import java.util.Scanner;

public class FileReaderDemo 
{

	public static void main(String[] args)
	{
		
		try
		{
			File fr = new File("First File.txt");
			Scanner sc = new Scanner(fr);
			while (sc.hasNextLine())
			{
				String str = sc.nextLine();
				System.out.println(str);
			}
			
		}
		
		catch(Exception e)
		{
			System.out.println("Exception raised");
		}

	}

}
