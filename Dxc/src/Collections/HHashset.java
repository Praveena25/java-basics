package Collections;

import java.util.*;

public class HHashset {
	public static void main(String []args)
{

	    HashSet<String> s=new HashSet();  
	           s.add("O");    
	           s.add("T");    
	           s.add("s");   
	           s.add("F");  
	           s.add("a");  
	           Iterator<String> i=s.iterator();  
	           while(i.hasNext())  
	           {  
	           System.out.println(i.next());  
	           }  
	 }  

}