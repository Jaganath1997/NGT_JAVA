package basicPrograms;

/*The ability of the same method to perform differently at different instances is known as Polymorphism. 
Poly = Many ; morphism = forms*/

/*Polymorphism can be achieved by two methods. They are :
	1. Method Overloading
	2. Method Overriding*/

/*This program contains program for Method Overloading.*/

/*Method Overloading can be defined as a class containing 2 or more methods with same name but with difference
in parameters or return types or no.of.parameters, all the methods will execute in the order they have
been called.*/

public class Polymorphism_class1 {
	
	// The method name is "sub" but different in return type and no.of.parameters
	public int sub(int a, int b, int c) {
		int d = c-b-a;
		return d;
	}
	
	// The method name is "sub" here too, but different in return type and no.of.parameters 
	public double sub(double m, double n) {
		double z = m-n;
		return z;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_class1 overloading_object = new Polymorphism_class1();
		
		// Method 1
		System.out.println("The subtraction method 1's result is " + overloading_object.sub(10, 90, 190));
		
		// Method 2
		System.out.println("The subtraction method 2's result is " + overloading_object.sub(5.25, 10.785));
	}
	
}
