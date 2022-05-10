package Assignment;

import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[],size;
		Scanner user = new Scanner(System.in);
		System.out.println("enter array size: ");
		size = user.nextInt();
		num = new int[size];
		System.out.println("enter array elements");
		for(int i=0; i<num.length; i++) {
			num[i] = user.nextInt();
		}
		int lar = num[0];
		for(int j=0;j<num.length; j++) {
			if(lar<num[j]) {
				lar=num[j];
			}
		}
		System.out.println("largest number in an array is : "+ lar);
	}

}
