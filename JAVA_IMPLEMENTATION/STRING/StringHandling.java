package basics;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//collection of characters
		//string is immutable(when it is altered it will take a new memory space rather than old one)
		//string buffer makes the string mutable which can be used with multiple threads
		//and thread safe, synchronized methods.
		
		StringBuffer sb = new StringBuffer("jagan");
		System.out.println("buffer case :");
		sb.append("ath");
		System.out.println(sb);
		sb.replace(5, 9, " G17");
		System.out.println(sb);
		sb.delete(7, 9);
		System.out.println(sb);
		
		//string buffer is same as string builder
		StringBuilder sb1 = new StringBuilder("jagan");
		System.out.println("builder case :");
		sb1.append("ath");
		System.out.println(sb1);
		sb1.replace(5, 9, " G17");
		System.out.println(sb1);
		sb1.delete(7, 9);
		System.out.println(sb1);
	}

}
