package Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import java.util.Iterator;
/*
 * Sets interface extends collection interface
 * Sets are used to store the unordered set of elements, which does not allow us to store the duplicates 
 * Set interface is implemented by Hashset, Treeset and LinkedHashset
 * 
 * 
 * 
 */
public class SetInterface {

	public static void main(String[] args) {
		
		//Set<String> s1 = new HashSet<>();
		
		Set<String> s2 = new LinkedHashSet<>();
		
		Set<String> s3 = new TreeSet<>();
		
		
		//Hashset: It is implemented using hashtable for storage. This uses hashcode for placing elements in any specific location
		Set<String> s1 = new HashSet<>();
		s1.add("Hi");
		s1.add("Hi");
		s1.add("Hi");
		s1.add("Hi");
		s1.add("Hi");
		s1.add("Hi hello");
		//Use Iterator from iterable interface for printing the set content
		
		Iterator<String> iterator = s1.iterator();
		
		for(String s: s1) {
			System.out.println(s);
			
			
		}
		
		while(iterator.hasNext()) {
			   Object str = iterator.next(); 
			   System.out.println(str); 
			  
		}
	
	
	
	}

}
