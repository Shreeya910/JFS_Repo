//Program to demonstrate inter-thread communication in online shopping application

package corejava;

class OnlineTransaction
{
	int amountCredited = 0;
	
	//Synchronized method to confirm order
	synchronized void confirmOrder()
	{
		if(amountCredited<1000)
		{
			try
			{
				System.out.println("Waiting for the payment.");
				Thread.sleep(500);
				System.out.println("Please complete the payment to confirm order.\n");
				Thread.sleep(500);
				wait();
			}
			
			catch(Exception e)
			{
				System.out.println(e);	
			}
			
		}
				
	}
	
	//Synchronized method for payment processing
	synchronized void payment(int amt)
	{
		try
		{
			amountCredited = amt;
			if(amountCredited==1000)
			{
				System.out.println("\nTransaction initiated.");
				Thread.sleep(500);
				System.out.print("Processing transaction");
				Thread.sleep(1000); 
				
				int i=0;
				while(i<5)
				{
					System.out.print(".");
					Thread.sleep(1000);
					i++;
				}
				//Thread.sleep(5000);
				System.out.println();
				System.out.println("Transaction successful.");
				Thread.sleep(500);
				System.out.println("Amount debited : " + amt);
				Thread.sleep(500);
				System.out.println("Order confirmed.");
			}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		notify();
	}
	
}

public class InterThread_OnlineShopping 
{
	public static void main(String[] args)
	{
		
		final OnlineTransaction ot = new OnlineTransaction();
		
		new Thread()
		{
			public void run()
			{
				ot.confirmOrder();
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				ot.payment(1000);
			}
		}.start();
		
	}

}
