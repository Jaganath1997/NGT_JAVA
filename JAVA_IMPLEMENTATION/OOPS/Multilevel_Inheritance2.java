package basicPrograms;

public class Multilevel_Inheritance2 extends Multilevel_Inheritance1 { // Child class

	/* Let's take Lion as an example animal */

	String animal = "Lion";
	
	public void name() {
		System.out.println(animal + " is an animal");
	}

	public void roar() {
		System.out.println(animal + " can roar");
	}

	public void king() {
		System.out.println(animal + " is the King of the jungle");
	}

}
