package Assignment;

import java.util.Scanner;

public class NonRepeatingCharc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for (int i = 0;i < str.length();i++) 
	  	{
	  		boolean result = true;
	  		for (int j=0; j<str.length(); j++) {
	  			if (i!=j && str.charAt(i) == str.charAt(j)) {
	  				result = false;
	  				break;
	  			}
	  	    }
	  		if (result) {
	  			System.out.println("the first non repeated character is: " + str.charAt(i));
	  			break;
	  		}
	  	}
	}
}
