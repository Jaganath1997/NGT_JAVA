package basics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hashset
		//it is unordered
        //it cannot store duplicate value
        Set<Integer> hashset = new HashSet<>();
        hashset.add(11);
        hashset.add(20);
        hashset.add(2);
        hashset.add(2);
        hashset.add(13);
        hashset.isEmpty(); // return boolean value
        hashset.contains(2); //returns boolean value if it is true
        hashset.remove(13);
       
        System.out.println(hashset);
        //treeset
        //ordered set
        //it will remove the duplicate value 
        Set<Integer> treeset = new TreeSet<>();
        treeset.add(10);
        treeset.add(9);
        treeset.add(8);
        treeset.add(7);
        treeset.add(7);
        treeset.isEmpty(); // return boolean value
        treeset.contains(9); //returns boolean value if it is true
        treeset.remove(10);
        System.out.println(treeset);
        //linkedhashset
        //maintain insertion order
        LinkedHashSet<String> lhset=new LinkedHashSet();  
        lhset.add("One");    
        lhset.add("Two");    
        lhset.add("Three");   
        lhset.add("Four");  
        lhset.add("Five");  
        System.out.println(lhset);
        
	}

}
