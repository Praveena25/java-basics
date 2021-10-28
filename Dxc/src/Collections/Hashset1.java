package Collections;

import java.util.HashSet;

public class Hashset1 {  
	public static void main(String args[]){  
		HashSet<String> s=new HashSet<String>();  
		s.add("Ramya");  
		s.add("Vijay");  
		s.add("Arun");  
		s.add("Sumit");  
		System.out.println("An initial list of elements: "+s);  
		//Removing specific element from HashSet  
		s.remove("Ramya");  
		System.out.println("After invoking remove(object) method: "+s);  
		HashSet<String> s1=new HashSet<String>();
		s.add("praveena");
		s.add("manasa");
		s1.add("priya");
		System.out.println("Updated List: "+s);  
		System.out.println("Updated List: "+s1); 
		s.removeAll(s1);  
		System.out.println("After invoking removeAll() method: "+s);  

		s.removeIf(str->str.contains("Vijay"));    
		System.out.println("After invoking removeIf() method: "+s);    
		s.clear();  
		System.out.println("After invoking clear() method: "+s);  
	}  
}
