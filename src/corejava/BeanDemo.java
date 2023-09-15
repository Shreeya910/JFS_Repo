package corejava;

import java.io.Serializable;

class Emp_Demo implements Serializable
{
	private Integer eid;
	private String ename;
	
	Emp_Demo()
	{
		System.out.println("New emp Object created");
		System.out.println();
	}
	
	public Integer getEid() 
	{
		return eid;
	}
	
	public String getEname()
	{
		return ename;
	}
	
	public void setEid(Integer eid)
	{
		this.eid = eid;
	}
	
	public void setEname(String ename)
	{
		this.ename = ename;
	}
	
}

public class BeanDemo
{
	public static void main(String[] args) 
	{
		Emp_Demo e = new Emp_Demo();
		e.setEid(112);
		e.setEname("Shreeya");
		System.out.println("Emp Id : " + e.getEid());
		System.out.println("Emp Name : " + e.getEname());
		
	}
}
