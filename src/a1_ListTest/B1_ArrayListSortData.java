package a1_ListTest;

import java.util.ArrayList;
import java.util.Collections;

public class B1_ArrayListSortData {
	
	public static void main(String[] args) {
		
	
	ArrayList a= new ArrayList();
	a.add("Sharmila");
	a.add("Sunaina");
	a.add("Nakul");
	a.add("shaabbaaa");
	a.add("2022");
	a.add("today is dec 3");
	a.add("learning is my new hobby now");
	
	// System.out.println(a); - prints the value in single row
	
	System.out.println("before sort");
	for  (Object o : a) {
		System.out.println(o);
	}

	System.out.println("---------");
	Collections.sort(a);
	System.out.println("after sort");
	for  (Object o : a) {
		System.out.println(o);
	}

	
}
}
