package Assignment;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  int year;
	      System.out.println("Enter the Year: ");
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0)) {
	         System.out.println("Year is a leap year");
	      }
	      else {
	         System.out.println("Year is not a leap year");
	      }
	}

}
