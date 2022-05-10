package Assignment;

import java.util.Scanner;

public class ArrayContains {
	public static void checkvalue(int[] num,int check) {
		int[] d = num;
		int c = check;
		boolean e = false;
		for(int i=0;i<num.length;i++){
			if(d[i]==c) {
				e=true;
			}
		}
		if(e==true) {
			System.out.println("the given number is present");
		}else {
			System.out.println("the given number is absent");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[],size,check;
		Scanner user = new Scanner(System.in);
		System.out.println("enter array size: ");
		size = user.nextInt();
		num = new int[size];
		System.out.println("enter array elements");
		for(int i=0; i<num.length; i++) {
			num[i] = user.nextInt();
		}
		check = user.nextInt();
		ArrayContains.checkvalue(num, check);
	}

}
