package Assignment;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" enter the size");
		int n =s.nextInt();
		Fibonacci(n);
		s.close();
	}
	static void Fibonacci(int n)
	{
	int a=0, b=1,c;
	System.out.print("series : "+ a+","+ b );
	for(int i=2;i<n;i++)
	{
		c= a+b;
		System.out.print(","+c);
		a=b;
		b=c;
	}
	}

}
