package basics;

public class Variable {
	
	int ab = 10;//instance variable
	static int ef=15;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable is container that saves values
		/*ab, bc, ef- variable name
		type of variables
		1.local variables
		2.instance variables
		3.static variables*/

		int bc=12;// local variables
		System.out.println("local variable " +bc);	
		System.out.println("static variable "+ef);
	    Variable obj = new Variable();//object creation
	    System.out.println("instance variable "+obj.ab);
	  
	}

}
