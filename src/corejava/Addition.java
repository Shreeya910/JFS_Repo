package corejava;

public class Addition
{
	int a,b,c;
	float x,y;
	void sum(int d, int e)
	{
		a=d; b=e; 
		System.out.println("a+b = " +(a+b));
	}
	void sum(int d, int e, int f)
	{
		a=d; b=e; c=f;
		System.out.println("a+b+c = " +(a+b+c));
	}
	void sum(float d, float e)
	{
		x=d; y=e;
		System.out.println("x+y =" +(x+y));
	}
	
	public static void main(String[] args) 
	{
		Addition a = new Addition();
		a.sum(3, 4);
		a.sum(6, 7, 8);
		a.sum(1.0f, 2.0f);
	}

}
