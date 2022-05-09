package basics;

public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int salary[][]= {
        		{100,102,103},
        		{105,106,107},
        		{108,109,110}
        };
        for (int i=0;i<salary.length;i++) {
        	for(int j=0;j<salary[i].length;j++) {
        		System.out.println(salary[i][j]);
        	}
        }
	}
}
