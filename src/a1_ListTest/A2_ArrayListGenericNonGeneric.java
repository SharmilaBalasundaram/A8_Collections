package a1_ListTest;

import java.util.ArrayList;

public class A2_ArrayListGenericNonGeneric {
	
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Sharmila");
		//a.add(10); - error
		//a.add(1.5); - error
		//a.add('a'); - error
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(10);
		//b.add("Sharmila");  - compile time error
		
		ArrayList c= new ArrayList();
		c.add("Sharmila");
		c.add(10); 
		c.add(1.5); 
		c.add('a');
		
		System.out.println(a.get(0));
		System.out.println(b.get(0));
		System.out.println(c.get(2));

		
	}

}
