package a1_ListTest;

import java.util.ArrayList;
import java.util.List;

public class C2_ArrayListSwapIndexTest {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add("Apple");
		a.add("Banana");
		a.add("Orange");
		a.add("Mango");
		a.add("Strawberry");
		a.add(6,"Blueberry");  // - error
		a.add("Jackfruit");  

		// not accept, since it will take the 5th index as empty
		//(have chance we may not create any value after then)
		
		for (int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		
	}
}
