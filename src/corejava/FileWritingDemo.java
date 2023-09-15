package corejava;

import java.io.FileWriter;

public class FileWritingDemo 
{

	public static void main(String[] args)
	{
		
		try
		{
			FileWriter fw = new FileWriter("File Writer.txt");
			fw.write("Welcome to java programming");
			fw.close();
			System.out.println("Successfully written into the file");
			
		}
		
		catch (Exception e)
		{
			System.out.println("Exception occurred" + e);
			e.printStackTrace();
		}

		
	}

}
