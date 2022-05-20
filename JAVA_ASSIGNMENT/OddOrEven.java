package Assignment;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to check:");
        n = s.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("The given number is Even ");
        }
        else
        {
            System.out.println("The given number is Odd ");
	    }
	}
}
