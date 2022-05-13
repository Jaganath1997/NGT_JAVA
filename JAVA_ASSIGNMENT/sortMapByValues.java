package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class sortMapByValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> fruits = new HashMap<>();
		fruits.put("apple", 70);
		fruits.put("orange", 80);
		fruits.put("mango", 50);
		fruits.put("banana", 10);
		fruits.put("grapes", 40);
	
		System.out.println("Original Map: ");
		
		fruits.forEach((k,v)->System.out.println(k+"  "+v));
		
		Set<Entry<String, Integer>> entrySet = fruits.entrySet();
		
		List<Entry<String, Integer>> list = new ArrayList<>(entrySet);
		
		Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		
		System.out.println("Map sorted based on Values: ");
		
		list.forEach(s->{System.out.println(s.getKey()+"\t"+s.getValue());});
	}
}
