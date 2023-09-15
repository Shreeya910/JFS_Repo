package corejava;

public class EmployeeDemo 
{
	int empid;
	String empname;
	int salary;
	
	EmployeeDemo(int id, String name, int sal)
	{
		empid = id;
		empname = name;
		salary = sal;
	}
	
	void display()
	{
		System.out.println("Employee ID : " + empid);
		System.out.println("Employee name : " + empname);
		System.out.println("Employee salary : " + salary);
	}
	
	public static void main(String[] args)
	{
		EmployeeDemo emp1 = new EmployeeDemo(12342, "Shreeya", 100000);
		emp1.display();
	}

}
