//Program to create a thread by implementing Runnable interface 

package corejava;

public class ThreadDemo_Runnable implements Runnable 
{

	@Override
	public void run()
	{
		try
		{
			System.out.println("Thread : " + Thread.currentThread().getPriority());
			System.out.println("Thread entering sleep mode");
			Thread.sleep(3000);
			System.out.println("Name of the thread : " + Thread.currentThread().getName());
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) 
	{
		ThreadDemo_Runnable td = new ThreadDemo_Runnable();
		Thread t = new Thread(td,"ThreadDemo_RunnableObject");
		t.start();

	}

}
