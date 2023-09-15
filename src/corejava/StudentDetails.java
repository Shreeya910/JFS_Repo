package corejava;

public class StudentDetails
{
	Integer id;
	String name;
	String branch;
	Integer feeDue;
	
	public StudentDetails(Integer id, String name, String branch, Integer feeDue) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.feeDue = feeDue;
	}
	
	public String toString()
	{
		return "Details [ id = " + id + ", name = " + name + ", branch = " + branch + ", feeDue = " + feeDue + "]\n";
	}
	
}
