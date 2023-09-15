package corejava;

public class Circle 
{
	double radius;
	String color;
	
	Circle()
	{
		radius = 1.0;
		color = "red";
	}
	
	Circle (double r, String c)
	{
		radius = r;
		color = c;
	}
	
	void getArea()
	{
		System.out.println("The area of "+color+" cirlce is "+ (3.14*radius*radius));
	}
	
	public static void main(String[] args) 
	{
		Circle c1 = new Circle();
		c1.getArea();
		Circle c2 = new Circle(7.0, "green");
		c2.getArea();
	}

}
