package basics;

public class IfElse 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//if
		int mark=480;
		if (mark>450) 
		{
			System.out.println("eligible for scholarship");
		}
        //if-else
		if (mark>450) 
		{
			System.out.println("eligible for scholarship");
		}
		else 
		{
			System.out.println("not eligible for scholarship");
		}
		//nested if
	    if (mark>450) 
	    {
	    	if(mark>=480 && mark<490) 
	    	{
	    		System.out.println("eligible for 75% scholarship");
	    	}
	    	else 
	    	{
	    		System.out.println("refer the breakage");
	    	}
	    }
	    else 
	    {
	    	System.out.println("not eligible for scholarship");
	    }
	    //ladder statements if else if
	     if(mark>=480&&mark<490) {
	    	 System.out.println("eligible for scholarship 75%");
	     }
	     else if(mark>490) {
	    	 System.out.println("eligible for scholarship 85%");
	     }
	     else if(mark>495) {
	    	 System.out.println("eligible for scholarship 100%");
	     }
	     else {
	    	 System.out.println("not eligible for scholarship");
	     }
	}

}
