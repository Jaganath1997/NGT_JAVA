package basics;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//!-not, &&-and, ||-or
	    int a1=20;
	    int a2=30;
	    boolean a3= a1>40;
	    boolean a4= a2>10;
	    boolean a5= a1>10;
	    boolean a6= a2<10;
	    
	    System.out.println(a3&&a4);//and operator
	    System.out.println(a4&&a5);
	    
	    System.out.println(a3||a4);//or operator
	    System.out.println(a3||a6);
	    
	    System.out.println(!(a3&&a4));//not operator 
		
	}

}
