package corejava;

public class ArrayDemo
{

	public static void main(String[] args)
	{
		int arr[] = new int[5];
		arr[0] = 6;
		arr[1] = 7;
		arr[2] = 5;
		arr[3] = 4;
		arr[4] = 2;
		
		int i, sum = 0;
		for (i=0; i<arr.length; i++)
		{
			sum = sum+arr[i];
		}
		System.out.println("Sum of the elements of the array is : " + sum);
		
		int temp = arr[0];
		for(i=0; i<arr.length; i++)
		{
			if (temp<arr[i])
				temp = arr[i];
			
		}
		System.out.println("The greatest number of the array is : " + temp);
		
		temp = arr[0];
		for(i=0; i<arr.length; i++)
		{
			if (temp>arr[i])
				temp = arr[i];
			
		}
		System.out.println("The smallest number of the array is : " + temp);

	}

}
