package corejava;

import java.io.Serializable;

class Student_Bean implements Serializable
{
	private Integer sid;
	private String sname;
	private String[] csubjects;
	
	Student_Bean()
	{
		System.out.println("New student object is created");
		System.out.println();
	}
	
	public Integer getSid()
	{
		return sid;
	}
	
	public String getSname()
	{
		return sname;
	}
	
	public String[] setCsubjects()
	{
		return csubjects;
	}
	
	public void setSid(Integer sid)
	{
		this.sid = sid;
	}
	
	public void setSname(String sname)
	{
		this.sname = sname;
	}
	
	public void setCsubjects(String[] csubjects)
	{
		this.csubjects = csubjects;
	}
	
}

public class BeanStudentDemo 
{

	public static void main(String[] args)
	{
		Student_Bean s1 = new Student_Bean();
		String[] subjects = {"Maths", "Electronics", "Computers"};
		s1.setSid(1101);
		s1.setSname("Camilla");
		s1.setCsubjects(subjects);
		
		System.out.println("Student Id   : "+ s1.getSid());
		System.out.println("Student Name : "+ s1.getSname());
		System.out.println();
		System.out.println("Student Course Subjects");
		for(int i=0; i<subjects.length; i++)
			System.out.println("Subject " + (i+1) + " : " + subjects[i]);

	}

}
