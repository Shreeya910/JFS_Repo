//Program to create a thread by extending Thread class

package corejava;

public class ThreadDemo extends Thread 
{

	public void run()
	{
		try
		{
			System.out.println(currentThread().getName());
			System.out.println("Thread is running " + Thread.currentThread().getPriority());
			Thread.sleep(1000);
		}
		
		catch(InterruptedException e)
		{
			System.out.println("Thread Interrupted");
		}
		
	}
	
	public static void main(String[] args)
	{
		for (int i=0; i<=5; i++)
		{
			ThreadDemo td = new ThreadDemo();
			td.start();
		}
		for (int i=0; i<=5; i++)
		{
			try
			{
				Thread t = new Thread(currentThread());
				System.out.println(currentThread().getName() + i);
				Thread.sleep(1000);
			}
			
			catch(InterruptedException e)
			{
				System.out.println("Thread Interrupted : " + e);
			}
			
		}
		
	}

}
