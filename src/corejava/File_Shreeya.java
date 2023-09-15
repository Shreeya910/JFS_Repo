package corejava;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class File_Shreeya 
{

	public static void main(String[] args)
	{
		try 
		{
			File f1 = new File("Shreeya_FileHandling.txt");
			if(f1.createNewFile())
			{
				System.out.println("New File Created : " + f1.getName());
				System.out.println();
			}
			else
			{
				System.out.println("File already exists");
				System.out.println();
			}
		}
		
		catch (Exception e)
		{
			System.out.println("Exception occurred" + e);
			e.printStackTrace();
		}
		
		try
		{
			FileWriter fw = new FileWriter("Shreeya_FileHandling.txt");
			fw.write("Name    : Shreeya \nCourse  : Java Full stack with Angular \nBatch Number : ANP-C6005 \nStudent ID : AF0328292");
			fw.close();
			System.out.println("Successfully written into the file");
			System.out.println();
			
		}
		
		catch (Exception e)
		{
			System.out.println("Exception occurred" + e);
			e.printStackTrace();
		}
		
		
		try
		{
			File fr = new File("Shreeya_FileHandling.txt");
			Scanner sc = new Scanner(fr);
			while (sc.hasNextLine())
			{
				String str = sc.nextLine();
				System.out.println(str);
			}
			sc.close();
			
		}
		
		catch (Exception e)
		{
			System.out.println("Exception occurred" + e);
			e.printStackTrace();
		}
		
		
		
		
	}

}
