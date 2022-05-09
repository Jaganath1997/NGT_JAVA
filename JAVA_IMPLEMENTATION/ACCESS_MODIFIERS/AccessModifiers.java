package basics;

class addition{
	private int number1=10;
	//it can be accessed only within the class by making it private
	public int number2=15;
	//it can be accessed within and outside the class as well as within and outside the package.
	void add() 
	//make a method default and accessed within the package and not outside the package.
	{
	System.out.println(number1);
	}
	//you cannot create the instance outside the class it will show compile time error
	private void add1() {
		
	}
	//its accessed through only child class within or outside the package
	protected void add2() {
		int number3= 20;
		System.out.println(number3);
	}
}
class subraction extends addition{
	 public void sub() {
		 
	 }
}
public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition obj =new addition();
		//System.out.println(obj.number1);
        // compile time error occurs because the number1 is not visible
		System.out.println(obj.number2);
		obj.add();
		//instance of child class
		subraction obj1 = new subraction();
		obj1.add2();
	}

}
