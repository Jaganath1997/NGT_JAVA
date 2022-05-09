package basicPrograms;

public class Single_Inheritance2 extends Single_Inheritance_1{ // Child class 
	
	/*
	 * Let's take a human called Abhishek and Abhishek inherits all the properties
	 * of humans and he has his own properties too
	 */
	
	String name = "Abhishek";
	
	public void name() {
		System.out.println("Human's name is " + name);
	}
	
	public void dance() {
		System.out.println(name + " can dance");
	}
	
	public void drive() {
		System.out.println(name + " can drive");
	}

}
