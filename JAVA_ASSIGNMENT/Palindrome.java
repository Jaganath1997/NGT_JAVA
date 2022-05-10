package Assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pal = "level",reverse="";
		for(int i = pal.length()-1; i>=0; i--)
		{
			reverse=reverse + pal.charAt(i);
		}
		if(pal.equals(reverse))
		{
			System.out.println(pal +" is a palindrome");
		}
		else
		{
			System.out.println(pal +" is not a palindrome");
		}
	}

}
