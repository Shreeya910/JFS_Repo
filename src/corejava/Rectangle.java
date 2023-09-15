package corejava;

public class Rectangle implements Shape 
{
	public Rectangle(int length, int breadth) 
	{
		super();
		this.length = length;
		this.breadth = breadth;
	}

	int length, breadth;
	public void area()
	{
		int area = (length * breadth);
		System.out.println("Area of rectangle is : " + area);
	}

	public void perimeter()
	{
		int perimeter = 2*(length + breadth);
		System.out.println("Perimeter of rectangle : " + perimeter);
	}

	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(25, 30);
		r.area();
		r.perimeter();
	}
}
