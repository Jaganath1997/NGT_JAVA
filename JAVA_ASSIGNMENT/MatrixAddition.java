package Assignment;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rows = 2, columns = 3;
	        int[][] Matrix_A = { 
				        		{1, 2, 3}, 
				        		{4, 5, 6} 
				        		};
	        int[][] Matrix_B = { 
	        					{3, 2, 1}, 
	        					{6, 5, 4} 
	        					};

	        int[][] sum = new int[rows][columns];
	        for(int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                sum[i][j] = Matrix_A[i][j] + Matrix_B[i][j];
	            }
	        }
	        System.out.println("Sum of two matrices is: ");
	        for(int[] row : sum) {
	            for (int column : row) {
	                System.out.print(column + "     ");
	            }
	            System.out.println();
	        }
	}

}
