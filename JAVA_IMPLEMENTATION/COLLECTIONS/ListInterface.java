package basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection value = new ArrayList();
		value.add(11);
		value.add(15);
		value.add(10);
		Iterator it = value.iterator();
		//printing the value one by one in list
		//hasnext - used to check the next value is present or not
		//next - used to get the single value from list
		//index no not supported
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
