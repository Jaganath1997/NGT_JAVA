package Assignment;

public class ZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = {1, 0, 7, 8, 6, 4, 0, 0} ;
        int c= 0; 
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[c++] = a[i];
            }
        }
        for (int i = c; i < a.length; i++) {
            a[i] = 0;
        }
        for(int b :a) {
        System.out.print(" "+b);
        }
	}

}
