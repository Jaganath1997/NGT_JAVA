package basicPrograms;

public class Test_Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating object for grand child class
		Multilevel_Inheritance3 obj = new Multilevel_Inheritance3();

		obj.run();  // Parent class method
		obj.name(); // Child class method
		obj.roar(); // Child class method
		obj.child_name(); // Grand child method
		
	}

}
