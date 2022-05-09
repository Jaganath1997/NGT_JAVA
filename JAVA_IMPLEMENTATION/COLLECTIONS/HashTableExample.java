package basics;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  Hashtable<Integer,String> map=new Hashtable<Integer,String>();    
		  map.put(100,"Abc");    
		  map.put(102,"Def");    
		  map.put(101,"Ghi");    
		  map.put(103,"Jkl");    
		    
		  for(Map.Entry m:map.entrySet()){    
		   System.out.println(m.getKey()+" "+m.getValue());    
		  }   
	}

}
