package basicPrograms;

public class Test_Hierarchical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Object created for Child class 1
		Hierarchical_Inheritance2 sonObj = new Hierarchical_Inheritance2();
		sonObj.fatherHeight(); // Parent class method
		sonObj.sonInitial();   // Child class 1 method
		sonObj.sonName();      // Child class 1 method

		// Object created for Child class 2
		Hierarchical_Inheritance3 daughterObj = new Hierarchical_Inheritance3();
		daughterObj.daughterInitial(); // Child class 2 method
		daughterObj.daughterName();    // Child class 2 method
	}

}
