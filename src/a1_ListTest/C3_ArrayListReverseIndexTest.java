package a1_ListTest;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayListReverseIndexTest {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add("Apple");
		a.add("Banana");
		a.add("Orange");
		a.add("Mango");
		a.add("Strawberry");
		a.add("Blueberry");
		a.add(5,"Jackfruit");  // we can swap last value to before index
		// so that previous index value will push out to last location
		
		for (int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		
	}
}
