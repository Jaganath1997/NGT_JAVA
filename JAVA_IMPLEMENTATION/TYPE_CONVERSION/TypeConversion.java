package basics;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit or type conversion
		// converting lower data type to higher data type
        short a1=5;
        long a2 = a1;
        System.out.println(a2);
        // explicit or type casting
        // converting higher data type to lower data type
        long a3=15;
        //short a5=a3; shows compile time error
        int a4 =(int)a3;
        System.out.println(a4);
	}

}
