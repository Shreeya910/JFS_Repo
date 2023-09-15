package corejava;

import java.util.Arrays;

public class ArrayFunctions
{

	public static void main(String[] args) 
	{
		int arr[] = {2,7,3,9,10,4,6};
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		//Binary Search
		//Sorted array - 2, 3, 4, 6, 7, 9, 10   arr[3]=6
		//int middle = arr.length/2;
		
		int num= 9;
		System.out.println("\nIndex of 9 = " + Arrays.binarySearch(arr, num));
	}

}
