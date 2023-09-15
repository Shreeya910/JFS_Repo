package corejava;

import java.util.Scanner;

public class ExampleProgram1
{

	public static void main(String[] args) 
	{
		int weight, cost=0, count=0;
		System.out.println("Enter the weight of the parcel : ");
		Scanner sc = new Scanner(System.in);
		weight = sc.nextInt();
		sc.close();
		if (weight<1000)
		{
			cost = 15;
			System.out.println("cost of delivery is : " + cost);
		}
		else if (weight>1000)
		{
			weight = weight - 1000;
			cost = 15;
			while(weight>1)
			{
				weight = weight - 500;
				count++;
			}
			
			cost = cost + (count*8);
			System.out.println("cost of delivery is : " + cost);
		}
		

	}

}
