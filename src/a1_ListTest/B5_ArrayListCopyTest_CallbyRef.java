package a1_ListTest;

import java.util.ArrayList;

public class B5_ArrayListCopyTest_CallbyRef {
	
	public static void main(String[] args) {
		
		ArrayList a= new ArrayList();
		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		a.add("5");

		ArrayList b=a;
		
		b.remove(3);
		
		for (Object o:a){
			System.out.println("The value of a is :"+o);
		}
		
		System.out.println("-------");
		
		for (Object o:b){
			System.out.println("The value of b is :"+o);

		}
		
	}
	

}
