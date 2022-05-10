package Assignment;

public class CharToString {
	//method to convert character to string
	public String ctos(char c []) {
		   String cs = String.valueOf(c);
		   return cs;
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 []={'J','a','g','a','n','a','t','h'};
		System.out.println(c1);
		String stc = "capgemini";
        char[] c2 = stc.toCharArray();
        for (char c : c2) {
            System.out.print(c +", ");
	    }
	}
}
