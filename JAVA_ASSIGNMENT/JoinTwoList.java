package Assignment;

import java.util.ArrayList;
import java.util.List;

public class JoinTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<String>();
	    l1.add("A");
	    l1.add("B");
	    l1.add("C");
	    
	    List<String> l2 = new ArrayList<String>();
	    l2.add("X");
	    l2.add("Y");
	    l2.add("Z");
	    
	    List<String> Result = new ArrayList<String>();
	    
	    Result.addAll(l1);
	    Result.addAll(l2);
	    
	    System.out.println("List1: " + l1);
	    System.out.println("List2: " + l2);
	    System.out.println("the joined list is : " + Result);
	}

}
