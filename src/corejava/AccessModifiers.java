package corejava;

class Data
{
	public int a=100;
	private int b=200;
	protected int c=300;
	
	protected void returnb()
	{
		System.out.println(b);
	}
}

public class AccessModifiers
{	
	public static void main(String[] args) 
	{
		Data d = new Data();
		System.out.println(d.a);
		d.returnb();
		System.out.println(d.c);

	}

}
