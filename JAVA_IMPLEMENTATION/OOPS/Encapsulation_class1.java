package basicPrograms;

/*Encapsulation in Java is used to wrap the data and functions into a single unit. It can be achieved
by using "getters" and "setters"*/

/*Here, in this program I have taken an imaginary scenario of ATM center and have written methods based on 
it. The scenario is my friend is trying to access my ATM card and all the possiblities are written
down below.*/

public class Encapsulation_class1 {

	private int pinNumber = 2000;

	// getter -> If my friend can know my previous pin number :
	public int getPinNumber() {
		System.out.println("The ATM pin number is " + pinNumber);
		return pinNumber;
	}

	// getter -> If I don't want my friend to know my previous pin number :
	/*
	 * private int getPinNumber() {
	 * System.out.println("The ATM pin number is "+pinNumber); 
	 * return pinNumber; 
	 * }
	 */

	// setter -> If my friend can change my pin number :
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		System.out.println("The new ATM pin number is " + this.pinNumber);
	}

	// setter -> If I don't want my friend to change my pin number :
	/*
	 * private void setPinNumber(int pinNumber) { 
	 * this.pinNumber=pinNumber;
	 * System.out.println("The new ATM pin number is " + this.pinNumber); 
	 * }
	 */

}
