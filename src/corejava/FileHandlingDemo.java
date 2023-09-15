package corejava;

import java.io.File;

public class FileHandlingDemo 
{

	public static void main(String[] args)
	{
		try 
		{
			File f1 = new File("First File.txt");
			if(f1.createNewFile())
			{
				System.out.println("New File Created : " + f1.getName());
			}
			else
			{
				System.out.println("File already exists");
			}
		}
		
		catch(Exception e)
		{
			System.out.println("Exception occurred" + e);
		}

	}

}
