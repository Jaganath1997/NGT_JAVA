package Assignment;

public class CheckAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alp = '9';
	      
        if( (alp >= 'a' && alp <= 'z') || (alp >= 'A' && alp <= 'Z'))
            System.out.println(alp + " is an alphabet.");
        else
            System.out.println(alp + " is not an alphabet.");
	}

}
