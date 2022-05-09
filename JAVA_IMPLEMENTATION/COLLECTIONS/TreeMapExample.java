package basics;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		  map.put(100,"Abc");    
		  map.put(102,"Def");    
		  map.put(101,"Ghi");    
		  map.put(103,"Jkl");    
		    
		  for(Map.Entry m:map.entrySet()){    
		   System.out.println(m.getKey()+" "+m.getValue());    
		  }    
	}

}
