package a1_ListTest;

import java.util.ArrayList;

public class B3_ArrayListAddAll {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add("Sharmila");
		a.add("Sunaina");
		a.add("Nakul");
		a.add("shaabbaaa");
		a.add("2022");
		a.add("today is dec 3");
		a.add("learning is my new hobby now");

		ArrayList b = new ArrayList();
		b.add(1);
		b.add(2);
		b.add(3);

		a.addAll(b);

		for (Object o : a) {
			System.out.println(o);
		}
	}

}
