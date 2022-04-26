package a1_ListTest;

import java.util.ArrayList;
import java.util.List;

public class B8_ArrayLisWithouttIndexTest {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add("Apple");
		a.add("Banana");
		a.add("Orange");
		a.add("Mango");
		a.add("Strawberry");
		a.add("Blueberry");
		a.add("Jackfruit");
		
		for (int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		
	}
}
