package Assignment;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int s1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number :\t");
        s1 = s.nextInt();
        boolean prime = true;
        for(int i=2; i<s1; i++) {
        	if(s1%i==0) {
        		prime=false;
        		break;
        	}
        }
        if(prime) {
        	System.out.println(s1 +" is a prime number");
        }else {
        	System.out.println(s1 +" is not a prime number");
        }
	}   
}
