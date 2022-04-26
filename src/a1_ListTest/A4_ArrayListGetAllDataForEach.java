package a1_ListTest;

import java.util.ArrayList;

public class A4_ArrayListGetAllDataForEach {
	
	public static void main(String[] args) {
		
		ArrayList a= new ArrayList();
		a.add("Sharmila");
		a.add("Sunaina");
		a.add("Nakul");
		a.add("shaabbaaa");
		a.add("2022");
		a.add("today is dec 31,2021");
		
		System.out.println(a.size());
		
		for (int i=0; i<a.size();i++){
			System.out.println(a.get(i));
		
		}
		
	 for (Object objvar : a) {
			System.out.println(objvar);
		}
		
	}

}
