package basics;

class constructor{
	  int m1,m2,m3;
	  //default constructor
	  public constructor() {
		  m1=10;
		  m2=7;
		  System.out.println(m1+m2);;
	  }
	  //parameterized constructor
	  public constructor(int m1,int m2) {
		  System.out.println(m1-m2);
	  }
	  //constructor overloading
	  public constructor(int m1,int m2,int m3) {
		  System.out.println(m1*m2*m3);
	  }  
}

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constructor s =new constructor();
        //constructor s =new constructor(10,5);
		constructor s =new constructor(5,5,5);	
	}

}
