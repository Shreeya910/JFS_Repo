package corejava;

public class StringDemo
{

	public static void main(String[] args) 
	{
		String s1 = "Shreeya";
		System.out.println(s1);
		
		s1 = s1.toLowerCase();
		System.out.println(s1);
		
		String s2 = new String("Welcome!");
		System.out.println(s2);
		
		char c[] ={'j', 'a', 'v', 'a'};
		String s3 = new String(c);
		System.out.println(s3);
		
		String s4 = new String("Shreeya");
		System.out.println(s4);
		System.out.println(s1.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println();
		
		//String in-built methods
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.charAt(3));
		System.out.println(s1.concat(" Nalla"));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals("shreeya"));
		System.out.println(s1.lastIndexOf('e'));
		System.out.println(s1.replace('S', 's'));
		System.out.println();
		
		String st1 = " Web development course ";
		System.out.println(st1);
		System.out.println(st1.length());
		System.out.println(st1.trim());
		System.out.println(st1.trim().length());
		System.out.println(st1);
		System.out.println(st1.substring(5));
		System.out.println(st1.substring(5, 10));
		System.out.println();
		
	}

}
