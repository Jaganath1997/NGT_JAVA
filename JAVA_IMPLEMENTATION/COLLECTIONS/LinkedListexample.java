package basics;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkli=new LinkedList<String>();  
		linkli.add("car");  
		linkli.add("bus");  
		linkli.add("truck");  
		linkli.add("bike");  
		  
		Iterator<String> itr=linkli.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
