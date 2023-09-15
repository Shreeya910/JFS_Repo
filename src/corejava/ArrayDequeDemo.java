package corejava;

import java.util.ArrayDeque;

public class ArrayDequeDemo
{
	public static void main(String[] args)
	{
		ArrayDeque<Book> adq = new ArrayDeque<Book>();
		adq.add(new Book(1, "C", 1000));
		adq.add(new Book(2, "Java", 2000));
		adq.add(new Book(3, "Python", 3000));
		adq.add(new Book(4, "Oracle", 4000));
		
		adq.addFirst(new Book(11, "Let Us C", 1500));
		adq.addLast(new Book(12, "Advanced Java", 3000));
		
		System.out.println(adq);
		System.out.println(adq.removeFirst());
		System.out.println(adq.removeLast());
		System.out.println(adq);
		
		
	}
}
