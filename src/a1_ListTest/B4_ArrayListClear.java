package a1_ListTest;

import java.util.ArrayList;

public class B4_ArrayListClear {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add("Sharmila");
		a.add("Sunaina");
		a.add("Nakul");
		a.add("shaabbaaa");
		a.add("2022");
		a.add("today is dec 3");
		a.add("learning is my new hobby now");

		System.out.println(a.size());
		a.clear();
		System.out.println(a.size());
		System.out.println(a.isEmpty());
	}

}
