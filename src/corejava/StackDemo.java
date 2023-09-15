package corejava;


import java.util.Stack;

public class StackDemo 
{

	public static void main(String[] args) 
	{
		Stack<Integer> st = new Stack<Integer>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		st.push(null);		//stack accepts null and duplicates
		
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.peek());
		
		st.add(60);
	
		System.out.println(st);
		System.out.println(st.peek());
		
		System.out.println();
		System.out.println(st.search(10));
		System.out.println(st.search(20));
		System.out.println(st.search(30));
		System.out.println(st.search(40));
		System.out.println(st.search(60));
		System.out.println(st.search(60));
		System.out.println(st.search(50));
		System.out.println(st.search(70));
	}

}
