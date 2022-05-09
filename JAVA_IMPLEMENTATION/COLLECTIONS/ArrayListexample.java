package basics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//syntax
        ArrayList<String> list = new ArrayList<>();
        list.add("tamilnadu");
        list.add("kerala");
        list.add("punjab");
        list.add("telungana");
        list.add(1,"maharastra");
        //print as array
        System.out.println(list);
        //print one by one
        System.out.println("using for loop :");
        for (String states:list) {
        	System.out.println(states);
        }
        System.out.println("using iterator :");
        Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
