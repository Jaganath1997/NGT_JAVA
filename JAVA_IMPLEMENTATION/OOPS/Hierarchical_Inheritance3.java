package basicPrograms;

public class Hierarchical_Inheritance3 extends Hierarchical_Inheritance1 { // Daughter class

	public void daughterInitial() {
		System.out.println("Daughter's initial is " + father_name.charAt(0));
	}

	public void daughterName() {
		System.out.println("Daughter's name is " + father_name.charAt(0) + " Divya");
	}
}
