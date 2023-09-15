package corejava;

public class BoxUnboxDemo 
{

	public static void main(String[] args)
	{
		int a = 35;
		
		//Boxing : Primitive datatype to object
		@SuppressWarnings("removal")
		Integer i1 = new Integer(a);
		System.out.println("a=" +a+", i1="+i1);
		
		//Unboxing : Object to primitive datatype
		int b=i1;
		System.out.println("b="+b);
		
		//using Integer method for boxing
		int c=40;
		Integer i2 = Integer.valueOf(c);
		System.out.println("c="+c+", i2="+i2);
		
		//using Integer method for unboxing
		int d=i2.intValue();
		System.out.println("d="+d);
	}

}
 