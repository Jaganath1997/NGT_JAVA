package Assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("enter the date:");
		Scanner sc =new Scanner(System.in);
		String date1 = sc.nextLine();
		Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
		System.out.println("the date got through string: "+date1);
		System.out.println("the date after formatting: "+date2);
	}

}
