package a1_ListTest;

import java.util.ArrayList;
import java.util.List;

public class B9_ArrayListWithIndexTest {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(0,"Apple");
		a.add(1,"Banana");
		a.add(2,"Orange");
		a.add(3,"Mango");
		a.add(4,"Strawberry");
		a.add(5,"Blueberry");
		a.add(6,"Jackfruit");
		a.add(7,null);
		
		for (int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		
	}
}
