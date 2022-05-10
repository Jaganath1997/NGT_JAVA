package Assignment;

import java.util.Arrays;

public class ArrayConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3};
		int b[] = {3,2,1};
		int a1 = a.length;
        int b1 = b.length;
        int[] con = new int[a1 + b1];

        System.arraycopy(a, 0, con, 0, a1);
        System.arraycopy(b, 0, con, a1, b1);

        System.out.println(Arrays.toString(con));
	}

}
