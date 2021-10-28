
	package Collections;

import java.util.*;

	public class Treeset {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Stack <String> stack=new Stack <String>();
			SortedSet <String>s = new TreeSet<String>();  

			s.add("auto");  
			s.add("car");  
			s.add("bus");  
			s.add("car");  
			s.add("car");
			s.add("cycle");
			Iterator<String> itr=s.iterator();  
			while(itr.hasNext()){  
				System.out.println(itr.next());
			}
		}
	}


