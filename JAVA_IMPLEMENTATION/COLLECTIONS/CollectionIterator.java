package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Collection value = new ArrayList();
		//index no not supported
		List value = new ArrayList();
		value.add(11);
		value.add(15);
		value.add(10);
		//list supporst index no also implements collection
		value.add(2, 12);
		Collections.sort(value);
		Collections.reverse(value);
		Collections.shuffle(value);
		//printing the value one by one in list
		//hasnext - used to check the next value is present or not
		//next - used to get the single value from list
		//using iterator
		Iterator it = value.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//for loop
		for (int i=0; i<value.size();i++) {
			System.out.println(value.get(i));
		}
		//enhanced for loop
		for(Object o : value) {
			System.out.println(o);
		}
	}

}
