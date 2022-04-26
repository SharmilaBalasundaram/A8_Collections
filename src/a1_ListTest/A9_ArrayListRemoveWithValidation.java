package a1_ListTest;

import java.util.ArrayList;

public class A9_ArrayListRemoveWithValidation {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add("Sharmila");
		a.add("Sunaina");
		a.add("Nakul");
		a.add("shaabbaaa");
		a.add("2022");
		a.add("today is dec 3");
		a.add("learning is my new hobby now");

		System.out.println("Before removal of an array" + a);

		System.out.println("------------------------------");

		if (!a.isEmpty()) {
			if (a.contains("2022")) {
				int index = a.indexOf("2022");
				a.remove(index);
				System.out.println("After removal of array" + a);
			}
		}
	}

}
