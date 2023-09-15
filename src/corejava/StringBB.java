package corejava;

public class StringBB
{

	public static void main(String[] args)
	{
		//String Buffer - synchronised
		StringBuffer strb1 = new StringBuffer("Welcome");
		System.out.println(strb1);
		System.out.println(strb1.capacity());
		System.out.println(strb1.charAt(3));
		System.out.println(strb1.hashCode());
		
		//String buffer function
		StringBuffer strb2 = new StringBuffer("Welcome Shreeya");
		System.out.println(strb2);
		System.out.println(strb2.compareTo(strb1));
		System.out.println(strb2.equals(strb1));
		System.out.println(strb2.length());
		System.out.println(strb2.hashCode());
		System.out.println(strb2.append('a'));
		System.out.println(strb2.hashCode());
		System.out.println();
		
		//String Builder - asynchronised (not thread safe)
		StringBuilder sb1 = new StringBuilder("Java Full Stack"); 
		StringBuilder sb2 = new StringBuilder(30);
		sb2.append("Python");
		
		//String Builder functions
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		System.out.println(sb1.hashCode());
		System.out.println(sb1.length());
		System.out.println(sb1.delete(5, 10));
		System.out.println(sb1.hashCode());
		
	}

}
