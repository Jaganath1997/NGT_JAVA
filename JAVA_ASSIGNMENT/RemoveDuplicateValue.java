package Assignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char s[] = str.toCharArray();
		Set <Character> l1 = new HashSet<>();
		for(int i=0; i<s.length; i++) {
			l1.add(s[i]);
	    }
		System.out.println(l1);
	}

}
