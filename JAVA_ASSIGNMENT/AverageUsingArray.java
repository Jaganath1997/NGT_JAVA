package Assignment;

public class AverageUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a = {10, 20, 30, 40, 50, 60};
        int  total=0;
        for(int e :a) {
        	total = total+e;
        }
        int avg = total/a.length;
        System.out.println(avg);
	}

}
