package a1_ListTest;

import java.util.ArrayList;
import java.util.List;

public class C1_ArrayListPartialIndexTest {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add("Apple");
		a.add("Banana");
		a.add("Orange");
		a.add(3,"Mango");
		a.add(4,"Strawberry");
		a.add(5,"Blueberry");
		a.add(6,"Jackfruit");
		
		for (int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		
	}
}
