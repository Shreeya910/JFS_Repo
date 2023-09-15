package corejava;

import java.util.Scanner;

public class StringIsPalindrome
{

	public static void main(String[] args)
	{
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		
		System.out.println("Length of the string is "+s1.length());
		s1 = s1.toLowerCase();
	
		boolean isPalindrome = true;
		
		for(int i=0, j=s1.length()-1; i<s1.length()&&j>=0; i++,j--)
		{
			if(s1.charAt(i)!=(s1.charAt(j)))
			{
				isPalindrome = false;
				break;	
			}
		}
		
		if (isPalindrome)
			System.out.println(s1 + " is a palindrome.");
		else 
			System.out.println(s1 + " is not a palindrome.");
		
		sc.close();
	}
	
}
