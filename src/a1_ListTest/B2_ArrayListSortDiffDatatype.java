package a1_ListTest;

import java.util.ArrayList;
import java.util.Collections;

public class B2_ArrayListSortDiffDatatype {

	public static void main(String[] args) {
		
		ArrayList a= new ArrayList();
		a.add("Sharmila");
		a.add(23);
		a.add(1.4);
		a.add(true);
		
		Collections.sort(a);
		for (Object o : a){
			System.out.println(o);
		}
		
		
		
	}
}
