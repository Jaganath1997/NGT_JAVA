package basics;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
		      int[] num = {0,1,2,3};
		      //statement to be checked
		      System.out.println(num[8]);		    
		} 
		catch (Exception e) 
		{
			  //exception caught
		      System.out.println("ArrayIndexOutOfBoundException");
		} 
		finally 
		{
			  //wheather exception occurs or not display finally block
		      System.out.println("End of the program.");
		}
	}

}
