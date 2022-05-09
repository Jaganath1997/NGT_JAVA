package basicPrograms;

public class Test_Single_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating object for child class
		Single_Inheritance2 object = new Single_Inheritance2();
		
		object.hands(); // Parent class method
		object.head();  // Parent class method
		object.name();  // Child class method
		object.dance(); // Child class method

	}

}
