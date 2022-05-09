package basics;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> shapes =new LinkedHashMap<>();
		shapes.put("red", "square");
        shapes.put("green", "circle");
        shapes.put("orange", "rectangle");
        shapes.put("blue", "oval");
        shapes.put("black", "triangle");
        System.out.println(shapes);
	}

}
