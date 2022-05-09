package basicPrograms;

public class Polymorphism_class3 extends Polymorphism_class2 {

	// Method name is multiply with int as return type, with 2 parameters and present in child class
	public int multiply(int a, int b) {
		int c = a * b;
		System.out.println("Method implementation from Polymorphism_3 class and multiplication value is " + c);
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_class3 obj = new Polymorphism_class3();

		// display method is inherited from the parent class i.e. Polymorphism_2
		obj.display();

		// multiply method is current class' method
		obj.multiply(4, 4);
	}

}
