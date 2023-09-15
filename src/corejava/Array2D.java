package corejava;

public class Array2D
{
	public static void main(String[] args) 
	{
		int a [][] = {{1, 2, 3}, {4, 5, 6}, {4, 5, 6}};
		int b [][] = {{1, 1, 1}, {2, 2, 2}, {1, 1, 1}};
		int i,j;
		
		//Printing matrices
		System.out.println("The given 2D array a is :");
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("The given 2D array b is :");
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		//Addition of matrices
		System.out.println("The sum of 2D arrays a and b is : ");
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(a[i][j]+b[i][j] + " ");
			}
			System.out.println();
		}
		
		//Subtraction of matrices
		System.out.println("The difference of 2D arrays a and b is : ");
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(a[i][j]-b[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
