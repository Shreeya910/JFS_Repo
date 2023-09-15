package corejava;

import java.io.FileWriter;

public class FileWriter_Shreeya 
{

	public static void main(String[] args) 
	{
		try
		{
			FileWriter fw = new FileWriter("Shreeya.txt");
			fw.write("Name    : Shreeya \nCourse  : Java Full stack with Angular \nBatch Number : ANP-C6005 \nStudent ID : AF0328292");
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
