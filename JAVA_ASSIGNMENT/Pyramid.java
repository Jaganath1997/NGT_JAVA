package Assignment;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5, k = 0;

	    for (int i = 1; i <= rows; ++i, k = 0) {
	      for (int sp = 1; sp <= rows - i; ++sp) {
	        System.out.print("  ");
	      }

	      while (k != 2 * i - 1) {
	        System.out.print("* ");
	        ++k;
	      }

	      System.out.println();
	    }
	  }  
}
