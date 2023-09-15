package corejava;

public class Developer extends Employee 
{
	int salary;
	
	void devsalary()
	{
		System.out.println("Salary : " +salary);
	}
	
	public static void main(String args[])
	{
		Developer d = new Developer();
		
		d.empname = "Shreeya";
		d.empid = 11232;
		d.salary = 100000;
		
		d.empdetails();
		d.devsalary();
	}
}
