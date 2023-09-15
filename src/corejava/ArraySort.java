package corejava;

//Bubble Sort
public class ArraySort 
{
	
	public static void main(String[] args) 
	{
		
		int arr[] = {91, 43, 21, 62, 11, 34, 87, 45, 29, 55};
		int i, j, temp;
		
		//Printing the given array and its length
		
		System.out.print("The given unsorted array  : ");
		
		for(i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
			
		}
		System.out.println("\nLength of the given array : " + arr.length);
		
		//Sorting array in ascending order
		for (i=0; i<arr.length; i++)
		{
			for(j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
		
		System.out.print("Sorted array in ascending order  : ");
		for(i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");

		}
		
		//Sorting array in descending order
		for (i=0; i<arr.length; i++)
		{
			for(j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
		
		System.out.print("\nSorted array in descending order : ");
		for(i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");

		}
		
	}
	
}
