package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> l1 = new ArrayList<>();
		l1.add('j');
		l1.add('a');
		l1.add('g');
		l1.add('a');
		l1.add('n');
		System.out.println(l1);
		char [] arr = new char [l1.size()];
		for(int i=0; i<arr.length; i++) {
			arr[i]=l1.get(i);
		}
		System.out.println("list to array : ");
		System.out.println(arr);
		
		List<Character> l2 = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			l2.add(arr[i]);
	    }
		System.out.println("array to list : ");
		System.out.println(l2);
	}
}
