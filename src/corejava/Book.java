package corejava;

public class Book
{
	Integer bid;
	String bname;
	Integer bcost;
	
	//Parameterised constructor
	public Book(Integer bid, String bname, Integer bcost)
	{
		super();
		this.bid = bid;
		this.bname = bname;
		this.bcost = bcost;
	}
	
	public String toString()
	{
		return "Book [bid = " + bid + ", bname = " + bname +  ", bcost = " + bcost + "]\n";
	}
	
} 

