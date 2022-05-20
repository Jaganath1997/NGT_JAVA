package Assignment;

import java.util.Scanner;

public class VowelAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		str=str.toLowerCase();
		str = str.replaceAll("\\s", "");
		char ch[]=str.toCharArray();
		int vc = 0, cc = 0;
		for(int i=0;i<str.length();i++) {
			if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u' ) {
				vc++;
			}else {
				cc++;
			}
		}
		System.out.println("the vowel count is: "+ vc);
		System.out.println("the consonant count is: "+ cc);
	}

}
