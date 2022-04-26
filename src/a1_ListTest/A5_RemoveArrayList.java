package a1_ListTest;

import java.util.ArrayList;

public class A5_RemoveArrayList {
	
	public static void main(String[] args) {
		
		ArrayList a= new ArrayList();
		
		a.add("Sharmila");
		a.add("Sunaina");
		a.add("Nakul");
		a.add("shaabbaaa");
		a.add("2022");
		a.add("today is dec 3");
		a.add("learning is my new hobby now");
		
		System.out.println("Before removal array size:"+a.size());
		
		for (Object objvar : a) {
		System.out.println(objvar);	
		}
		
		System.out.println("----------------");

		a.remove(3);
		
		System.out.println("After removal array size:"+a.size());
		
		 for (Object objvar : a) {
			System.out.println(objvar);
		}
		
	}

}
