package corejava;

public class ArrayRotation
{
	
	public static void main(String[] args)
	{
		
		int a[] = {1, 2, 3, 4, 5, 6};
		int temp1, temp2, i;
		
		//Cyclic rotation using two temporary variables
		temp1 = a[0];
		for(i=1; i<a.length; i++)
		{
			temp2 = a[i];
			a[i] = temp1;
			temp1 = temp2;
		}
		a[0] = temp1;
		
		System.out.println("Cyclic rotation using two temp variables:");
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		
		//Cyclic rotation using one temporary variable
		temp1 = a[a.length-1];
		for(i=a.length-1; i>0; i--)
		{
			a[i] = a[i-1];
		}
		a[0] = temp1;
		
		System.out.println("\nCyclic rotation using one temp variable:");
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		
	}
	
}
