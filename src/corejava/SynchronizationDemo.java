//Demo Program implementing synchronization

package corejava;

class Table
{
	synchronized void printTable(int n)
	{
		for(int i=1; i<=10; i++)
		{
			try 
			{
				System.out.println(n*i);
				Thread.sleep(500);
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}	
		}
	}
}

class ThreadDemo1 extends Thread
{
	//Aggregation
	Table t;
	ThreadDemo1(Table t)
	{
		this.t = t;
	}
	
	public void run()
	{
		t.printTable(10);
	}
}

class ThreadDemo2 extends Thread
{
	//Aggregation
	Table t;
	ThreadDemo2(Table t)
	{
		this.t = t;
	}
	
	public void run()
	{
		t.printTable(20);
	}
}

public class SynchronizationDemo 
{
	public static void main(String[] args) 
	{
		Table t1 = new Table();
		ThreadDemo1 td1 = new ThreadDemo1(t1);
		td1 .start();
		ThreadDemo2 td2 = new ThreadDemo2(t1);
		td2.start();
	}

}
