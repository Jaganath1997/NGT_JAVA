package Assignment;

import java.util.Scanner;

public class ReverseUsingRecursion {
	
	public String recursion(String str1) {
		if(str1.isEmpty()) {
			System.out.println("the string is empty ");
			return str1;
		}else {
			return recursion(str1.substring(1))+str1.charAt(0); 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		Scanner sc= new Scanner(System.in);
		String  str = sc.nextLine();
		ReverseUsingRecursion obj = new ReverseUsingRecursion();
		String result = obj.recursion(str);
		System.out.println(result);
	}

}
