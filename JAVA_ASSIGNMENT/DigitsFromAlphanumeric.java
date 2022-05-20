package Assignment;

import java.util.Scanner;

public class DigitsFromAlphanumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String num = str.replaceAll("[a-z]","");
        System.out.println(num);  
	}

}
