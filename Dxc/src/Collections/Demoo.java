package Collections;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;

public class Demoo {
	public static void main(String[]args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("praveena");
		ar.add("Govind");
		//ArrayList<String> list;
		Iterator<String> i=ar.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
