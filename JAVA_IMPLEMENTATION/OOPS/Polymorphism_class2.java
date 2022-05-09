package basicPrograms;

/*The ability of the same method to perform differently at different instances is known as Polymorphism. 
Poly = Many ; morphism = forms*/

/*Polymorphism can be achieved by two methods. They are :
	1. Method Overloading
	2. Method Overriding*/

/*This program contains program for Method Overriding.*/

/*Across 2 or more classes, 2 or more methods with same name, same return type, same no.of.parameters, in 
parent and child class, the child class method will override the parent class method.*/

public class Polymorphism_class2 {

	public void display() {
		System.out.println("Class 1 display method");
	}

	// Method name is multiply with int as return type and with 2 parameters and present in parent class
	public int multiply(int a, int b) {
		int c = a * b;
		System.out.println("Method implementation from Polymorphism_2 class and multiplication value is " + c);
		return c;
	}

}
