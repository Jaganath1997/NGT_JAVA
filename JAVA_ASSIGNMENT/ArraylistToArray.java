package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		Integer[] a = new Integer[l.size()];
		l.toArray(a);
		for(int b:a) {
			System.out.println(b);
		}
		List l1 = Arrays.asList(a);
		System.out.println(l1);
	}

}
