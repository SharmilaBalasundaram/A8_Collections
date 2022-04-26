package a1_ListTest;

import java.util.ArrayList;
import java.util.List;

public class B7_ArrayListSubList {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add("Apple1");
		a.add("Apple2");
		a.add("Banana3");
		a.add("Banana4");
		a.add("Orange5");
		a.add("Orange6");
		a.add("Mango7");
		a.add("Strawberry8");
		a.add("Blueberry9");
		a.add("Jackfruit10");
		
		List subList = a.subList(6, 10);
		System.out.println(subList);
		
		
	}
}
