package corejava;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Course_Bean implements Serializable
{
	private Integer cid;
	private String cname;
	private List<String>subjects;
	
	public Integer getCid()
	{
		return cid;
	}
	
	public void setCid(Integer cid)
	{
		this.cid = cid;
	}
	
	public String getCname()
	{
		return cname;
	}
	
	public void setCname(String cname)
	{
		this.cname = cname;
	}
	
	public List<String> getSubjects() 
	{
		return subjects;
	}
	
	public void setSubjects(List<String> subjects)
	{
		this.subjects = subjects;
	}
	
}

public class BeanCourseDemo
{

	public static void main(String[] args)
	{
		Course_Bean degree= new Course_Bean();
		degree.setCid(512);
		degree.setCname("BSc");
		List<String> subjects1 = new ArrayList<String>();
		subjects1.add("English");
		subjects1.add("Mathematics");
		subjects1.add("Mechanics");
		subjects1.add("Physics");
		degree.setSubjects(subjects1);
		
		System.out.println(degree.getCid() + " " + degree.getCname() + " " + degree.getSubjects());
		
		degree.setCid(567);
		degree.setCname("Btech");
		List<String> subjects2 = new ArrayList<String>();
		subjects2.add("C");
		subjects2.add("Mathematics");
		subjects2.add("Java");
		subjects2.add("Python");
		degree.setSubjects(subjects2);
		
		System.out.println(degree.getCid() + " " + degree.getCname() + " " + degree.getSubjects());
		
	}

}
