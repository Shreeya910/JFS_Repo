package corejava;

public class Circle2 implements Shape
{
	float radius;
	public Circle2(float radius) {
		super();
		this.radius = radius;
	}
         
	public void area() 
	{
		float area = pi * radius * radius;
		System.out.println("Area of circle : " + area);
	}

	public void perimeter()
	{
		float perimeter = 2 * pi * radius;
		System.out.println("Perimeter of circle : " + perimeter);
	}
	
	public static void main(String args[])
	{
		Circle2 c = new Circle2(3.0f);
		c.area();
		c.perimeter();
	}

}
