package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
        int[] frequency = new int[str.length()];  
        char stoc[] = str.toCharArray();  
        Arrays.sort(stoc); 
        for(int i = 0; i <str.length(); i++) {  
            frequency[i] = 1;  
            for(int j = i+1; j <str.length(); j++) {  
                if(stoc[i] == stoc[j]) {  
                    frequency[i]++;   
                    stoc[j] = '0';  
                }  
            }  
        } 
        System.out.println("Characters and frequencies");  
        for(int i = 0; i <frequency.length; i++) {  
            if(stoc[i] != ' ' && stoc[i] != '0')  
                System.out.println(stoc[i] + "-" + frequency[i]);  
        }  
	}

}
