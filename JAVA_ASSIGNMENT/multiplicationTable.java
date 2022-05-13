package Assignment;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a;
        Scanner s =new Scanner(System.in);
        System.out.println("enter a number");
        a=s.nextInt();
        System.out.println("mulitplication table of :" + a);
        for(int i=1;i<=10;i++) {
        	System.out.println(i+"*"+a+"="+ i*a);
        }
	}

}
