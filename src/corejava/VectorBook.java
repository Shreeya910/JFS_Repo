package corejava;

import java.util.List;
import java.util.Vector;

public class VectorBook
{

	public static void main(String[] args)
	{
		List<Book> booklist = new Vector<Book>();
		booklist.add(new Book(1, "C", 1000));
		booklist.add(new Book(2, "Java", 2000));
		booklist.add(new Book(3, "Python", 3000));
		booklist.add(new Book(4, "Oracle", 4000));
		
		System.out.println(booklist);
		

	}

}
