package corejava;

public class Figure
{
	//int side1, side2;
	//float radius;
	
	void calArea(int side1)
	{
		System.out.println("Area of square = " + (4*side1));
	}
	
	void calArea(int side1, int side2)
	{
		System.out.println("Area of rectangle = " + (2*(side1+side2)));
	}
	
	void calArea(float radius)
	{
		System.out.println("Area of circle = " + (3.14*radius*radius));
	}
	
	public static void main(String[] args)
	{
		Figure square = new Figure();
		square.calArea(4);
		
		Figure rectangle = new Figure();
		rectangle.calArea(4,6);
	
		Figure circle = new Figure();
		circle.calArea(2.0f);
	}

}
