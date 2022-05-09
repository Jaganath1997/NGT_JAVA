package basics;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1, s2, s3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string values :");
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        //concatenation
        s3 = s1.concat(s2);//s3=s1+s2;
        System.out.println("concatenation of s1 and s2: " + s3);
        //concatenation is achieved by
        System.out.println(s1+s2);
        //length of the string
        int l1=s3.length();
        System.out.println("lenght of the string is : "+ l1);
        //to Upper case
        s3= s3.toUpperCase();
        System.out.println(s3);
        }

}
