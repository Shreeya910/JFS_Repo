//Program to demonstrate synchronized method for printing fibonacci series
package corejava;

class Fibonacci
{
	synchronized void printSeries(int n)
	{
		try 
		{
			int n1=0, n2=1;
			System.out.println("\nFirst " + n + " terms of Fibonacci series is : ");
			System.out.print(n1);
			System.out.print(", " +  n2);

			for(int i=2; i<n; i++)
			{
				int n3=n2+n1;
				n1=n2;
				n2=n3;
				System.out.print(", " + n3);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Thread_Demo1 extends Thread
{
	//Aggregation
	Fibonacci f;
	Thread_Demo1(Fibonacci f)
	{
		this.f = f;
	}
	
	public void run()
	{
		f.printSeries(10);
	}
}

class Thread_Demo2 extends Thread
{
	Fibonacci f;
	Thread_Demo2(Fibonacci f)
	{
		this.f = f;
	}
	
	public void run()
	{
		f.printSeries(15);
	}
}

public class Sync_Fibonacci 
{

	public static void main(String[] args) 
	{
		Fibonacci f1 = new Fibonacci();
		Thread_Demo1 td1 = new Thread_Demo1(f1);
		td1 .start();
		Thread_Demo2 td2 = new Thread_Demo2(f1);
		td2.start();

	}

}
