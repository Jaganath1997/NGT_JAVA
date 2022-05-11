package Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class mapToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("a", 1);
		hashMap.put("b", 2);
		hashMap.put("c", 3);
		hashMap.put("d", 4);
		hashMap.put("e", 5);
		List <String> key =new ArrayList<>(hashMap.keySet());
		System.out.println(key);
		List <Integer> value =new ArrayList<>(hashMap.values());
		System.out.println(value);
		}
	}


