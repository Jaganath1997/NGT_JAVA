package basicPrograms;

public class Multilevel_Inheritance3 extends Multilevel_Inheritance2 { // Grand child class
	
	/* Let's take cub as an example here */
	
	String child_animal = "Cub";
	
	public void child_name() {
		System.out.println(animal + " is " + child_animal + "'s" + " father");
	}

}
