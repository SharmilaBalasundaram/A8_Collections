package a1_ListTest;

import java.util.ArrayList;

public class A6_ArrayListIndexOf {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add("Sharmila");
		a.add("Sunaina");
		a.add("Nakul");
		a.add("shaabbaaa");
		a.add("2022");
		a.add("today is dec 31,2021");
		a.add("Nakul");
		a.add("2022");
		a.add("today is dec 31,2021");
		a.add("Nakul");

		System.out.println(a.indexOf("Nakul")); // multiple same data, but provides first index
		System.out.println(a.lastIndexOf("Nakul")); // it checks from last index

	}

}
