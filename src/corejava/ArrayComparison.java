package corejava;

public class ArrayComparison 
{

	public static void main(String[] args)
	{ 
		int a[]= {1, 2, 5, 6};
		int b[]= {2, 3, 8, 5};
		
		boolean isEqual = true;
		
		if (a.length==b.length)
		{
			for(int i=0; i<a.length; i++)
			{
				if(a[i]!=b[i]) 
				{
					isEqual = false;
					break;
				}
			}
		}
		else 
		{
			isEqual = false;
		}
		
		
		if(isEqual)
			System.out.println("a and b are equal");
		else
			System.out.println("a and b are not equal");

	}

}
