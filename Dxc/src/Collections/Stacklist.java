package Collections;

import java.util.Iterator;
import java.util.Stack;

public class Stacklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stack <String> stack=new Stack <String>();
		Stack <String> stack = new Stack<String>();  

		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());
		}
	}
}
