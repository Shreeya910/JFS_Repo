package corejava;

public class Array2DMultiplication 
{

	public static void main(String[] args) 
	{
		int a[][] = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
		int b[][] = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
		int p[][] = new int[3][3];
		int i, j, k;
		
		//Printing matrices
		
		System.out.println("The given matrix a is :");
		System.out.println();
		
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
			System.out.println();
		}
		
		System.out.println("The given matrix b is :");
		System.out.println();
		
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
			System.out.println();
		}
		
		
		//Product of matrices
		for(k=0; k<3; k++)
		{
			for(i=0; i<3; i++)
			{
				for(j=0; j<3; j++)
				{
					p[i][k] = p[i][k] + (a[i][j] * b[j][i]);
					
				}
			}
		}
		
		//Printing the product of matrices
		System.out.println("The product of matrices a & b is :");
		System.out.println();
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(p[i][j] + "\t");
				
			}
			System.out.println();
			System.out.println();
		}
		
	}

}
