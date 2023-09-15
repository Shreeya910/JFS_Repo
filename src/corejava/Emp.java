package corejava;

public class Emp 
{
	int id;
	String name;
	Address add;
	
	public Emp(int id, String name, Address add)
	{
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	void print()
	{
		System.out.println("Employee details : " + id + ", " + name);
		System.out.println("Address : " + add.plotno + ", " + add.city + ", " + add.state + ", " + add.pincode + ".");
	}
	
	public static void main(String args[])
	{
		Address add1 = new Address(135, "Warangal", "Telangana", 506002);
		Emp e = new Emp(1232, "Shreeya", add1);
		e.print();
	}

}
