package basics;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque=new ArrayDeque<String>();  
		//we can use add as well as offer to enter element into the list
	    deque.offer("abc");  
	    deque.offer("def");  
	    deque.add("ghi"); 
	    //element will be added in first position
	    deque.offerFirst("jkl");   
	    System.out.println(deque); 
	    //last element will be removed
	    deque.pollLast();  
	    System.out.println(deque); 
	}

}
