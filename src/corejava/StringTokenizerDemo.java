package corejava;

import java.util.StringTokenizer;

public class StringTokenizerDemo 
{

	public static void main(String[] args)
	{
		StringTokenizer st1 = new StringTokenizer("Hello World");
		StringTokenizer st2 = new StringTokenizer("Welcome, Shreeya", ",");
		StringTokenizer st3 = new StringTokenizer("java Full Stack", " ", true);
		StringTokenizer st4 = new StringTokenizer("Hello@World@", "@", false);
		
		System.out.println(st1.countTokens());
		System.out.println(st2.countTokens());
		System.out.println(st3.countTokens());
		System.out.println(st4.countTokens());
	}

}
