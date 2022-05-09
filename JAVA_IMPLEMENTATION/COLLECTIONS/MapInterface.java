package basics;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        HashMap<String, String> shapes = new HashMap<>();
        //hashmap
        //key should be unique &value can be duplicated
        //not ordered contains value based on key
        shapes.put("red", "square");
        shapes.put("green", "circle");
        shapes.put("orange", "rectangle");
        shapes.put("blue", "oval");
        shapes.put("black", "triangle");
        //getting value using key
        System.out.println(shapes.get("orange"));
        //getting all values using variable
        System.out.println(shapes);
        //getting the value using for loop
        for(Map.Entry match : shapes.entrySet()) {
        	System.out.println(match.getKey() +" \t: "+match.getValue());
        }
        shapes.containsKey("red");
        shapes.containsValue("square");
        System.out.println(shapes.size());
        shapes.remove("black");
        //shapes.clear();
        System.out.println(shapes);
	}

}
